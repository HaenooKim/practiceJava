class A {
	int data = 100;
	
	void print() {
		System.out.print("A print");
	}
}

/* 클래스로 부터 물려받으면 함수포인터를 물려받는데, 자손에서 똑같이 선언되는 경우에는
	새로운 포인터를 만들지 않고 기존의 포인터가 자손에서 선언된 실체를 가리키게 된다.

	조상에서 선언된 함수를 자손에서 그대로 재 정의하면 갈아엎는 형태로 구현되게 된다.
	method overriding이라고 한다.
*/	

class B extends A {
	int data = 200;
	
	
	
	void print() {
		System.out.print("B print");
	}
}



public class Test086 {
	public static void main(String[] args) {
		B t = new B();
		t.print();
		
		A t2 = new A();
		t2.print();
	}
}