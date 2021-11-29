package banana;

import static banana.Logic.*;

class Node {
	int data = 0;
	Node left  = null;
	Node right = null;
	
	public Node( int data ) {
		this.data = data;
	}
}

public class Test246 {
	public static void main( String[] args ) {
		Node root = null;
		root = new Node( 5 );
		
		Node a = root.left = new Node( 3 );
		Node b = root.right = new Node( 8 );
		
		Node c = a.left  = new Node( 1 );
		a.right = new Node( 4 );
		
		Node found = find( root, 5 );
		if( found != null ) {
			System.out.println( found.data );
		}
	}	
}

class Logic 
{
	public static Node find( Node n, int d ) {
		Node found = null;
		if( n != null )
		{
			if( n.data == d )
				found = n;
			
			if( found == null && n.data < d )	//	n.data[3] , d[4] 왼쪽으로 갈 필요??
				found = find( n.left , d );
			
			if( found == null && n.data > d )	//	n.data[5] , d[4] 오른쪽은 볼 필요 없다. 5보다 클 테니 
				found = find( n.right , d );
		}			
		return found;
	}
}

/*
	----------------------------------------------------------
	4. ??????? ???
	
	public static Node find( Node n, int d ) {
		Node found = null;
		if( n != null )
		{
			if( n.data == d )
				found = n;
			
			if( found == null )
				found = find( n.left , d );
			
			if( found == null )
				found = find( n.right , d );
		}			
		return found;
	
	----------------------------------------------------------
	
	3. ??u?? ?? ?湮??? ???? ?????? ??
	
	public static Node find( Node n, int d ) {
		Node found = null;
		if( n != null )
		{
			if( n.data == d ) {
				found = n;
			}
			
			System.out.println( "-" + n.data );
			find( n.left , d );
			find( n.right , d );
		}			
		return found;
	}
}

	
	2. ???????? 5(??????)?? ????????
	
	public static Node find( Node n, int d ) {
		Node found = null;
		if( n != null )
		{
			if( n.data == d ) {
				found = n;
			}
		}			
		return found;
	}


	----------------------------------------
	1. ??? ????? §??.
	
	public static Node find( Node n, int d ) {
		return null;
	}
}

*/
