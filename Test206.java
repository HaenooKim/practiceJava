class Toilet {
	public void bigWork(String by) {
		System.out.println("BW STEP1" + by);
		System.out.println("BW STEP2" + by);
		System.out.println("BW STEP3" + by);
		System.out.println("BW STEP4" + by);
		System.out.println("BW STEP5" + by);
	}
}


class Kim extends Thread {
	private Toilet toi = null;
	
	public Kim(Toilet t) {
		this.toi = t;
	}
	
	public void run() {
		for (int i=0; i<10; i++) {
			toi.bigWork("kim");
		}
	}
}

class Park extends Thread {
	private Toilet toi = null;
	public Park (Toilet t) {
		this.toi = t;
	}
	
	
	public void run() {
		for (int i=0; i<10; i++) {
			toi.bigWork("Park");
		}
	}
}

public class Test206 {
	public static void main(String[] args) {
		Toilet toilet = new Toilet();

		Thread k = new Kim(toilet);
		Thread p = new Park(toilet);
		k.start();
		p.start();
	}
}

/*
	����������, ���������� ���ÿ� ����Ǵ� �ڵ�� ������� �����
	�װ��� �̿��ϴ� Ŭ������ ����Ŭ���� �ڵ�� �ϸ�ȴ�.
	
	���� ���� ĭ�� ���� ���ÿ� ���� ���ٴٰ� ������ ��Ȳ�ε�,
	���� �����尡 ���ÿ� �ϳ��� �ν��Ͻ��� ����ϴ� ��쿡 �ݵ�� ó���ؾ� �ϴ� ���� �����.
	
	��ΰ� ���� �ڽ��� ���� ȭ����� ������ ������ �̷����� ������ �ʰ����� ���������δ� �Ұ����ϴ�.
	�̷� ��쿡�� ���� ����ϴ� �����尡 ���� ��װ� ���� �� ���� ������� ��ٸ��� �Ѵ�.
	- �� ������ ����ȭ (synchronizeation) ������ �ǰ� �̴� java����� Ű����� �����ǰ� �ִ�.
*/