class 배째기 extends RuntimeException {}

class 등따기 extends RuntimeException {}

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
		
		System.out.println("끝났습니다."); //예외발생시 실행되지않음
	}
}

public class Test176 {
	public static void main(String[] args) {
		신입 kim = new 신입();
		
		/*
			- 선언부에 예외발생 가능성이 명시된 함수는 호출시 반드시 try~catch영역 안에서 호출해야함
			- 즉, 위의 코드 public void 일 (int 시간당) throws 배째기, 등따기 이렇게 선언된 경우 
				kim.일(3)이 try문 밖으로 나오면 안된다는 말임
		*/
		try { 
			kim.일(3);
			System.out.println("수고했습니다."); //kim.일(..)에서 에러발생하면 실행되지않음
		} catch(배째기 e) {
			System.out.println("꿰맨다");
		}catch (등따기 e) {
			System.out.println("119콜");
		}
		
		System.out.println("오늘업무끝.");
		
		
	}
}

