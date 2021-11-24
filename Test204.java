/*
쓰레드 생성하는 첫번째 방법 (보통 이걸 많이 씀)
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
		//r.run() -> 이걸 실행하면 반복문이 순서대로 실행되지만 스레드를 하면 두 반복문이 동시에 수행됨
		Thread t = new Thread(r);
		t.start();
		
		
		for (int i=0; i<100; i++) {
			try {//Thread.~는 반드시 try ~ catch문 안에서 써야함
				Thread.sleep(250); // 0.5초동안 멈춰선다.
				
			}
			catch(InterruptedException e) {}
			System.out.println("main" + i);
			sb.append("#");
		}
		System.out.println("main end");
	}
}

/*
	- 하나의 프로세스 안에서 독자적으로 동작하는 '가벼운' 프로그램을 생성하는 것이 스레드의 개념
	
	- 쓰레드를 생성하고 돌리는 프로그램에서는 main이 끝났다고 해서 끝난 게 아니라
	모든 쓰레드가 끝이 나야 프로그램이 종료된다.
	
	- 하나의 포르세스 안에서 생성된 쓰레드들 사이에서는 메모리 공유가 가능하다.
	- 프로세스 (동작하는 프로그램)상의 메모리 공유는 불가능함. 파일이나 소켓통신을 이용하여 전달은 가능.
*/