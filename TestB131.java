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


	���� 1
	AD apple : apple �� ����
	PA       : ������� ����� ������ ������� ���
	
	���� 1�� �� �ѻ������ ���� �߰� ���� 
	PR an    : an �̶�� �ܾ ������ ������ ��� ( banana orange )
*/