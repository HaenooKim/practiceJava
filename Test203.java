/*
	Thread�� �����ϴ� ���
	1. Runnable �������̽��� ��ӹ��� Ŭ������ �ν��Ͻ��� �����Ѵ�.
	2. public void run()�� �������̵��Ѵ�.
	3. Thread�� �����ڿ� �־��ش�.
	4. start()ȣ���ϸ�  > OS�� ��û�Ͽ� Thread�� �Ҵ�ް� > �װ��� run()�� ���� 
*/


public class Test203 {
	public static void main(String[] args) {
	
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Hello Thread");
			}
		};
	
		Thread t = new Thread(r);
		t.start();
	}
}

/*
	Thread : light-wegihted prgram
	process : �������� ���α׷�
	program : ���డ���� ����
	
	Thread�� Process �ȿ����� ������ �� �ִ�.
	��� Thread�� ����� �������� Process�� ����ȴ�.
	
	Runnable r = new Runnable() {
			public void run() {
				System.out.println("Hello Thread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	
*/
