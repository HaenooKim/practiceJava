public class Test092 {
	public static void main(String[] args) {
		String l = null; //
		String t = "HelloWorld"; //Hello World는 인스턴스임.
		//String은 new 없이 인스턴스를 생성하는 유일한 클래스이다.
		//System.out.println(t.startsWith("Hel"));
		//System.out.println(t.endsWith("rld"));
		System.out.println(t.lastIndexOf(""));
		System.out.println(t.substring(4, 8));
	}

}


/*
	클래스로 할 수 있는 것 3가지
	1. 참조형 변수 선언
	2. 인스턴스 생성
	3. 클래스를 상속받아 클래스를 선언
	
	선언 타입에 따라 참조형 변수아니면 자료형 변수이다.
	"String으로 선언한 변수는 참조형변수다."
	

*/

