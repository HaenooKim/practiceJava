package banana;

class Temp {
	
	static { //Ŭ������ �ε��ɶ� ��µ�
		System.out.println("static");
	}
	
	public void print() {
		System.out.println("print");
	}
}


public class Test141 {
	public static void main(String[] args) throws Exception{
		Class<?> cls = Class.forName("banana.Temp");
		// Class.forName("") : ���ڿ��� �־��� �̸��� Ŭ������ ������ �ε���Ų��.
	
		Object obj = cls.newInstance();
		System.out.println(obj.getClass().getName());
	
	}
}


/*
	-��Ű�� ������-
	javac -d C:\classes Test141.java
	java -classpath C:\classes banana.Test141
	
	Class<?> cls : �׳� �׷������ϰ� ����...����
	cls.newInstance() : cls�� �ش�Ǵ� Ŭ������ �ν��Ͻ��� �����.(new���� �ν��Ͻ��� ���� �� �ִ�.)
*/