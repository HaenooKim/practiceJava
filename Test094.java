class A {
	void print(int i) {
		System.out.println("^^");
	}
}






public class Test094  extends A{
	
		/*
			같은 공간에서 변수는 같은 이름으로 2개가 존재할 수 없다.
		
		
		int data = 100;
		double data = 3.14;
		
		*/
		
		/*
		이렇게 하나의 클래스 안에서 매개변수의 형태가 다른 같은 이름의 함수가 공존하는 것을
		Method Overloading이라고 한다.
		
		조상에서 선언된 함수를 형식 그대로 자손클래스에서 재정의 하는 것을 오버라이딩이라고 한다.
		조상에서 선언된 변수명을 자손에서 쓰지 말자 !/ 멤버변수는 오버라이딩, 오버로딩 개념이 없다.
		*/
		
		void print(int i) {}
		void print(double i){}
		
	
}