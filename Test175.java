class 배째기 extends RuntimeException {
	
}

class 등따기 extends RuntimeException {
	
}



class 신입 {
	public void 일 (int 시간당) { //이게 RuntimeException이면 throws 배째기, 등따기를 안해줘도되지만 Exception을 상속할 경우 반드시 명시해야함.(엄격한 기준이기 때문)
		System.out.println("넹넹");
		
		double rand = Math.random();
		
		if (rand < 0.3 && 시간당 < 7) {
			throw new 배째기(); //해당 인스턴스를 만들고 throw를 한다.
		} 
		else if (rand < 0.5 && 시간당 < 5) {
			throw new 등따기();
		}
		
		System.out.println("끝났습니다."); //예외발생시 실행되지않음
	}
}

public class Test175 {
	public static void main(String[] args) {
		신입 kim = new 신입();
	
		
		kim.일(4);
		
		System.out.println("수고했습니다.."); //예외발생시 실행하지않음
		
	}
}

/*
	- try~ catch없어도 컴파일은 됨. 다만 실행하다가 에러나면 프로그램이 종료됨
	- 예외가 발생하면 그 이하의 코드는 수행하지 않는다. (함수 안이든 밖이든 실행하지 않음) 
	
*/