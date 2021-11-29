package banana;

import static banana.Logic.*;


class Logic {
	
}

class Node {
	int data = 0;
	Node left = null;
	Node right = null;
	
	public Node(int data) {
		this.data = data;
	}
}

public class Test240 {
	public static void main(String[] args) {
		Node root = new Node(5);
		
		// 이렇게 코드를 쓰면 a와 root.lrft는 같은대상(new Node(3))을 가리키게 된다.
		// .left.right가 난무하는 코드보다 이쪽이 이해가 쉽다면 이렇게 짜면 됨.
		Node a = root.left = new Node(3);
		Node b = root.right = new Node(8);
		
		System.out.println(a==root.left);
		System.out.println(b==root.right);
		
		//root.left.left = new Node(1);
		a.left = new Node(1);
		//root.left.right = new Node(4);
		b.right = new Node(4);
	}
}

/*
	이런식으로 포인터 두개를 가지고 아래쪽으로 쭉쭉 이어붙이는 형태의 자료구조를 이진트리라고 하고
	꽤 유용하게 많이 쓰인다.
	List(7), tree(2), graph(1)
	
*/