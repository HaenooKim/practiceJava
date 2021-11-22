import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface NoPrint{}

class Calc {
	
	@NoPrint
	public int add(int i, int j) {
		return i+j;
	}
	
	public int minus(int i, int j) {
		return i-j;
	}
}


public class Test154 {
	public static void main(String[] args) throws Exception {
		String l = "add";
		Object obj = new Calc();
		Class<?> cls = obj.getClass();
		Method mtd = cls.getMethod(l, int.class, int.class);
		int r = (Integer)mtd.invoke(obj, 10, 20);
		
		Annotation at = mtd.getAnnotation(Noprint.class);
		if (at == null) {
			System.out.print(r);
		}
		
		System.out.println(r);
	}
}