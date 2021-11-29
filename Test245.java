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

public class Test245 {
	public static void main( String[] args ) {
		Node root = null;
		root = new Node( 5 );
		
		Node a = root.left = new Node( 3 );
		Node b = root.right = new Node( 8 );
		
		Node c = a.left  = new Node( 1 );
		a.right = new Node( 4 );
		
		
		Node found = apple(root, 4);
		if (found!=null) {
			System.out.println(found.data);
		}
		
	}	
}

class Logic 
{
	/*
	apple([5], 4);
		found = apple([3], 4);
		apple([3], 4) : [4]
			found = apple([1], 4);
				found = apple(null, 4);
				found = apple(null, 4);
				return null;
			isNull(found) ? found = apple([4], 4);
			apple([4], 4)
				found = [4];
				return [4];
		isNull(found) ? found = apple([8], 4); --�������
		return [4]
		
		[3]�� �����ؼ� ���� ã�� ���� 4�̴���.
		�׷��� ���� ������ ���ʿ䰡 ����.
		�׷��� ������ �� : found == null && n.data > d
		
		[5]�� �����ؼ� ���� ã�� ���� 4�̸�
		���� �������� �� �ʿ䰡 ����.
		���� : found == null  && n.data < d
		
	*/
	public static Node apple ( Node n, int d ) {
		Node found = null;
		if (n!=null) {
			//ã������ data�� ������ ���� ã�� �׳�
			if(n.data == d) {
				found = n;
			}
			//�ƴϸ� �������ΰ��鼭 ã�ƺ�
			if (found == null && n.data > d)
				found = apple(n.left, d);
			
			//�ƴϸ� ���������� ���鼭 ã�ƺ�
			if (found == null  && n.data < d) 
				found = apple(n.right, d);
		}
		return found;
	}
}
/*

*/