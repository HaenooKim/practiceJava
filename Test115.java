class Bank <X extends Object> {
	X t = null;
}

public class Test115 {
	public static void main(String[] args) {
		Bank<Object> bank = new Bank<Object>();
		bank.t = "HelloWorld";
		String t2 = (String)bank.t;
		
		Bank<String> bank2 = new Bank<String>();
		bank2.t = "HelloWorld";
		String t3 = bank2.t;
		
		Bank<Integer> bank3 = new Bank<Integer>();
		bank3.t = 100;
		int j = bank3.t;
	}
}




/*
 ? t = null; ?�� Object / String �϶��� Ȯ���ϰ� ������� ����.
 Object �϶��� ��� ���� ��� �ñ� �� ������ ã�ư� �� ĳ�����ؾ���
 String�϶��� String�� �ñ� �� ������ ã�� �� ĳ������ �ʿ����
 
 Ŭ���� �ȿ��� ��޵Ǵ� ���� Ÿ���� <>�ȿ� �����Ǵ� Ÿ������ �������� ������ �� �ִ�.
 �̸� ���׸��̶� �θ���.
 c++�� ���ø��� ����ѵ� ���ʸ��� ������������ �����ϰ� �ڷ����� �Ұ���.


*/