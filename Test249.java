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

public class Test249 {
	public static void main( String[] args ) {
		Node root = new Node( 5 );
		
		Node a = root.left = new Node( 3 );
		Node b = root.right = new Node( 8 );
		
		root = temp(root);
		print( root , 0 );
	}	
}

class Logic {
	public static Node temp2(Node n) {
		Node t = n.left;
		n.left = null;
		t.right = n;
		return t;
	}
	
	//내일 배울 노드 삭제 알고리즘의 일부
	public static Node temp(Node n) {
		return n.left;
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