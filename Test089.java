class A {
	int data = 100;
}

class B extends A {
	int data = 200;
}

public class Test089 {
	public static void main(String[] args) {
		A t = new B();
		System.out.println(t.data);
		
		//��������� �������̵� ������ ����! �׷��� 200�� �ƴ� 100�� ��µ�.
		//���󿡼� ����� �̸��� ������ ���� �ڼտ��� ���� ����. ���������� ������ ���Ѵ�.
		
		B t2 = (B)t;
		// ���� �̸��� ������ 2�� ������ �ڽ�(B)�ȿ��� ����� ���� ȣ���Ѵ�.
		System.out.println(t2.data);
	}
}