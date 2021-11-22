class 배째기 extends Exception {}

class 등따기 extends Exception {}

/*
	- RuntimeException : 문법적으로 널널하다. Exception : 문법적으로 엄격하다.
	
	- Exception을 상속받은 예외를 발생할 수 있는 함수는 선언부에 반드시 그 사실을 명시해야 한다.
	(RuntimeException은 해도되고 안 해도됨) : throws 배째기, 등따기
*/


class 신입 {
	
	public void 일 (int 시간당) throws 배째기, 등따기{ //배째기와 등따기가 일어날 수 있음을 명시
		System.out.println("넹넹");
		
		double rand = Math.random();
		
		if (rand < 0.3 && 시간당 < 7) {
			throw new 배째기();
		} 
		else if (rand < 0.5 && 시간당 < 5) {
			throw new 등따기();
		}
		
		System.out.println("끝났습니다."); 
	}
}

public class Test177 {
	public static void main(String[] args) {
		신입 kim = new 신입();
	
		try { 
			kim.일(3);
			System.out.println("수고했습니다."); 
		} 
		
		/*
			아래코드에서 Exception으로 바꾸어 놓으니 배째기와 등따기 모두에 대해서 동작하게 함.
			
			Exception e = new 배째기(); 이것이 가능하면 잡는다.
			즉 catch에 선언된 매개변수가 throw한 예외 인스턴스를 가리킬 수 있을 때  잡는다.
		
			- Throwable e = new 등따기() or new 배째기();
			- Throwable은 Exception의 조상클래스임
			예외상황이 아닌 경우에도 try catch를 이용한 코드를 만들어야 할 때가 있어서 그렇다.
			따라서 모든 try catch를 쓰는 경우는 Throwalbe로 상속받고 그 예외성황은 exception으로 받는다.
			RuntimeException은 Exception을 상속받는다.
			
			Throwable(왕조상) - Exception(조상) - RuntimeException(자식)
		*/
		
		
		catch (Throwable e) { //배째기가 발생해도 여기로오고, 등따기를 해도 여기로 온다. (Exception e)
			/*여기에 RuntimeException e는 못온다 . 왜냐하면 배째기가 Exception을 상속받아서
			RuntimeException e = new 배째기(); 가 불가능하기 때문. 
			*/
		
			System.out.println("통합대책" + e.getClass().getName());
		}
		
		System.out.println("오늘업무끝.");
		
		
	}
}

