// ������ ��ü�� ���� �ڵ� 
interface IFuelObs {
	public void onFuelChange( int fuel );
}

class Car {
	// ������ ��ü�� ���� �ڵ� ����
	private IFuelObs obs = null;
	public void setFuelObs( IFuelObs o ) { 
		obs = o; 
	}
	// ������ ��ü�� ���� �ڵ� ��
	
	private int fuel = 3;
	
	public void drive() {
		fuel--;
		// ������ ��ü�� ���� �ڵ� 
		if( obs != null ) {
			obs.onFuelChange( fuel );
		}
		// ������ ��ü�� ���� �ڵ� 
		
		System.out.println("���� 1L �Ҹ�");
	}
}

// ������ ��ȭ�� ����� �ܷ��� ����ִ� Ŭ����
class FuelGauge implements IFuelObs {
	public void onFuelChange( int fuel ) {
		System.out.println(">>" + fuel );
	}
}

public class Test168 {
	public static void main( String[] args ) {
		Car car = new Car();
		car.setFuelObs( new FuelBomb() );
		
		car.drive();
		car.drive();
		
		car.setFuelObs( null );
		car.drive();
	}
}

class FuelBomb implements IFuelObs {
	public void onFuelChange( int fuel ) { 
		if( fuel == 1 ) {
			System.out.println("��ź����");
			System.exit(0);
		}
	}
}
/*	������ ��Ȳ�� üũ�ϴ� �ڵ带 �ֵ� ... �����ϰ� ��ü�����ϵ��� ���� �� ������?
	����� ������ Ŭ������ ����ϸ� Car �� �����Ǵٰ� �ʿ� ���� ��� ���ų� ��ü �� �� �ִ�.
	
	Car �� FuelGauge �� ������ Ŭ������ �������.
	�� �� IFuelObs �� �̿��ϴµ� ... 
	
	Car�� ���°� ����Ǵ� ���� Gauge �� �뺸�ϰ� �ִ�.
	'�̷��� ���� ����� ������ ���� ( Observer Pattern ) �̶�� �Ѵ�.'
	'��������� ��ȭ�� �����ڿ��� �뺸�ϴµ� �� ���� ������ �и��ǰ� ��ü�����ϰ� ����ȴ�.'
	'�����ڴ� ��ü�����ϰ� , ���� ����� ��Ȳ�� �´� �ڵ�� ���� ����� �� �ִ�'
	
	FuelGauge -> FuelBomb ��ü�ص� �� �����ϴ��� ...
*/