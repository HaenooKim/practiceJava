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

public class Test241 {
	public static void main( String[] args ) {
		Node root = new Node( 5 );
		
		Node a = root.left = new Node( 3 );
		Node b = root.right = new Node( 8 );
		
		a.left  = new Node( 1 );
		a.right = new Node( 4 );
		
		print( root );
	}	
}

class Logic {
	public static void print ( Node n ) {
		if( n != null ) {
			System.out.println( n.data );
			print( n.left );
			print( n.right );
		}
	}
}
/*
print(n=[5])
		System.out.println(5)
		print(n = [3])
			System.out.println(3)
			print([1])
				System.out.println(1)
				print(null)
				print(null)
			print([4])
				System.out.println(4)
				print(null)
				print(null)
		print([8])
			System.out.println(8)
			print(null)
			print(null)
	5 3 1 4 8?? ??¥ì??

*/