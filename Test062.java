
class Temp {
	int data = 100;
	int add(int i) {
		return i*10;
	}
}



public class Test062 {
	public static void main(String[] args) {
		Temp t = new Temp(); //new Temp()�� �ν��Ͻ�! t�� ������ ����!
		t.data = t.add(20); //Ŭ������ ������ ����.
		System.out.println(t.data);
	}
}



/*
	- ����� Ŭ���� �̸��� �빮�ڷ� �����Ѵ�.
	- new Temp(); �� ���� ����� �־�� �Ѵ�. �̰��� �ν��Ͻ��� �θ���.
	- Temp t= ...; Ŭ���� �̸����� ������ �����Ѵ�. �ű⿡ �ν��Ͻ��� �����Ѵ�.
	- �ռ��� ������ ���� (������ ���� �Ǵ� reference��� �θ���.) �� ���� Ŭ�������� �����
	������ �����Ѵ�.
	- ���Ե� ������ ������ ���� Ŭ�������� ����� �Լ��� ȣ���� �� �ִ�.

*/