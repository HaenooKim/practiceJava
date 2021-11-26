import java.util.*;

interface IWork {
	public void doIt( String threadName ) throws Throwable;	
}

class WorkQueue {
	private LinkedList<IWork> queue = null;
	
	public WorkQueue() {
		queue = new LinkedList<IWork>();
	}
	
	public synchronized void enqueue( IWork iw ) {
		queue.add( iw );
		notifyAll();
	}
	
	public synchronized IWork dequeue() {
		while( queue.size() == 0 ) {
			try {
				wait();
			}
			catch( InterruptedException e ){}
		}
		return queue.remove( 0 );
	}
}

class WorkThread extends Thread 
{
	private String name = null;
	private WorkQueue queue = null;
	
	public WorkThread( WorkQueue q, String n ) {
		this.queue = q;
		this.name = n;
	}
	
	public void run() {
		boolean alive = true;
		while( alive ) {
			IWork iw = queue.dequeue();
			
			/*
				A t = new B();
				System.out.println(t instanceof B)
			*/
			if(iw instanceof QuitWork) {
				alive = false;
			}
			
			try {
				iw.doIt( name );
			}
			catch( Throwable e ) {
				e.printStackTrace();
			}
		}//run()이 종료되면 쓰레드는 종료 -> 반복문을 빠져나오게 만들면 된다.
	}
}

//	대기열에 넣기 위한 가상의 작업
class TestWork implements IWork 
{
	private String name = null;
	
	public TestWork( String n ) {
		this.name = n;
	}

	public void doIt( String threadName ) throws Throwable {
		for( int i = 0 ; i < 3 ; i++ ) {
			System.out.println( "testwork "+ name +" ["+threadName+"] ("+i+")" );
			try {
				Thread.sleep( 500 + (int)(Math.random()*500) );
			}
			catch( InterruptedException e ){}
		}
	}
}

public class Test226 {
	public static void main( String[] args ) {
		
		List<Thread> bankers = new ArrayList<Thread>();
		WorkQueue queue = new WorkQueue();
		
		String[] names = {"apple","banana","orange"};
		for( String name : names ) {
			bankers.add( new WorkThread( queue, name ) );
		}
		
		for( Thread banker : bankers ) {
			banker.start();
		}
		
		for( int i = 0 ; i < 30 ; i++ ) {
			queue.enqueue( new TestWork( "work" + i ) );
		}
	}
}
/*
	thread는 light-weighted process : 독자적으로 수행되고 메모리 공유가능
	process내의 모든 쓰레드가 종료되면 프로그램은 죽는다.
	이 프로그램은 어떻게 자연스럽게 죽일까?
	
	java.lang.Thread의 aip문서를 찾아보면
	쓰레드를 정교하게 컨트롤 할 수 있는 함수는 죄다 deprecated되었다고 보면 된다.
	-> deprecated된것들은 이런것들이 없어도 충분히 다른걸로 구현가능한 것이 첫번째 이유
	쓰레드는 OS의 개념을 자바가 빌려서 쓰고 있다 -> OS마다 쓰레든느 다 다름
	정교한 쓰레드 컨트롤이 안되는 os에서도 java는 돌아가야 하니까
	결국 모든 os에서 지원하는 공통적인 핵심 기능만 java의 쓰레드가 제공한다.
*/