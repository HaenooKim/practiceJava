class Temp {
	static int add(int i, int j) {
		return 100;
	}
}


public class Test136 {
	public static void main(String[] args) {
		int r = Temp.add(10, 20); //static이 붙은 함수는 인스턴스 없이 [클래스명.함수]로 호출가능
		System.out.println(r);
	}
}


/*
	static이 붙은 멤버함수는 인스턴스 생성없이 호출 가능
	-> C언어에서 보던 보통함수와 동일 개념이다.
	ex) int add(int i, int j) {
		return 100;
	}
	
	
	C++ 은 클래스 밖에서 함수선언이 가능하지만 java는 불가능이다.
	따라서 클래스 안에서 선언하면서 멤버함수와 구별되도록 static이라는 키워드를 사용.
	
	
*/