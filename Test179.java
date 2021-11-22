/*	
	178 코드에 대한 답! ( 코드와 개념은 꼭 함께 외우도록 하세요. 그게 젤 싸게 먹힙니다 )
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
		System.out.println("연료 1리터 소모 : GOGO");
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