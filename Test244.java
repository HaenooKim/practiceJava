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

/*
	Binary Tree에서 노드를 배치하는 원칙
	
	특정 data값을 가진 노드를 배치할 때
	1. 중복은 허용하지 않는다.
	2. 작으면 왼쪽으로 보낸다.
	3. 크면 오른쪽으로 보낸다.
	4. null을 만나면 거기에 붙인다.
*/

public class Test243 {
	public static void main( String[] args ) {
		Node root = new Node( 5 );
		
		Node a = root.left = new Node( 3 );
		Node b = root.right = new Node( 8 );
		
		Node c = a.left  = new Node( 1 );
		a.right = new Node( 4 );
		
		c.right = new Node(2);
		b.left = new Node(7);
		b.right = new Node(9);
		
		apple( root );
		
		int r = min(root);
		System.out.println("최소값 : " + r);
	}	
}

class Logic {
	/*
		이진트리 원칙대로 노드가 배치되면 아래 코드는 정렬된 순서대로 출력한다.
	*/
	public static void apple ( Node n ) {
		if( n != null ) {
			apple( n.left );
			System.out.println( n.data );
			apple( n.right );
		}
	}
	
	public static int min(Node n) {
		if (n==null) {
			return -1;
		}
		
		else if(n.left!=null) {
			return min(n.left);
		}
		else {
			return n.data;
		}
	}
	
	//재귀호출 없이 최소값을 찾는 버전
	public static int min2(Node n) {
		if (n == null) {
			return -1;
		}
		
		while(n.left!=null) {
			n = n.left;
		}
		return n.data;
		
	}
}
/*
	min(n = [5]) : 1
		return min([3]) :1
		min(n= [3]) : 1
			return min([1]) : 1
			min(n = [1]) : 1
				return 1;
*/