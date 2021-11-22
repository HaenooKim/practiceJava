class A {
	A() {
		System.out.println("A Constructor");
	}
}

class B extends A {
	B() {
		System.out.println("B Constructor");
	}
}

public class Test091 {
	public static void main(String[] args) {
		new B();
		//t.B() ->불가능 (생성자는 멤버함수가 아니다.)
	}
}

/*
	자손의 인스턴스를 생성하면 조상의 생성자 부터 자손의 생성자가 차례로 호출된다.
	
	그럼 생성자가 상속되는 개념인것인가?
	-> 생성자는 멤버함수가 아니다 상속되지 않는다. 포인터로도 접근불가. 다만 인스턴스 생성시 호출될 뿐이다.
*/