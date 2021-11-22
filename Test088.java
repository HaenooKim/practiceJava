
class A {
	
	void print() {
		System.out.println("print");
	}
	
}

class B extends A {
	void print() {
		System.out.println("printXX");
	}
	void print2() {
		System.out.println("print2");
	}
	
}


public class Test088 {
	public static void main(String args[]) {
			A t = new B();
			t.print();
			// t.print2() 는 불가능
			
			/*자료형 변수와 참조형 변수의 강제형변환은 완전히 개념읻 ㅏ르다.
			B(t); t는 타입형 변수(클래스로 선언된) 인데 이것을 B타입으로 강제 변환시키는 강제변환코드.
			이건 아무때나 다 되는 것이 아니라
			t가 가리키고 있는 인스턴스를 가리키는 B의 인스턴스에 대한 포인터를 얻어내는 코드임.
			즉 t가 가리키고 있는것을 감싸는 B의 인스턴스가 있어야만 성립됨.
			*/
			
			B t2 = (B)t;
			t2.print2();
	}

}

/*
	-목숨걸고 외워야 됨-
	조상형 변수로 자손 클래스의 인스턴스를 가리킬 수 있다.
	이 때 조상형 변수로는 조상에서 선언된 멤버(함수, 변수)민 호출 할 수 있다.
	이 때 오버라이딩 된 경우엔 오버라이딩 된 함수가 호출된다.
	
*/