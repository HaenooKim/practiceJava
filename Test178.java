/*
	FuelException, BreakException 두개의 예외를 엄격한 기준으로 선언
	FuelException : 연료가 1l남았을 때 발생, BreakException은 stopper가 false일 때 발생
	이것의 예외발생에 대한 처리를 하나의 catch에서 하도록 코드를 짜세요.
	
	* 예외는 함수가 호출될때 발생, 예외상황은 클래스로 정의
	* 엄격한 기준은 Exception을 상속 -> 반드시 함수 선언시 명시를 해줘야함 ex) public void 함수명(매개변수) throws 클래스명, 클래스명 ---
	
*/


class FuelException extends Exception{}
class BreakException extends Exception{}

class Car {
	private int fuel = 5;
	public void drive(boolean stopper) throws FuelException, BreakException {
		
		fuel--;
		
		if (fuel ==1) {
			throw new FuelException();
		}
		
		if (stopper == false) {
			throw new BreakException();
		}
		
		
		System.out.println("연료 1리터 소모 : GOGO");
		
		
		
	}
}


public class Test178 {
	public static void main(String[] args) {
		Car car = new Car();
		try {
			car.drive(true);
			car.drive(true);
			car.drive(true);
			car.drive(true);
			car.drive(true);
			car.drive(true);
		} 
		catch (Exception e) {
			System.out.println(e.toString());
		}
	
	}
}