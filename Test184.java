
package banana;

import static banana.Temp.print; //�̰� �����ָ� �����Լ� ������ ���ο��� print()�� �����ָ� �����

class Temp {
	public static void print() {
		System.out.println("print");
	}
}

public class Test184 {
	public static void main(String[] args) {
		print();
	}
}

/*
static import�� ����� class�� �ƴ϶� class�ȿ� ����� static�Լ��̰�
��ġ c���� �Լ�ȣ�� �ϵ��� static�� �Լ��� �Լ������� ȣ���� �� �ִ�. 
(jdk1.5���� ��������.) 
*/


/*
	������ �ֻܼ��� ��ɾ ���Ϸ� �������� �����ϴ� ��
	�����쿡���� ��ġ����(*.bat) ���н������� �����α׷���(*.sh)
	
	
---------------c.bat-----------------

	@ECHO OFF 
	REM c.bat
	SET CPATH = c:/classes

	@ECHO ON
	javac -d %CPATH% %1.java
	java -classpath %CPATH% banana.%1
	
------------------------------------
	@ECHO OFF : ��ɾ ��â�ϴ� �� ����
	@ECHO ON : ��ɾ� ��â�ϵ��� �ϱ�
	SET CPAHT=... : CPATH��� ������ ���ڿ��� ����
	%CPATH% : ������ ������ ���� ���⿡ �ٿ��ֱ�
	1% : ��ġ���� ���� �� �ܺο��� ���޵Ǵ� ù��° ���ڰ�
	-> ex) c Test184 �� �Է��ϸ� %1�� Tes184�� ��

*/