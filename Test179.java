/*	
	178 �ڵ忡 ���� ��! ( �ڵ�� ������ �� �Բ� �ܿ쵵�� �ϼ���. �װ� �� �ΰ� �����ϴ� )
*/

class FuelException extends Exception {}
class BreakException extends Exception {}

class Car {
	private int fuel = 5;
	public void drive( boolean stopper ) throws FuelException, BreakException {
		fuel--;
		if( fuel == 1 ) {
			throw new FuelException();
		}
		if( stopper == false ) {
			throw new BreakException();
		}
		System.out.println("���� 1���� �Ҹ� : GOGO");
	}
}

public class Test179 {
	public static void main( String[] args ) {
		Car car =  new Car();
		try {
			car.drive( true );
			car.drive( true );
			car.drive( false );
		}
		catch( Exception e ) {
			System.out.println( e.toString() );
		}
	}
}