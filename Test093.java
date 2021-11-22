/*
	이름은 같지만 매개변수의 형식이 틀린 함수는 하나의 클래스 안에 공존할 수 있다.
	함수명이 같은 것이 여러개 있을 때는 매개변수 형식이 일치하는 선언을 찾아서 호출하게 된다.

	같은 이름을 쓸 때는 리턴타입은 동일해야한다. (매개변수의 형식이 달라질 수 있다.)
	
	매개변수의 갯수가 같아도 타입이 틀리면 공존할 수 있다.
*/


class Temp {
	int add(int i, int j) {
		return 100;
	}
	
	int add(int i) {
		return 200;
	}
	// 함수를 찾을 때 딱 맞아 떨어지는 게 없으면 자동형변환 되어 호출할 수 있는 것을 호출한다.
	//딱 맞게 선언된 함수가 있으면 그걸 호출하고 그게 아니면 가깝게 자동형변환 가능한 선언을 찾아 호출한다.
	//byte < short < int  < long < flat < double
	void print(double i) {
		System.out.println(i);
	}
	
	void print(int i) {
		System.out.println("^^");
	}
	
}


public class Test093 {
	public static void main(String args[]) {
		Temp t = new Temp();
		int r = t.add(10, 20);
		System.out.println(r);
		
		int j = t.add(10);
		System.out.println(j);
		
		t.print(100);
	}
}