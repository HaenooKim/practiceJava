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
//	216 에서 synchronized 없애고 기록을 테이블 안에서 하는 코드로 바꿨다.
class Table {
	private List<String> dishes = null;
	public Table() {
		dishes = new LinkedList<String>();
	}
	
	//	선언부에 synchronized 를 명시하면 함수가 호출할 때 this 를 잠그고 , 호출이 끝나면 풀어준다.
	public synchronized void on( String dish ) {  
		System.out.println( dish + " : on the table" );
		dishes.add( dish ); 
	}
	
	//	선언부에 synchronized 를 명시하면 함수가 호출할 때 this 를 잠그고 , 호출이 끝나면 풀어준다.
	/*
		synchronized 로 선언하는 함수는 어떨때 왜 붙여야 하는지 이해하는게 관건!!
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