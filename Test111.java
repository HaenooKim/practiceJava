public class Test111 {
	public static void main(String[] args) {
		Object t = 100; //t�� �ν��Ͻ��� ����Ű�� ���� �뵵�� ������ ����.
		
		System.out.println(t.getClass().getName()); //t�� ����Ű�� �ν��Ͻ��� ������ Ŭ������
		//Object t = 100�̷� �ڵ尡 �������� �����Ϸ��� Object t = new Integer(100); �̷��� �ٲ��ش�.
		
		Integer t2 = new Integer(200);
		Integer t3 = t2; // ��ó�� Integer �� ������ int ������ ������ ��
						// �����Ϸ��� �ڵ����� t3.intValue()�� ȣ���ϰ� �ȴ�. �̷� ���� unboxing�̶�� ��.
		
		int j = t3;
		System.out.println(j);
		
		int k = t; //(Integer �� ������ ������ Unboxing������ Object�� ������ Unboixing �� �ȴ�.)
	}
}

/*
	java�� int*, double*���� �� ����. - �ڷ��������� �������� ���� ������ ������ �ƿ�����.
	�� ������� ������ ���� Wrapper class�̴�. 
	
	Wrapper Class�� �����͸� ����� �� ���� ������ ������ �޸𸮼Һ� ���� ���·� �����Ǿ� �ִ�.
	Object t = 100; �̷��� �ڵ忡�� �ڵ����� new Integer(100)�� �����ִ� ���� Auto Boxing�̶�� �Ѵ�.
	
	int - Integer
	double - Double
	float - Float
	char - Character
	boolean - Boolean
*/