class Node <T> {
	T name = null;
	Node<T> next = null;
	
	Node( T i, Node<T> j ) {
		this.name = i;		
		this.next = j;
	}
}

public class Test122 {
	public static void main( String[] args ) 
	{
		Node<Integer> head = new Node<Integer>( 0, null );
		Node<Integer> tail = head;
		
		tail.next = new Node<Integer>( 10, null );
		tail = tail.next;
	
		tail.next = new Node<Integer>( 20, null );
		tail = tail.next;

		for( Node<Integer> t = head.next ; t != null ; t = t.next ) {
			System.out.println( t.name );
		}
		
		Node<Integer> post = head;
		Node<Integer> pre = head.next;
		while( pre != null ) {
			post.next = null;
			
			post = pre;
			pre = pre.next;
		}
		
		for( Node<Integer> t = head.next ; t != null ; t = t.next ) {
			System.out.println( "- " + t.name );
		}
	}
}

/*

*/