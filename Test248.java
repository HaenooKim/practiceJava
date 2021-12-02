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

public class Test248 {
	public static void main( String[] args ) {
		Node root = null;
		
		root = add(root, 5);
		root = add(root, 3);
		root = add(root, 8);
		root = add(root, 4);
		/*	아래의 모양대로 노드를 배치하던 걸 함수 호출로!
		root = new Node( 5 );
		
		Node a = root.left = new Node( 3 );
		Node b = root.right = new Node( 8 );
		
		Node c = a.left  = new Node( 1 );
		a.right = new Node( 4 );
		*/
		print(root, 0);
	}	
}

class Logic 
{
	/*
		root = add(null, 5);
			return [5]
		root = add([5], 3);
			[5].left = add(null, 3) : [3] 
				add(null, 3)
				return [3]
	*/
	public static Node add(Node n, int d) {
		if (n==null) {
			n = new Node(d);
		}
		else {
			if(n.data>d) {
				n.left = add(n.left, d);
			}
			else if (n.data < d) {
				n.right = add(n.right, d);
			}
			else  //같은 숫자가 들어올 경우
				throw new RuntimeException ("data duplicated");
			
		}
		
		return n;
	}
	// 노드의 깊이를 같이 가져가게끔 함수를 짬.
	public static void print(Node n, int d) {
		if (n!=null) {
			print(n.left, d+1);
			System.out.println(n.data + "[" +d+"]");
			print(n.right, d+1);
		}
	}
	
}

