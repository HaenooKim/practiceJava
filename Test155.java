
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface NoPrint {
	public int value() default 0;
	public int abcd() default 0;
}

class Calc {
	
	// value()함수를 통해서 리턴받을 값을 여기서 지정가능하다.
	@NoPrint(value = 30, abcd=100)
	public int add( int i, int j ){ return (i+j);}
	
	public int minus( int i, int j ){ return (i-j);}
}

public class Test155 {
	public static void main( String[] args ) throws Exception {
		String l = "add";
		Object obj = new Calc();
		
		Class<?> cls = obj.getClass();
		Method mtd = cls.getMethod( l, int.class, int.class );
		int r = (Integer)mtd.invoke( obj, 10, 20 );
		
		/*
			Annotation은 모드 어노테이션의 조상클래스이다.
			value라는 함수는 noprint에서 선언된 것이기 때문에
			이것을 불러오려면 아래처럼 형변환이 필요하다. 
		*/
		
		NoPrint at = (NoPrint)mtd.getAnnotation( NoPrint.class );
		if( at == null ) {
			System.out.println( r );
		} else if( at.value() ==r) {
			System.out.println( r );
		}
	}
}
/*	@NoPrint 가 지정된 함수는 함수를 수행하되 결과를 출력하지 말아라 ... 를 구현해 본다면??
	
	@NoPrint(30) 이런식으로 아무키값없이 값을 지정하려면 value()함수를 이용해야함
	@NoPrint(abcd=30) : 이런식으로 특정 키값을 지정하여 value값을 지정하려면 abcd()함수를 선언해야 한다.
*/