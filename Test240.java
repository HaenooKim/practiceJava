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
		
		// �̷��� �ڵ带 ���� a�� root.lrft�� �������(new Node(3))�� ����Ű�� �ȴ�.
		// .left.right�� �����ϴ� �ڵ庸�� ������ ���ذ� ���ٸ� �̷��� ¥�� ��.
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
	�̷������� ������ �ΰ��� ������ �Ʒ������� ���� �̾���̴� ������ �ڷᱸ���� ����Ʈ����� �ϰ�
	�� �����ϰ� ���� ���δ�.
	List(7), tree(2), graph(1)
	
*/