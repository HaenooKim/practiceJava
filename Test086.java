class A {
	int data = 100;
	
	void print() {
		System.out.print("A print");
	}
}

/* Ŭ������ ���� ���������� �Լ������͸� �����޴µ�, �ڼտ��� �Ȱ��� ����Ǵ� ��쿡��
	���ο� �����͸� ������ �ʰ� ������ �����Ͱ� �ڼտ��� ����� ��ü�� ����Ű�� �ȴ�.

	���󿡼� ����� �Լ��� �ڼտ��� �״�� �� �����ϸ� ���ƾ��� ���·� �����ǰ� �ȴ�.
	method overriding�̶�� �Ѵ�.
*/	

class B extends A {
	int data = 200;
	
	
	
	void print() {
		System.out.print("B print");
	}
}



public class Test086 {
	public static void main(String[] args) {
		B t = new B();
		t.print();
		
		A t2 = new A();
		t2.print();
	}
}