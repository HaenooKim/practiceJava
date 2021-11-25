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
			
			try {
				iw.doIt( name );
			}
			catch( Throwable e ) {
				e.printStackTrace();
			}
		}
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

public class Test225 {
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
C:\JavaWork>java Test225
testwork work0 [orange] (0)
testwork work2 [apple] (0)
testwork work1 [banana] (0)
testwork work1 [banana] (1)
testwork work0 [orange] (1)
testwork work2 [apple] (1)
testwork work0 [orange] (2)
testwork work1 [banana] (2)
testwork work2 [apple] (2)
testwork work3 [banana] (0)
testwork work4 [apple] (0)
testwork work5 [orange] (0)
testwork work4 [apple] (1)
testwork work3 [banana] (1)
testwork work5 [orange] (1)
testwork work4 [apple] (2)
testwork work3 [banana] (2)
testwork work5 [orange] (2)
testwork work6 [apple] (0)
testwork work7 [banana] (0)
testwork work8 [orange] (0)
testwork work7 [banana] (1)
testwork work6 [apple] (1)
testwork work8 [orange] (1)
testwork work6 [apple] (2)
testwork work7 [banana] (2)
testwork work8 [orange] (2)
testwork work9 [apple] (0)
testwork work10 [orange] (0)
testwork work11 [banana] (0)
testwork work9 [apple] (1)
testwork work10 [orange] (1)
testwork work11 [banana] (1)
testwork work9 [apple] (2)
testwork work10 [orange] (2)
testwork work11 [banana] (2)
testwork work12 [apple] (0)
testwork work13 [banana] (0)
testwork work14 [orange] (0)
testwork work13 [banana] (1)
testwork work12 [apple] (1)
testwork work14 [orange] (1)
testwork work13 [banana] (2)
testwork work12 [apple] (2)
testwork work14 [orange] (2)
testwork work15 [banana] (0)
testwork work16 [apple] (0)
testwork work17 [orange] (0)
testwork work15 [banana] (1)
testwork work16 [apple] (1)
testwork work17 [orange] (1)
testwork work15 [banana] (2)
testwork work16 [apple] (2)
testwork work17 [orange] (2)
testwork work18 [banana] (0)
testwork work19 [apple] (0)
testwork work20 [orange] (0)
testwork work18 [banana] (1)
testwork work20 [orange] (1)
testwork work19 [apple] (1)
testwork work18 [banana] (2)
testwork work19 [apple] (2)
testwork work21 [banana] (0)
testwork work20 [orange] (2)
testwork work22 [apple] (0)
testwork work21 [banana] (1)
testwork work23 [orange] (0)
testwork work23 [orange] (1)
testwork work21 [banana] (2)
testwork work22 [apple] (1)
testwork work23 [orange] (2)
testwork work22 [apple] (2)
testwork work24 [banana] (0)
testwork work24 [banana] (1)
testwork work25 [orange] (0)
testwork work26 [apple] (0)
testwork work25 [orange] (1)
testwork work24 [banana] (2)
testwork work26 [apple] (1)
testwork work27 [banana] (0)
testwork work25 [orange] (2)
testwork work26 [apple] (2)
testwork work27 [banana] (1)
testwork work28 [orange] (0)
testwork work27 [banana] (2)
testwork work29 [apple] (0)
testwork work28 [orange] (1)
testwork work29 [apple] (1)
testwork work28 [orange] (2)
testwork work29 [apple] (2)

*/