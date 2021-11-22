
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
			�Ʊ�� �������̽��� �̿��Ͽ� ����Լ��� ȣ���� �� �־��µ�
			������ �������̽� ���� �Լ��� �̸��� ���ڿ��� �˾Ƶ� ȣ���� ��
		*/
		
		Class<?> cls = Class.forName("banana.Temp");
		Object obj = cls.newInstance();
		System.out.println(obj);
		
		/* getMethod �� �����ϴ� method�� ������ Ȥ�� �Լ��������ΰ���?
			'cls'���� ������ print��� �̸��� �Լ��� ȣ���� �� �ִ� �����͸� �����ϴ� ��'
			
			�Լ�ȣ�� (invoke ���) �� �ش� �ν��Ͻ��� ���� �����͸� �־���� �Ѵ�.
		*/
		
		
		Method mtd = cls.getMethod("print");
		mtd.invoke(obj);
	}
}


/*
javac -d C:\classes Test143.java
java -classpath C:\classes banana.Test143
*/