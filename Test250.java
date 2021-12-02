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

public class Test250 {
	public static void main( String[] args ) {
		Node root = new Node( 5 );
		Node a = root.left = new Node( 3 );
		Node b = root.right = new Node( 8 );		
		a.left = new Node( 1 );
		a.right = new Node( 4 );

		root = rotationR(root);
		print( root , 0 );
	}	
}

class Logic 
{
	public static Node rotationR(Node a) {
		Node b = a.left;
		a.left = b.right;
		b.right = a;
		return b; //루트가 바뀜
	}
	
	//	노드의 깊이를 같이 가져가게끔 함수를 짰음
	public static void print( Node n, int d ) {
		if( n != null ) {
			print( n.left, d+1 );
			System.out.println( n.data + " ["+d+"]" );
			print( n.right, d+1 );
		}
	}
}