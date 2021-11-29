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
		isNull(found) ? found = apple([8], 4); --실행안함
		return [4]
		
		[3]에 도착해서 보니 찾는 값이 4이더라.
		그러면 굳이 왼쪽은 볼필요가 없다.
		그래서 개선한 것 : found == null && n.data > d
		
		[5]에 도착해서 보니 찾는 값이 4이면
		굳이 오른쪽은 볼 필요가 없다.
		개선 : found == null  && n.data < d
		
	*/
	public static Node apple ( Node n, int d ) {
		Node found = null;
		if (n!=null) {
			//찾던값과 data가 맞으면 내가 찾던 그넘
			if(n.data == d) {
				found = n;
			}
			//아니면 왼쪽으로가면서 찾아봄
			if (found == null && n.data > d)
				found = apple(n.left, d);
			
			//아니면 오른쪽으로 가면서 찾아봄
			if (found == null  && n.data < d) 
				found = apple(n.right, d);
		}
		return found;
	}
}
/*

*/