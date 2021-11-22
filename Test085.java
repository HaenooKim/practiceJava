class A {
	int data = 0;
	void print() {
		System.out.println("print " + data);
	}
}

class B extends A{ 
	//A가 가지고 있는 멤버 변수와 함수를 가지고 온다. ->상속
	//class B는 class A로 부터 상속받았다. A는 B의 조상클래스, B는 A의 자식클래스
		
	
	
	//물려받은 동시에 변수와 함수 선언을 할 수 있다.
	void print2() {
		System.out.println("print2");
	}
}


public class Test085 {
	public static void main(String[] args) {
		A t = new A();
		t.data = 100;
		t.print();
		
		// 조상에서 선언된 함수 변수, B에서 선언된 함수 변수 모두 사용가능.
		B r = new B();
		r.data = 200;
		r.print();
		r.print2();
	}
}


/*
	객체지향 언어의 3대 특징
	1. 상속성 - 클래스를 상속받아 클래스를 만든다.
	2. 은닉성 - 감추고자하는 것들을 감출 수 있어야 한다.
	3. 다형성 - 하나의 심볼(이름-변수명 함수명)이 다양한 대상에 접근할 수 있어야 한다.
*/