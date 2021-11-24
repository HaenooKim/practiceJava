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
	독립적으로, 독자적으로 동시에 실행되는 코드는 스레드로 만들고
	그것이 이용하는 클래스는 보통클래스 코드로 하면된다.
	
	지금 같은 칸에 들어가서 동시에 일을 보겟다고 난리난 상황인데,
	여러 쓰레드가 동시에 하나의 인스턴스를 사용하는 경우에 반드시 처리해야 하는 일이 생긴다.
	
	모두가 각각 자신의 전용 화장실을 가지고 있으면 이런일이 생기지 않겠지만 현실적으로는 불가능하다.
	이런 경우에는 먼저 사용하는 스레드가 문을 잠그고 들어가면 그 다음 쓰레드는 기다리야 한다.
	- 이 개념이 동기화 (synchronizeation) 개념이 되고 이는 java언어의 키워드로 지원되고 있다.
*/