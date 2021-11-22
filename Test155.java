
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
	
	// value()�Լ��� ���ؼ� ���Ϲ��� ���� ���⼭ ���������ϴ�.
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
			Annotation�� ��� ������̼��� ����Ŭ�����̴�.
			value��� �Լ��� noprint���� ����� ���̱� ������
			�̰��� �ҷ������� �Ʒ�ó�� ����ȯ�� �ʿ��ϴ�. 
		*/
		
		NoPrint at = (NoPrint)mtd.getAnnotation( NoPrint.class );
		if( at == null ) {
			System.out.println( r );
		} else if( at.value() ==r) {
			System.out.println( r );
		}
	}
}
/*	@NoPrint �� ������ �Լ��� �Լ��� �����ϵ� ����� ������� ���ƶ� ... �� ������ ���ٸ�??
	
	@NoPrint(30) �̷������� �ƹ�Ű������ ���� �����Ϸ��� value()�Լ��� �̿��ؾ���
	@NoPrint(abcd=30) : �̷������� Ư�� Ű���� �����Ͽ� value���� �����Ϸ��� abcd()�Լ��� �����ؾ� �Ѵ�.
*/