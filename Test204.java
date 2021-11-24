/*
������ �����ϴ� ù��° ��� (���� �̰� ���� ��)
*/


public class Test204 {
	public static void main(String[] args) {
		StringBuffer sb  = new StringBuffer();
		
		Runnable r = new Runnable() {
			public void run() {
				for (int i=0; i<100; i++) {
					try {
						Thread.sleep(350);
					}
					catch(InterruptedException e) {}
					System.out.println("run" + i);
					
					sb.append("*");
				}
				System.out.println("run end"+sb.toString());
			}
		};
		//r.run() -> �̰� �����ϸ� �ݺ����� ������� ��������� �����带 �ϸ� �� �ݺ����� ���ÿ� �����
		Thread t = new Thread(r);
		t.start();
		
		
		for (int i=0; i<100; i++) {
			try {//Thread.~�� �ݵ�� try ~ catch�� �ȿ��� �����
				Thread.sleep(250); // 0.5�ʵ��� ���缱��.
				
			}
			catch(InterruptedException e) {}
			System.out.println("main" + i);
			sb.append("#");
		}
		System.out.println("main end");
	}
}

/*
	- �ϳ��� ���μ��� �ȿ��� ���������� �����ϴ� '������' ���α׷��� �����ϴ� ���� �������� ����
	
	- �����带 �����ϰ� ������ ���α׷������� main�� �����ٰ� �ؼ� ���� �� �ƴ϶�
	��� �����尡 ���� ���� ���α׷��� ����ȴ�.
	
	- �ϳ��� �������� �ȿ��� ������ ������� ���̿����� �޸� ������ �����ϴ�.
	- ���μ��� (�����ϴ� ���α׷�)���� �޸� ������ �Ұ�����. �����̳� ��������� �̿��Ͽ� ������ ����.
*/