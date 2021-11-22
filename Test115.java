class Bank <X extends Object> {
	X t = null;
}

public class Test115 {
	public static void main(String[] args) {
		Bank<Object> bank = new Bank<Object>();
		bank.t = "HelloWorld";
		String t2 = (String)bank.t;
		
		Bank<String> bank2 = new Bank<String>();
		bank2.t = "HelloWorld";
		String t3 = bank2.t;
		
		Bank<Integer> bank3 = new Bank<Integer>();
		bank3.t = 100;
		int j = bank3.t;
	}
}




/*
 ? t = null; ?가 Object / String 일때가 확연하게 장단점이 갈림.
 Object 일때는 모든 것을 잠시 맡길 순 있지만 찾아갈 때 캐스팅해야함
 String일때는 String만 맡길 수 있지만 찾을 때 캐스팅이 필요없음
 
 클래스 안에서 언급되는 변수 타입을 <>안에 지정되는 타입으로 동적으로 결정할 수 있다.
 이를 제네릭이라 부른다.
 c++의 템플릿과 비슷한데 제너릭은 참조형변수만 가능하고 자료형은 불가능.


*/