
class Temp {
	int data = 100;
	int add(int i) {
		return i*10;
	}
}



public class Test062 {
	public static void main(String[] args) {
		Temp t = new Temp(); //new Temp()는 인스턴스! t는 참조형 변수!
		t.data = t.add(20); //클래스의 변수에 접근.
		System.out.println(t.data);
	}
}



/*
	- 참고로 클래스 이름은 대문자로 시작한다.
	- new Temp(); 을 먼저 만들어 주어야 한다. 이것을 인스턴스라 부른다.
	- Temp t= ...; 클래스 이름으로 변수를 선언한다. 거기에 인스턴스를 대입한다.
	- 앞서서 선언한 변수 (참조형 변수 또는 reference라고 부른다.) 를 통해 클래스에서 선언된
	변수에 접근한다.
	- 대입된 참조형 변수를 통해 클래스에서 선언된 함수를 호출할 수 있다.

*/