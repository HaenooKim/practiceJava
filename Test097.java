/*
	java�� ������� ������ extends Object�� �ڵ����� ���δ�.
	Object�� ��� Ŭ������ ������ �ȴ�.
	
	�׷� Object Ÿ���� ������ ��� �ν��Ͻ��� ����ų �� �ִ�? �´� ���.
	void *�� ���� �����ΰ�? �װ� �ƴ�.
	
	toString()�� ����? Object���� ��ӹ޾Ҵ�.
	�ν��Ͻ��� ���õ� �� ������ ���ڿ��� ������ ���� ���� �� toString�� �ֿ��Ѵ�.
*/



class Temp {
	public String toString() {
		return "Hello World";
	}
}


public class Test097 {
	public static void main(String[] args) {
		Object t = new Temp();
		System.out.println(t.toString());
	}
}