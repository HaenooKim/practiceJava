
class A {
	
}

class B extends A {
	void print() {
		
	}
}


public class Test099 {
	public static void main(String[] args) {
		A t new A();
		t.print();
		// B t2 = (B)t; -> ���� �� ������ ����.
		
		A t2 = new B();
		B t3 = new (B)t2;
	}
}

/*
	������ �� �� ���� ������ �ְ� ������ �� ���� ������ ����.
*/