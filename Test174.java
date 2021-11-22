class 배째기 extends RuntimeException {
	
}

class 등따기 extends RuntimeException {
	
}



class 신입 {
	public void 일 (int 시간당) {
		System.out.println("넹넹");
		
		double rand = Math.random();
		
		if (rand < 0.3 && 시간당 < 7) {
			throw new 배째기();
		} 
		else if (rand < 0.5 && 시간당 < 5) {
			throw new 등따기();
		}
	}
}

public class Test174 {
	public static void main(String[] args) {
		신입 kim = new 신입();
		
		/*
		에러가 날 가능성이 있는 함수호출하는 영역을 try{...}로 감싸준다.
		...안에서 배째기가 벌어졌을 때 처리하는 코드는 catch(배째기 e) {...}에 둔다.
		*/
		try {
			kim.일(3);
		} catch(배째기 e) {
			System.out.println("꿰맨다");
		}catch {등따기 e} {
			System.out.println("119콜");
		}
		
		
	}
}

/*
	예외처리 : 프로그램 동작시 오류를 처리하는 바법
	
	1. 함수가 호출될때 오동작은 발생한다.
	2. 각종 예외상황은 클래스로 정의된다. (extends RuntimeException)
	3. 예외상황이 발생되면 해당 예외상황에 해당하는 클래스의 인스턴스를 만들고 그것을 던진다.
	4. 던져진 예외는 catch되지 않으면 프로그램은 종료된다.
	(오동작이 발생하면 그에 대한 처리를 하지 않으면 프로그램은 종료)
	5. 적절히 처리된 오동작은 마치 없었다는 듯이 프로그램은 수행을 계속한다.
*/