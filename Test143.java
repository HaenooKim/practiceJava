
package banana;
import java.lang.reflect.Method;

class Temp {
	public void print() {
		System.out.println("print");
	}
}

public class Test143 {
	public static void main(String[] args) throws Exception{
		Temp t = new Temp();
		t.print();
		
		/*
			아까는 인터페이스를 이용하여 멤버함수를 호출할 수 있었는데
			이제는 인터페이스 없이 함수의 이름을 문자열로 알아도 호출이 됨
		*/
		
		Class<?> cls = Class.forName("banana.Temp");
		Object obj = cls.newInstance();
		System.out.println(obj);
		
		/* getMethod 가 리턴하는 method형 변수가 혹시 함수포인터인가요?
			'cls'에서 지정된 print라는 이름의 함수를 호출할 수 있는 포인터를 제공하는 중'
			
			함수호출 (invoke 사용) 시 해당 인스턴스에 대한 포인터를 넣어줘야 한다.
		*/
		
		
		Method mtd = cls.getMethod("print");
		mtd.invoke(obj);
	}
}


/*
javac -d C:\classes Test143.java
java -classpath C:\classes banana.Test143
*/