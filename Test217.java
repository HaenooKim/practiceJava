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
// 215 ???? synchroniszed?? ????? ????? ????? ????? ??? ???? ????
class Table {
	private List<String> dishes = null;
	public Table() {
		dishes = new LinkedList<String>();
	}
	
	public void on( String dish ) {  
		System.out.println( d + " : on the table" );
		dishes.add( dish ); 
	}
	
	public String off() {
		int sz = dishes.size();
		if( sz > 0 ) 
		{
			String d = dishes.remove( sz - 1 )
			System.out.println( d + " : off the table" );
			return d;
		} else {
			return null;
		}
	}
}

public class Test216 {
	public static void main( String[] args ) {
		Table table = new Table();

		Thread s = new ShampooAI( table );
		Thread w = new WashAI( table );
		s.start();
		w.start();
	}
}/*


*/