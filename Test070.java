
class Temp {
	
	//���� Ÿ���� ���� Ŭ���� �̸��� ���� �Լ�: Constructor(�������Լ�)��� �Ѵ�.
	// �� ������ Ŭ���� �ȿ��� ����� ������ �ʱ�ȭ
	Temp(int i) { //�̰� new Temp()�� �� ȣ���
		this.data=i;
	}
	
	int data = 100;
	int add(int i) {
		return this.data + i;
	}
}


public class Test070 {
	public static void main(String[] args) {
		Temp t = new Temp(0);
		t.data = t.add(20);
		System.out.println(t.data);
	}
} 