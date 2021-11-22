class A {
	private int drug = 0;
	protected int vijaguem = 1;
	public int budongsan = 2;
	
	private void picnic() {
		System.out.println(this.drug); // ����
		System.out.println(this.vijaguem); // ����
		System.out.println(this.budongsan); // ����
		//���� ������(public , private, proteted)�� ������� �� ����� �󸶵��� ���ٰ���.
	}
}

class B extends A {
	void print() {
		// ���� : ���ٺҰ� System.out.println(this.drug);
		System.out.println(this.vijaguem); // ���� ����
		System.out.println(this.budongsan); // ���� ����
	}
}


public class Test100 {
	public static void main(String[] args) {
		
		A t = new A();
		System.out.println(t.budongsan);
		// ���� : System.out.println(t.drug);
		
		//proteted�� c++ ����� ���پȵ�. ������ java���� ��Ű�� ���䶧���� ������ �� �פ���.
		// ���� ��Ű���� ���� Ŭ������ proteted ����� ���ٰ���.
		// �ٸ� ��Ű���� ���� Ŭ������ proteted ����� ������ �� ����.
		System.out.println(t.vijaguem);
	}
}


/*

	private protected public : ��� (�Լ�, ����) �տ� �ٴ´�.
	'Ŭ������ ����� ����Լ��� ���������.'
	���м��� ���õ� Ű�������.
	
	��� ���� 3����
	1. �������� ������ ��(����x ���x) - Private
	2. �����ֱ⸸ �� ��(����x, ���o) - protected
	3. �����ϰ� �����ֱ⵵ �� ��(����O, ���O) - public
	"��� ���� �Լ� �տ� �پ ���� ����� �Ͱ� ���� ���ټ��� ������."
	
*/