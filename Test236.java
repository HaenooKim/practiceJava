package banana;

//	 ������ import ����� Ŭ�����ε� import static �� static �ϰ� ����� �Լ��� ������� �Ѵ�.
import static banana.Logic.print;

class Logic {
	public static void print() {}
}

public class Test236 {
	public static void main( String[] args ) {
		System.out.println("HelloWorld");
		print();
	}	
}

/*	javac -d c:\classes Test236.java
	java -classpath c:\classes banana.Test236
	
	�۲��� ���� �ٸ��� Ư�� ���ڰ� �� �Ⱥ��� �� �ִ�.
	. i ���� ���ڰ� �� �Ⱥ��δ�.
	'�ڵ��� �۲��� ������ ���� ��� ����'
	'��Ÿ�� ��Ƴ� �� ���縵�� ���� ���ٴ� ������ ���̸� ���� ��Ƴ���. - ������ �۲��� �װ� �ȵ�'
	Courier New , Consolas �� ���� ���µ� D2Coding �� �� �� �ٴڴٴ� ...
	( Consolas �� MS ����ȯ�濡�� ����Ʈ�� ����. Mac �� �⺻�۲��� Monaco �� ) 
	�۲��� �������� ��� ���ߴ°� ���� - ������ �ڵ� ���ֱ� ���ؾ� �ؼ�.
	Monaco �� �̻ڰ� ���⿡�� �����ο� �������� �ѱ� �۲��� ������ �ȵǾ ... 
	
	�ڵ��� �۲��� �ѱ� �� ���ڰ� ���� �� ���� ��ŭ�� ���� �����ϰ� ������ �ִ°� ���ϴ�
	
	'���̹����� ��������ڵ� �̶�� �۲��� ����� ��������� - ���Ŵٸ� 1.65 ���� ��õ ( 2.0 ���� )'
*/