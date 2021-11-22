package banana;

class Temp {
	
	static { //클래스가 로딩될때 출력됨
		System.out.println("static");
	}
	
	public void print() {
		System.out.println("print");
	}
}


public class Test141 {
	public static void main(String[] args) throws Exception{
		Class<?> cls = Class.forName("banana.Temp");
		// Class.forName("") : 문자열에 주어진 이름의 클래스를 강제로 로딩시킨다.
	
		Object obj = cls.newInstance();
		System.out.println(obj.getClass().getName());
	
	}
}


/*
	-패키지 실행방법-
	javac -d C:\classes Test141.java
	java -classpath C:\classes banana.Test141
	
	Class<?> cls : 그냥 그러려니하고 쓰자...ㅋㅋ
	cls.newInstance() : cls에 해당되는 클래스의 인스턴스를 만든다.(new없이 인스턴스를 만들 수 있다.)
*/