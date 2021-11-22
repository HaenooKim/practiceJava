package banana;

import java.lang.reflect.Method;

class Temp {
	public int print() {
		System.out.println("Apple");
		return 100;
	}
}


public class Test149 {
	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("banana.Temp");
		Object obj = cls.newInstance();
		
		System.out.println(Temp.class == cls);
		System.out.println(obj.getClass() == cls);
		
		/*
		100은 AutoBoxing되어 new Integer(100) 형태로 obj에 삽입
		Object타입으로는 언박싱이 안된다. obj가 가리키는 대상은 Integer로 형변환이 가능.
		형변환을 하면 Integer형 참조형 변수가 되고 이는 언박싱이 가능하다.
		
		Object obj = 100; -> 이건 자동으로 new Integer(100)이 된다.
		int r = (Integer)obj; ->반드시 형변환을 해줘야함 
		*/
		
		
		Method mtd = cls.getMethod("print");
		int r = (Integer)mtd.invoke(obj); //mtd.invoke(obj)는 object를 반환하므로 형변환을 해줘야함.
		System.out.println(r);
	}
}

/*
	

	javac -d C:\classes Test143.java
	java -classpath C:\classes banana.Test149


	1. Class.forName("banana.Temp");
	2. [클래스명].class : '모든 클래스에는 .class라는 Class형의 static변수가 있다.' 
	3. Object에서 선언된 getClass() 함수를 호출해서 포인터를 넘겨받을 수 있다.

	Class cls : 선언된 class와 관련된 함수를 모아놓은 것
*/
