class A {
	A() {
		System.out.println("A Constructor");
	}
}

class B extends A {
	B() {
		System.out.println("B Constructor");
	}
}

public class Test091 {
	public static void main(String[] args) {
		new B();
		//t.B() ->�Ұ��� (�����ڴ� ����Լ��� �ƴϴ�.)
	}
}

/*
	�ڼ��� �ν��Ͻ��� �����ϸ� ������ ������ ���� �ڼ��� �����ڰ� ���ʷ� ȣ��ȴ�.
	
	�׷� �����ڰ� ��ӵǴ� �����ΰ��ΰ�?
	-> �����ڴ� ����Լ��� �ƴϴ� ��ӵ��� �ʴ´�. �����ͷε� ���ٺҰ�. �ٸ� �ν��Ͻ� ������ ȣ��� ���̴�.
*/