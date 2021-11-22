abstract class Temp {
	abstract public void print();	
}

class Temp2 extends Temp {
	public void print() {
		System.out.println("HelloWorld");
	}
}

public class Test102 {
	public static void main(String[] args) {
		Temp t = new Temp2();
		t.print();
		
	}
}

/*
	abstract : 인스턴스를 만들 수 없는 클래스
	abstract method : 선언되었지만 정의되지 않은 메소드
	클래스로 하는 일 : 참조형 변수 선언, 인스턴스 생성, 상속받아 클래스 선언
	
	abstract method : 선언되었지만 정의되지 않은 메소드
	abstract 메소드를 한가
	
	지라도 가졌으면 반드시 abstract class로 설정해야함
	오버라이딩 하면 abstract가 떨어져 나간다.
	
	abstract class를 활욜할 때 [A t = new B()]형태로 쓰는 경우가 굉장히 많음.
	
	
	java의 경우 실은 내부적으로 함수포인터를 이용한 호출을 사용하고 잇는데
	abstract method는 함수포인터에 null값이 들어있는 함수에 해당한다.
	abstract method를 가진 클래스가 abstract가 되어야 하는 이유? 인스턴스가 존재하면 안된다.
	(null 값이 들어잇는 함수포인터로 함수 호출하면 큰일난다.)
	
	오버라이딩의 정체는 ? 조상에서 선언된 함수포인터가 자손에서 선언한 함수 실체를 가리키는 것.
	 abstract method를 오버라이딩 하면? null값 들어간 함수포인터가 새로운 실체를 가리키게된다.
	 null값은 날아간다. - abstract한 성질이 없어진다.
	
*/