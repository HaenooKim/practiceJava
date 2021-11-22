class Temp {
	private static Temp uniq = null;
	//클래스는 딱 한번만 호출되므로 uniq라는 변수는 jvm안에 유일하게 됨.
	
	
	//static initializer 안에서 uniq로 인스턴스를 가리키게 하라.
	/*
	static {
		uniq = new Temp();
	}
	*/
	
	// public static synchronized 하게 uniq를 제공하는 getInstance함수를 선언한다.
	public static synchronized Temp getInstance() {
		if (uniq == null) {
			uniq = new Temp();
		}
		return uniq;
	} 
	
	//Temp클래스 밖에서는 생성자를 호출할 수 없다. 즉 인스턴스를 못 만든다. 
	private Temp() {
		
	}
} //이렇게 설계하는 설계패턴을 싱글톤 패턴이라고 한다.

public class Test139 {
	public static void main(String[] args) {
		//new Temp(); //에러남
		Temp a = Temp.getInstance();
		Temp b = Temp.getInstance();
		System.out.println(a==b); //true (포인터끼리는 같은 대상을 가리킬때 true가 뜸)
	}
}

/*
c언어의 함수는 프로그램이 동작하는 동안 유일하게 존재한다.
이것처럼 java의 인스턴스도 딱 하나만 jvm상에서 존재하게 만드는 거 static을 이용하면 가능.
*/