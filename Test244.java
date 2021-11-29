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
	Binary Tree���� ��带 ��ġ�ϴ� ��Ģ
	
	Ư�� data���� ���� ��带 ��ġ�� ��
	1. �ߺ��� ������� �ʴ´�.
	2. ������ �������� ������.
	3. ũ�� ���������� ������.
	4. null�� ������ �ű⿡ ���δ�.
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
		System.out.println("�ּҰ� : " + r);
	}	
}

class Logic {
	/*
		����Ʈ�� ��Ģ��� ��尡 ��ġ�Ǹ� �Ʒ� �ڵ�� ���ĵ� ������� ����Ѵ�.
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
	
	//���ȣ�� ���� �ּҰ��� ã�� ����
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