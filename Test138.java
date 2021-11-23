class Temp {
	static void print2() {
		//print(); --> ������
		//�ܿ��!! "static�ȿ����� non-static�� ���� ������."
		Temp t = new Temp(); //�̰� �������� �� �ƴ϶� ������.
		t.print();
	}
	
	void print() {
		print2();
	}
}

interface ITemp {
	// public static void print(); ->������
	
	/*�̰� �������̵��� ������ �ϴ� �Լ��̾�� �ϰ�
	�������̵��� �Լ������� ���·� ���Ǿ�� �ϰ�
	�׷����� �ν��Ͻ��� �Լ������Ͱ� �־�� �ϰ�
	�׷��� non-static�ؾ��Ѵ�.
	
	�������̽� �ȿ����� non-static�� �޼ҵ带 ����.!!
	*/
}

public class Test138 {
	public static void main(String[] args) {
		
	}
}


/*
non-static method print() cannot be referenced from a static context
--static�� ��޵� ��������� �Լ��� �����Ǵ� ������ class �ε���.
�̶��� non-static�� ����� �����ϱ� ���̴�.
*/