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

public class Test180 {
	public static void main( String[] args ) {
		Car car =  new Car();
		//관리자
		try {
			//사수
			try { 
				//신입
				car.drive( true );
				car.drive( true );
				car.drive( false ); //1. 신입이 사고가 남.
			}
			catch (Exception e) {
				System.out.println("처리" + e.toString());
				throw e; //2. 사수가 처리를 하고 다시 던진다.(관리자에게 보고함)
			} //3. 그럼 이것은 사수가 사고친게 됨
			
			//System.out.println(",..."); //신입이 사고를 내면 나면 이 코드는 수행되지 않는다
			//근데 실행시키고 싶다면? -> 예외가 발생해도 무조건 실행하게 하는finally를 씀
			
			finally { //예외가 발생해도 무조건 실행하게 함
				System.out.println("finally");
			}
			
		}
		catch( Exception e ) {
			System.out.println("토닥토닥 " + e.toString());
		} //4. 관리자가 마지막으로 처리
	}
}

/*
	- 실전에서는 위의 코드처럼 2중 3중으로 try를 배치해서 각 역할에 맞는 코드를 배치한다.
	- try에서 예외가 발생하건 발생하지 않건 무조건 실행하는 영역은 finally에 배치한다.
*/