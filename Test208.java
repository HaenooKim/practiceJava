/*
	코드상으로 에러는 안 나지만 쪽잠자러 들어란 중에는 다른 사람들이 큰일을 못보고 
	계속 기다려야 하는 얘긴데 이건 화장실 설계에 중대한 실수가 있다는 것.
*/


class Toilet {
	
	/*
		은행지점이고 은행에 관련된 모든 엄무가 여기서 함수형태로 제공되고 있다고 하자.
		100개의 쓰레드가 이 인스턴스를 공유하고 있다고 가정하자
		
		bigwork = 계좌입금
		sleep - 통장정리
		
		만일 이 둘이 동시에 일어나도 별 문제가 없는 사안이라면?
		그런데 그런 사안을 지금처럼 설계했다면?
		하나가 끝나야지만 다른 하나를 일하게 만든다면 그 기다리는 동안 쓰레드는 논다.
		이것을 hainging현상이라 하고 이 기간cpu의 소모는 잡히지 않는다.
	
		쪽잠자는 곳과 화장실을 분리하고 화장실에서 쪽잠을 못자게 만들면?
		toielt클래스에 sleep을 넣지말고 bedroom을 따로 만들어서 그걸 공유하게 만들면 된다.
	
		최대한 스레드가 놀지 않도록 슬계해야함. 그것을 위해서는 어떤 일들이 어떤 객제에 배치되어야 하고 동시에실행 가능 한 지를
		면밀히 따져야 한다.
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
	
	//이 함수는 백그라운드 스레드가 호출되게 만들어야 한다.
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