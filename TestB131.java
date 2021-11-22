import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class Test131 {
	public static void main( String[] args ) throws Exception {
		BufferedReader bin = new BufferedReader( new InputStreamReader( System.in ) );
		
		List<String> lst = new LinkedList<String>();
		while( true ) {
			String l = bin.readLine();
			if( l.equals("quit") ) {
				break;
			}
			
			if( l.startsWith("AD ") ) {
				lst.add( l.substring(3) );
			}
			else if( l.equals("PA") ){
				Iterator<String> it = lst.iterator();
				while( it.hasNext() ) {
					String t = it.next();
					System.out.println( t );
				}
			}
			else if( l.startsWith("PR ") ) {
				String keyword = l.substring(3);
				
				Iterator<String> it = lst.iterator();
				while( it.hasNext() ) {
					String t = it.next();
					if( t.indexOf( keyword ) != -1 ) {
						System.out.println( t );
					}
				}
			}
		}

		bin.close();
	}
}
/*

	----------------------------------------------------------------------
	
			if( l.startsWith("AD ") ) {
				lst.add( l.substring(3) );
			}
			else if( l.equals("PA") ){
				Iterator<String> it = lst.iterator();
				while( it.hasNext() ) {
					String t = it.next();
					System.out.println( t );
				}
			}
			
	----------------------------------------------------------------------
	
		while( true ) {
			
			String l = bin.readLine();
			
			if( l.equals("quit") ) {
				break;
			}
			
			if( l.startsWith("AD ") ) {
				lst.add( l.substring(3) );
			}
		}

	----------------------------------------------------------------------

		List<String> lst = new LinkedList<String>();
		
		while( true ) {
			
			String l = bin.readLine();
			
			if( l.equals("quit") ) {
				break;
			}
			
			lst.add( l );
		}
		
		Iterator<String> it = lst.iterator();
		while( it.hasNext() ) {
			String t = it.next();
			System.out.println( t );
		}


	과제 1
	AD apple : apple 을 저장
	PA       : 현재까지 저장된 내역을 순서대로 출력
	
	과제 1을 다 한사람들을 위한 추가 과제 
	PR an    : an 이라는 단어를 포함한 내역만 출력 ( banana orange )
*/