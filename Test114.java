class Bank {
	Object t = null;
	
}

class Bank2 {
	String t = null;
}


public class Test114 {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.t = "HelloWorld";
		//String b2 = b.t ->��������. �ڼ�Ÿ�Ժ����� ������ �ν��Ͻ��� ����Ű�� ���� �Ұ���.
		String b2 = (String)b.t;//ĳ������ ���ָ� ������
		
		Bank2 c = new Bank2();
		c.t = "HelloWorld";
	}
}


/*
	Bank�� � �ν��Ͻ��� ��������� ����ų �� ������ ������� ���� �� �ݵ�� ����Ÿ������ ĳ�����������.
	
	Bank2�� String�� ��������� �̿��Ͽ� ����ų �� ������, ������� ���� �� ĳ������ �ʿ����.
*/