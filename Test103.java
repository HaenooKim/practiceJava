

//������ ���߿� �����״� �ϴ� ���
abstract class P51 {
	abstract public int engine();
	public void fly() {
		System.out.println(engine() + "����");
	}
}

class P51_v1 extends P51{
	public int engine() {
		return 1400;
	}
}

class P51_v2 extends P51 {
	public int engine() {
		return 1600;
	}
}


public class Test103 {
	public static void main(String[] args) {
		P51 t = new P51_v2();
		t.fly();
	}
}


/*

*/