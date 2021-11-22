abstract class Temp {
	abstract public void print();	
}

class Temp2 extends Temp {
	public void print() {
		System.out.println("HelloWorld");
	}
}

public class Test102 {
	public static void main(String[] args) {
		Temp t = new Temp2();
		t.print();
		
	}
}

/*
	abstract : �ν��Ͻ��� ���� �� ���� Ŭ����
	abstract method : ����Ǿ����� ���ǵ��� ���� �޼ҵ�
	Ŭ������ �ϴ� �� : ������ ���� ����, �ν��Ͻ� ����, ��ӹ޾� Ŭ���� ����
	
	abstract method : ����Ǿ����� ���ǵ��� ���� �޼ҵ�
	abstract �޼ҵ带 �Ѱ�
	
	���� �������� �ݵ�� abstract class�� �����ؾ���
	�������̵� �ϸ� abstract�� ������ ������.
	
	abstract class�� Ȱ���� �� [A t = new B()]���·� ���� ��찡 ������ ����.
	
	
	java�� ��� ���� ���������� �Լ������͸� �̿��� ȣ���� ����ϰ� �մµ�
	abstract method�� �Լ������Ϳ� null���� ����ִ� �Լ��� �ش��Ѵ�.
	abstract method�� ���� Ŭ������ abstract�� �Ǿ�� �ϴ� ����? �ν��Ͻ��� �����ϸ� �ȵȴ�.
	(null ���� ����մ� �Լ������ͷ� �Լ� ȣ���ϸ� ū�ϳ���.)
	
	�������̵��� ��ü�� ? ���󿡼� ����� �Լ������Ͱ� �ڼտ��� ������ �Լ� ��ü�� ����Ű�� ��.
	 abstract method�� �������̵� �ϸ�? null�� �� �Լ������Ͱ� ���ο� ��ü�� ����Ű�Եȴ�.
	 null���� ���ư���. - abstract�� ������ ��������.
	
*/