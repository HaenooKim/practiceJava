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
			synchronized(toi) {
				toi.bigWork("kim");
			}
			
			try {
				Thread.sleep(100);
				
			}
			catch(InterruptedException e) {}
			
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
			synchronized(toi) {
				toi.bigWork("Park");
			}
			
			try {
				Thread.sleep(100);
				
			}
			catch(InterruptedException e) {}
			
		}
	}
}

public class Test207 {
	public static void main(String[] args) {
		Toilet toilet = new Toilet();

		Thread k = new Kim(toilet);
		Thread p = new Park(toilet);
		k.start();
		p.start();
	}
}

/*
	synchronized(toi) {
		...
	}
	
	{...} �� ������ ���� ���ؼ��� toi �� ����Ű�� �ν��Ͻ��� ���� key�� ȹ���ؾ� �Ѵ�.
	��� �ν��Ͻ��� �ϳ��� Ű�� ������ �ִ�.
	
	kim park�� ���ÿ� toilet�� ���Ծ kim�� ���� ���踦 ���� ���� park�� ���谡 �ݳ��ɶ� ���� ��ٷ��� �Ѵ�.
	
	���踦 �����߸� {�� ����� �� �ְ� } �������� ����� �ν��Ͻ����� �ݳ��ȴ�. 

	synchronized �� �Լ��� �ƴ� �ڹ�Ű������. �̸� ���ؼ� ���ÿ� �ν��Ͻ��� �̿��ϴ� �����忡 ���ؼ� 
	������ �� �ִ� ��Ȳ(�ϳ��� ��ü�� �� ���� �����尡 ���ÿ� ����ϸ� �ȵǴ� ��)�� ���� �� �ִ�.
*/