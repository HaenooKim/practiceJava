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
	
	{...} 의 영역에 들어가기 위해서는 toi 가 가리키는 인스턴스가 가지 key를 획득해야 한다.
	모든 인스턴스는 하나의 키를 가지고 있다.
	
	kim park이 동시에 toilet에 들어왔어도 kim이 먼저 열쇠를 갖고 들어가면 park은 열쇠가 반납될때 까지 기다려야 한다.
	
	열쇠를 가져야만 {을 통과할 수 있고 } 시점에서 열쇠는 인스턴스에게 반납된다. 

	synchronized 는 함수가 아닌 자바키워드임. 이를 통해서 동시에 인스턴스를 이용하는 쓰레드에 의해서 
	벌어질 수 있는 상황(하나의 객체를 두 여러 쓰레드가 동시에 사용하면 안되는 일)을 막을 수 있다.
*/