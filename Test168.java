// 유연한 교체를 위한 코드 
interface IFuelObs {
	public void onFuelChange( int fuel );
}

class Car {
	// 유연한 교체를 위한 코드 시작
	private IFuelObs obs = null;
	public void setFuelObs( IFuelObs o ) { 
		obs = o; 
	}
	// 유연한 교체를 위한 코드 끝
	
	private int fuel = 3;
	
	public void drive() {
		fuel--;
		// 유연한 교체를 위한 코드 
		if( obs != null ) {
			obs.onFuelChange( fuel );
		}
		// 유연한 교체를 위한 코드 
		
		System.out.println("연료 1L 소모");
	}
}

// 연료의 변화가 생기면 잔량을 찍어주는 클래스
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
			System.out.println("폭탄터짐");
			System.exit(0);
		}
	}
}
/*	연료의 상황을 체크하는 코드를 넣되 ... 유연하게 교체가능하도록 만들 수 없을까?
	연료계 역할의 클래스를 등록하면 Car 와 연동되다가 필요 없을 경우 빼거나 교체 할 수 있다.
	
	Car 와 FuelGauge 는 별도의 클래스로 만들었다.
	둘 다 IFuelObs 를 이용하는데 ... 
	
	Car의 상태가 변경되는 것을 Gauge 에 통보하고 있다.
	'이러한 설계 기법을 관찰자 패턴 ( Observer Pattern ) 이라고 한다.'
	'관찰대상의 변화를 관찰자에게 통보하는데 이 둘은 별도로 분리되고 교체가능하게 연결된다.'
	'관찰자는 교체가능하고 , 관찰 대상의 상황에 맞는 코드는 쉽게 변경될 수 있다'
	
	FuelGauge -> FuelBomb 교체해도 잘 동작하더라 ...
*/