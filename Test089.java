class A {
	int data = 100;
}

class B extends A {
	int data = 200;
}

public class Test089 {
	public static void main(String[] args) {
		A t = new B();
		System.out.println(t.data);
		
		//멤버변수는 오버라이딩 개념이 없다! 그래서 200이 아닌 100이 출력됨.
		//조상에서 선언된 이름의 변수를 절대 자손에서 쓰지 말라. 문법에러는 없지만 망한다.
		
		B t2 = (B)t;
		// 같은 이름의 변수가 2개 있으면 자신(B)안에서 선언된 것을 호출한다.
		System.out.println(t2.data);
	}
}