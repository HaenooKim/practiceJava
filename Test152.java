package banana;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Annot {
	
}

@Annot
class Temp {
	
	@Annot
	public void print() {
		
	}
}


public class Test152 {
	public static void main(String[] args) throws Exception{
		Class<?> cls = Class.forName("banana.Temp");
		Annotation at = cls.getAnnotation(Annot.class);
		System.out.println(at);
		
		Method mtd = cls.getMethod("print");
		Annotation at2 = mtd.getAnnotation(Annot.class);
		System.out.println(at2);
	}
}

/*
	Annotation은 인터페이스이다. 헌데 많이 이상하다. (@interface)
	클래스와 멤버변수 멤버함수위에 지정가능하다.
	
	cls.getAnnotation(Annot.class)은 클래스에 어노테이션이 지정되었는지 파악한다.
	지정이 되었으면 Annot의 인스턴스에 대한 포인터를 리턴, 안되었으면 null을 리턴.
	
	메소드에 어노테이션이 지정되었는지를 알아볼때는 Method에 선언된 getAnnotation을 사용한다.
	(사용방법은 같다.)
*/	