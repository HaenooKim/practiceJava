public class Test157 {
	public static void main(String[] args) {
		String t = "HelloWorld";
		String r = "HelloWorld";
		
		System.out.println(r==t); //true
		
		String l = t.substring(2, 5);
		System.out.println(l); //llo
		
		System.out.println(r); //helloWorld  (llo�ƴ�)
		
	}
}

/*
�������� �񱳴� ���� �ν��Ͻ��� ����ų�� true�� ���´�. (������ �������� �ƴ�. �׶� equals�� ����Ѵ�.)

substring�� ����Ű�� ���ڿ��� ������ �����ϴ� ���¸� llo ->�̷����� �������� �ȵ�.
substringd�� ���ο� ���ڿ��� ������ ���¸� helloWorld���

����Ǵ� �ν��Ͻ��� �Ժη� ������ �ٲٸ� ���� ���� ���� �ִµ� ���ڱ� ������ ���� �� �ֱ⿡
�Ժη� �����ϸ� �� �ȴ�.
-> String�� ��� ����Լ��� ������ �ٲ����ʰ� ���ο� ���ڿ��� ����� ���·� �����Ѵ�.
*/