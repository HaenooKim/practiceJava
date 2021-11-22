package banana;

import java.lang.reflect.Method;

class Temp {
	public void print( int i ) {
		System.out.println("Hello " + i );
	}
	public void print() {
		System.out.println("Apple" );
	}
	public void print( int i, double j ) {
		System.out.println("Banana" + j );
	}
}

public class Test148 {
	public static void main( String[] args ) throws Exception {
		Class<?> cls = Class.forName("banana.Temp");
		Object obj = cls.newInstance();
		/*
			cls 에 선언된 메소드중 이름이 print 이고 매개변수가 ( int ) 로 선언된 함수포인터를 넘긴다.
			invoke( obj, 100 ); 는 함수를 호출하면서 매개변수로 100을 넘긴다  print( 100 );
		*/
		Method mtd = cls.getMethod("print", int.class );
		mtd.invoke( obj, 100 );
		
		//	jdk 1.5 부터 getMethod 함수는 가변길이 파라메터를 쓰는 형태를 지원한다.
		Method mtd2 = cls.getMethod("print", int.class, double.class );
		Object rv = mtd2.invoke( obj, 100, 3.14 );
		System.out.println( rv );
	}
}
/*
	public Object invoke(Object obj, Object... args)
	- obj 는 멤버함수를 호출할 인스턴스에 대한 포인터
	- args 는 매개변수에 넘길 값 ( 가변길이 파라메터 )
	- 리턴되는 것은 함수의 리턴값에 해당한다. ( 리턴타입이 void 인 함수는 null 이 리턴된다 )
*/