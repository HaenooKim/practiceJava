import java.util.*;

/*
	wait(), notify()는 Thread와 관려된 함수지만 Object에 선언된 함수이다.
	사실은 this.wait()인데 this가 생략된것 wait가 선언하지 않아도 쓸수 있는 경우는 조상으로 부터 물려받아서 그런건데
	table의 조상의 object이기 때문
	
	object입장에서 준비가 안되었을때 자신을 이용하려고 하는 쓰레드를 멈춰세우고 (wait())
	
	테이블입장에서 접시가 5장 넘게 쌓였으면 shampoo는 잠시 멈춰세워야 하고
	접시가 없으면 wash는 잠시 멈춰 세워야 하는 상황이다.
	
	현재 테이블이 멈춰세운 스레드가 있으면 그 넘을 께우는게 notify()임.
*/

class ShampooAI extends Thread {
	private Table tbl = null;
	public ShampooAI( Table t ) {
		this.tbl = t;
	}
	
	public void run() {
		for( int i = 0 ; i < 300 ; i++ ) {
			String d = "dish " + i;
			tbl.on( d );
		}
	}
}

class WashAI extends Thread {
	private Table tbl = null;
	public WashAI( Table t ) {
		this.tbl = t;
	}
	
	public void run() {
		for( int i = 0 ; i < 300 ; i++ ) {
			String d = tbl.off();
		}
	}
}

class Table {
	private List<String> dishes = null;
	public Table() {
		dishes = new LinkedList<String>();
	}
	
	public synchronized void on( String dish ) {
		while(dishes.size()==5) {
			try {
				wait(); //이 함수 호출하는 쓰레드야 너 뭠춰
			}
			catch (InterruptedException e){}
			
		}
		System.out.println( dish + " : on the table" );
		dishes.add( dish );

		notify(); //접시가 올라오면 wash 시작
	}
	
	/*
	만일 수백개의 쓰레드가 동시에 작업하게 되면 wait되었다가 깨어났는데
	다시 텅비어 있게되면 다시 wait되어야 한다. 따라서 이 경우 if대신 while을 사용함
	
	wait()와 notify()를 이용하여 객체가 준비된 상황에서만 쓰레드가 객체의 함수가 호출될 수 있도록
	컨트롤 하는데 이를 모니터기법이라고 한다.
	*/
	
	public synchronized String off() {
		while (dishes.size() ==0) {
			try {
				wait();
			}
			catch(InterruptedException e){}
		}
		
		int sz = dishes.size();
		
		String d = dishes.remove( sz - 1 );
		System.out.println( d + " : off the table" );
			
		notify(); //자신이 멈춘 스레드를 다시 일하도록 하는 코드
		
		return d;
	}
}

public class Test219 {
	public static void main( String[] args ) {
		Table table = new Table();

		Thread s = new ShampooAI( table );
		Thread w = new WashAI( table );
		s.start();
		w.start();
	}
}