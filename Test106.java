interface ITemp {
	public void print();
	public void print2();
}


class Temp implements ITemp {
	public void print() {
		System.out.println("print");
	}
	
	public void print2() {
		System.out.println("print2");
	}
}

public class Test106 {
	public static void main(String[] args) {
		ITemp t = new Temp();
		t.print();
		t.print2();
	}
}

/*
	�������̽�
	- ��ӹ��� ��� �޼ҵ带 �������̵� �Ѵ�.
	- public abstarct method
	- implements�� ����ؼ� ���
	
	abstract class�� �ٸ� ���� ����?
	- interface�� �ݵ�� abstarct�θ� �����Ǿ��־����(�޼ҵ尡 ���� �Ǿ��־�� ��)
*/	