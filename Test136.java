class Temp {
	static int add(int i, int j) {
		return 100;
	}
}


public class Test136 {
	public static void main(String[] args) {
		int r = Temp.add(10, 20); //static�� ���� �Լ��� �ν��Ͻ� ���� [Ŭ������.�Լ�]�� ȣ�Ⱑ��
		System.out.println(r);
	}
}


/*
	static�� ���� ����Լ��� �ν��Ͻ� �������� ȣ�� ����
	-> C���� ���� �����Լ��� ���� �����̴�.
	ex) int add(int i, int j) {
		return 100;
	}
	
	
	C++ �� Ŭ���� �ۿ��� �Լ������� ���������� java�� �Ұ����̴�.
	���� Ŭ���� �ȿ��� �����ϸ鼭 ����Լ��� �����ǵ��� static�̶�� Ű���带 ���.
	
	
*/