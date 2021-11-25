import java.util.*;

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
//	216 ���� synchronized ���ְ� ����� ���̺� �ȿ��� �ϴ� �ڵ�� �ٲ��.
class Table {
	private List<String> dishes = null;
	public Table() {
		dishes = new LinkedList<String>();
	}
	
	//	����ο� synchronized �� ����ϸ� �Լ��� ȣ���� �� this �� ��װ� , ȣ���� ������ Ǯ���ش�.
	public synchronized void on( String dish ) {  
		System.out.println( dish + " : on the table" );
		dishes.add( dish ); 
	}
	
	//	����ο� synchronized �� ����ϸ� �Լ��� ȣ���� �� this �� ��װ� , ȣ���� ������ Ǯ���ش�.
	/*
		synchronized �� �����ϴ� �Լ��� ��� �� �ٿ��� �ϴ��� �����ϴ°� ����!!
	*/
	public synchronized String off() {
		int sz = dishes.size();
		if( sz > 0 ) 
		{
			String d = dishes.remove( sz - 1 );
			System.out.println( d + " : off the table" );
			return d;
		} else {
			return null;
		}
	}
}

public class Test218 {
	public static void main( String[] args ) {
		Table table = new Table();

		Thread s = new ShampooAI( table );
		Thread w = new WashAI( table );
		s.start();
		w.start();
	}
}/*

C:\JavaWork>java Test218
dish 0 : on the table
dish 0 : off the table
dish 1 : on the table
dish 1 : off the table
dish 2 : on the table
dish 2 : off the table
dish 3 : on the table
dish 3 : off the table
dish 4 : on the table
dish 4 : off the table
dish 5 : on the table
dish 5 : off the table
dish 6 : on the table
dish 6 : off the table
dish 7 : on the table
dish 8 : on the table
dish 9 : on the table
dish 10 : on the table
dish 11 : on the table
dish 12 : on the table
dish 13 : on the table
dish 14 : on the table
dish 15 : on the table
dish 16 : on the table
dish 17 : on the table
dish 18 : on the table
dish 19 : on the table
dish 20 : on the table
dish 21 : on the table
dish 22 : on the table
dish 23 : on the table
dish 24 : on the table
dish 25 : on the table
dish 26 : on the table
dish 27 : on the table
dish 28 : on the table
dish 29 : on the table
dish 30 : on the table
dish 31 : on the table
dish 32 : on the table
dish 33 : on the table
dish 34 : on the table
dish 35 : on the table
dish 36 : on the table
dish 37 : on the table
dish 38 : on the table
*/