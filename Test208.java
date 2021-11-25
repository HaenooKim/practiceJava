/*
	�ڵ������ ������ �� ������ �����ڷ� ���� �߿��� �ٸ� ������� ū���� ������ 
	��� ��ٷ��� �ϴ� ��䵥 �̰� ȭ��� ���迡 �ߴ��� �Ǽ��� �ִٴ� ��.
*/


class Toilet {
	
	/*
		���������̰� ���࿡ ���õ� ��� ������ ���⼭ �Լ����·� �����ǰ� �ִٰ� ����.
		100���� �����尡 �� �ν��Ͻ��� �����ϰ� �ִٰ� ��������
		
		bigwork = �����Ա�
		sleep - ��������
		
		���� �� ���� ���ÿ� �Ͼ�� �� ������ ���� ����̶��?
		�׷��� �׷� ����� ����ó�� �����ߴٸ�?
		�ϳ��� ���������� �ٸ� �ϳ��� ���ϰ� ����ٸ� �� ��ٸ��� ���� ������� ���.
		�̰��� hainging�����̶� �ϰ� �� �Ⱓcpu�� �Ҹ�� ������ �ʴ´�.
	
		�����ڴ� ���� ȭ����� �и��ϰ� ȭ��ǿ��� ������ ���ڰ� �����?
		toieltŬ������ sleep�� �������� bedroom�� ���� ���� �װ� �����ϰ� ����� �ȴ�.
	
		�ִ��� �����尡 ���� �ʵ��� �����ؾ���. �װ��� ���ؼ��� � �ϵ��� � ������ ��ġ�Ǿ�� �ϰ� ���ÿ����� ���� �� ����
		����� ������ �Ѵ�.
	*/
	
	public void bigWork(String by) {
		System.out.println("BW STEP1" + by);
		System.out.println("BW STEP2" + by);
		System.out.println("BW STEP3" + by);
		System.out.println("BW STEP4" + by);
		System.out.println("BW STEP5" + by);
	}
	
	public void sleep(String by) {
		System.out.println("zzzz begin: " + by);
		try {
			Thread.sleep(1000);
		}
		catch (Throwable e) {}
		
		
		System.out.println("zzzz end: " + by);
	}
}

class MonitorCtrl {
	
	//�� �Լ��� ��׶��� �����尡 ȣ��ǰ� ������ �Ѵ�.
	public synchronized void letMeWait() {
		try {
			wait();
		}
		catch(InterruptedException e) {}
		
		public synchronized void letMeNotify() {
			notify();
		}
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
				if (i%3 ==0) {
					toi.sleep("kim");
				} else {
					toi.bigWork("kim");
				}
				
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

public class Test208 {
	public static void main(String[] args) {
		Toilet toilet = new Toilet();

		Thread k = new Kim(toilet);
		Thread p = new Park(toilet);
		k.start();
		p.start();
	}
}

/*
	
*/