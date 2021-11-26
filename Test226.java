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
		}//run()�� ����Ǹ� ������� ���� -> �ݺ����� ���������� ����� �ȴ�.
	}
}

//	��⿭�� �ֱ� ���� ������ �۾�
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
	thread�� light-weighted process : ���������� ����ǰ� �޸� ��������
	process���� ��� �����尡 ����Ǹ� ���α׷��� �״´�.
	�� ���α׷��� ��� �ڿ������� ���ϱ�?
	
	java.lang.Thread�� aip������ ã�ƺ���
	�����带 �����ϰ� ��Ʈ�� �� �� �ִ� �Լ��� �˴� deprecated�Ǿ��ٰ� ���� �ȴ�.
	-> deprecated�Ȱ͵��� �̷��͵��� ��� ����� �ٸ��ɷ� ���������� ���� ù��° ����
	������� OS�� ������ �ڹٰ� ������ ���� �ִ� -> OS���� ������� �� �ٸ�
	������ ������ ��Ʈ���� �ȵǴ� os������ java�� ���ư��� �ϴϱ�
	�ᱹ ��� os���� �����ϴ� �������� �ٽ� ��ɸ� java�� �����尡 �����Ѵ�.
*/