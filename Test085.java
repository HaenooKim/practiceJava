class A {
	int data = 0;
	void print() {
		System.out.println("print " + data);
	}
}

class B extends A{ 
	//A�� ������ �ִ� ��� ������ �Լ��� ������ �´�. ->���
	//class B�� class A�� ���� ��ӹ޾Ҵ�. A�� B�� ����Ŭ����, B�� A�� �ڽ�Ŭ����
		
	
	
	//�������� ���ÿ� ������ �Լ� ������ �� �� �ִ�.
	void print2() {
		System.out.println("print2");
	}
}


public class Test085 {
	public static void main(String[] args) {
		A t = new A();
		t.data = 100;
		t.print();
		
		// ���󿡼� ����� �Լ� ����, B���� ����� �Լ� ���� ��� ��밡��.
		B r = new B();
		r.data = 200;
		r.print();
		r.print2();
	}
}


/*
	��ü���� ����� 3�� Ư¡
	1. ��Ӽ� - Ŭ������ ��ӹ޾� Ŭ������ �����.
	2. ���м� - ���߰����ϴ� �͵��� ���� �� �־�� �Ѵ�.
	3. ������ - �ϳ��� �ɺ�(�̸�-������ �Լ���)�� �پ��� ��� ������ �� �־�� �Ѵ�.
*/