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
	Annotation�� �������̽��̴�. �嵥 ���� �̻��ϴ�. (@interface)
	Ŭ������ ������� ����Լ����� ���������ϴ�.
	
	cls.getAnnotation(Annot.class)�� Ŭ������ ������̼��� �����Ǿ����� �ľ��Ѵ�.
	������ �Ǿ����� Annot�� �ν��Ͻ��� ���� �����͸� ����, �ȵǾ����� null�� ����.
	
	�޼ҵ忡 ������̼��� �����Ǿ������� �˾ƺ����� Method�� ����� getAnnotation�� ����Ѵ�.
	(������� ����.)
*/	