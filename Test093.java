/*
	�̸��� ������ �Ű������� ������ Ʋ�� �Լ��� �ϳ��� Ŭ���� �ȿ� ������ �� �ִ�.
	�Լ����� ���� ���� ������ ���� ���� �Ű����� ������ ��ġ�ϴ� ������ ã�Ƽ� ȣ���ϰ� �ȴ�.

	���� �̸��� �� ���� ����Ÿ���� �����ؾ��Ѵ�. (�Ű������� ������ �޶��� �� �ִ�.)
	
	�Ű������� ������ ���Ƶ� Ÿ���� Ʋ���� ������ �� �ִ�.
*/


class Temp {
	int add(int i, int j) {
		return 100;
	}
	
	int add(int i) {
		return 200;
	}
	// �Լ��� ã�� �� �� �¾� �������� �� ������ �ڵ�����ȯ �Ǿ� ȣ���� �� �ִ� ���� ȣ���Ѵ�.
	//�� �°� ����� �Լ��� ������ �װ� ȣ���ϰ� �װ� �ƴϸ� ������ �ڵ�����ȯ ������ ������ ã�� ȣ���Ѵ�.
	//byte < short < int  < long < flat < double
	void print(double i) {
		System.out.println(i);
	}
	
	void print(int i) {
		System.out.println("^^");
	}
	
}


public class Test093 {
	public static void main(String args[]) {
		Temp t = new Temp();
		int r = t.add(10, 20);
		System.out.println(r);
		
		int j = t.add(10);
		System.out.println(j);
		
		t.print(100);
	}
}