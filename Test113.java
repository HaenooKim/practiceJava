class Temp {
	public void print(String... p) {
		System.out.println(p.length);
	}
	
	//���� ������ �Լ��������. � �Ű������� �� ����ȴ�.
	public void print2(Object... p) {
		
	}
}


public class Test113 {
	public static void main(String[] args) {
		Temp t = new Temp();
		t.print();
		t.print("apple");
		t.print("apple", "banana");
		t.print("apple", "banana", "orange");
		
		t.print2(100, 3.14);
		
		t.print2(100, 3.14, "HelloWorld", null); //�� ���� ����
	}
}

/*
String... p : �������� �Ķ���Ͷ�� �Ѵ�. ��ü�� �迭�̴�.
*/