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
		100�� AutoBoxing�Ǿ� new Integer(100) ���·� obj�� ����
		ObjectŸ�����δ� ��ڽ��� �ȵȴ�. obj�� ����Ű�� ����� Integer�� ����ȯ�� ����.
		����ȯ�� �ϸ� Integer�� ������ ������ �ǰ� �̴� ��ڽ��� �����ϴ�.
		
		Object obj = 100; -> �̰� �ڵ����� new Integer(100)�� �ȴ�.
		int r = (Integer)obj; ->�ݵ�� ����ȯ�� ������� 
		*/
		
		
		Method mtd = cls.getMethod("print");
		int r = (Integer)mtd.invoke(obj); //mtd.invoke(obj)�� object�� ��ȯ�ϹǷ� ����ȯ�� �������.
		System.out.println(r);
	}
}

/*
	

	javac -d C:\classes Test143.java
	java -classpath C:\classes banana.Test149


	1. Class.forName("banana.Temp");
	2. [Ŭ������].class : '��� Ŭ�������� .class��� Class���� static������ �ִ�.' 
	3. Object���� ����� getClass() �Լ��� ȣ���ؼ� �����͸� �Ѱܹ��� �� �ִ�.

	Class cls : ����� class�� ���õ� �Լ��� ��Ƴ��� ��
*/
