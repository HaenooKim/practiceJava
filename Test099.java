
class A {
	
}

class B extends A {
	void print() {
		
	}
}


public class Test099 {
	public static void main(String[] args) {
		A t new A();
		t.print();
		// B t2 = (B)t; -> 실행 시 에러가 난다.
		
		A t2 = new B();
		B t3 = new (B)t2;
	}
}

/*
	컴파일 할 때 나는 에러가 있고 실행할 때 나는 에러가 있음.
	참조형변수 instanceof 클래스 : 참조형변수가 가리키는 대상을 클래스로 캐스팅 가능하면 true / false
*/