class A {
}

interface ITemp<X> {
	public X getData();
}

public class Test118 {
	public static void main(String[] args) {
	
		/*
			A t = new B();
			new ITemp<Integer>(){...} : ITemp<Integer>�� ��ӹ����� ���� ������ Ŭ������ �ν��Ͻ� ����
			ITemp<Integer>�� ��ӹ޾����� �������� ����� �޼ҵ带 �������̵� �� ����ϰ� ���ʸ��� Integer public X getData();
			X���� Integer�� �����Ѵ�.
			����ڽ� ����ϸ� return 100�� �ص� �������� �̻��� ����.
		*/
		
		ITemp<Integer> it = new ITemp<Integer>() {
			public Integer getData(){return 100;}
		};
		
		int j = it.getData();
		System.out.println(j);
		
	}
}


/*
	new A() {}
		{}�ȿ��� ��������� �Լ������� �����ϴ�. �׷� Ŭ�����ΰ�? �´�. Ŭ������.
		�ν��Ͻ��� ����� �ִ� ��Ȳ�ΰ�? �´�.
		
		AŬ������ ��ӹ޴� �̸����� Ŭ������ �����ϸ鼭 ���ÿ� �ν��Ͻ��� �����ϰ� ����.
		- �������κ��� ��ӹ����鼭 Ŭ������ �����ϴµ� �̸��� ����-> �̸��� ������ ���� �Ұ�
		�ѹ��� ��԰� ���Ŵϱ� �̸��ʿ����. -> anonymous class
*/