/*
	Thread를 생성하는 방법
	1. Runnable 인터페이스를 상속받은 클래스의 인스턴스를 생성한다.
	2. public void run()을 오버라이딩한다.
	3. Thread의 생성자에 넣어준다.
	4. start()호출하면  > OS에 요청하여 Thread를 할당받고 > 그것이 run()을 돌림 
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
	process : 실행중인 프로그램
	program : 실행가능한 파일
	
	Thread는 Process 안에서만 존속할 수 있다.
	모든 Thread가 종료된 시점에서 Process는 종료된다.
	
	Runnable r = new Runnable() {
			public void run() {
				System.out.println("Hello Thread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	
*/
