public class Test007 {
	public static void main(String[] args) {
		double i = 3.14;
		System.out.println(i);
		
		double j = 100;
		
		i = (int)100.0;
		
		System.out.println(j);
		System.out.println(i);
	}
}


/*

	int i= 100;
	double i = 3.14;
	
	double�� �ڷ����̴�. 
	�ڷ��� �̸� .. �̷��� ������ ���������̴�.

	double j = 100
	-- j��� �̸��� ���� ���������� �Ǽ��� ���� �� �ִ�.
	-- �̰� ���Խÿ� 100�� 100.0���� ��ȯ�ǰ� �� ������ ���ԵǾ��ٴ� ����̴�.
	-- "�ʿ��� ���� ���� �� ���¸� �ٲٴ� ��찡 �ִ�."
	-- int ���� double �� ������ int ���� double�� �ٲٰ� �� ������ �����Ѵ�.
	
	�ʼ� �ϱ����
	java�� �ڷ����� 8���� : byte short int long (������) /  float double (�Ǽ���) /boolean char
	byte (8bit) short (16bit) int(32bit) long(64bit)
	int i;�� �����ϸ� �̰� 32bit ũ�⸦ ���� �������� Ȯ���ȴٴ� ����̴�
	
	float(32bit) double(64bit)
	double i; �� ����Ǹ� 64bit �������� Ȯ���ȴ�.
	
	byte < short < int < long < float < double
	"�����ſ��� ū�Ŵ� �ڵ�����ȯ�� ������ ū �Ϳ��� ���� �����δ� �ڵ�����ȯ�� �� �ȴ�."

	(int)100.0; - 100.0 �̶�� double �� ���� int ������ ������ ��ȯ��Ų��.
	"���� �� ��ȯ �Ǵ� casting�̶�� �Ѵ�."
	
	double j = 100; -- ��� �ڵ����� ���Ѵ�.
*/