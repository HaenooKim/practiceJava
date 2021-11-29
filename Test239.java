package banana;

import static banana.Logic.*;

class Logic {
	public static void print(Node head) {
		if (head!=null) {
			System.out.println(head.data);
			print(head.next);
		}
		
		/*
		
			��� ȣ���� �޸� �Ҹ� ����?? �ݺ������� ó���� ��쿡 ���� �޸� �Ҹ� ���� ���̴�.
			-�ڵ���ü�� ª�� �������� ���� ���ȣ���� �ݺ��Ǹ� �޸𸮰� �ݹ� �ٴڳ���.
		*/
		
	}
}

class Node {
	int data = 0;
	Node next = null;
	
	public Node(int i, Node n) {
		this.data = i;
		this.next = n;
	}
}

public class Test239 {
	public static void main(String[] args) {
		Node head = new Node(0, null);
		Node tail = head;
		
		tail.next = new Node(10, null);
		tail = tail.next;
		
		tail.next = new Node(20, null);
		tail = tail.next;
		
		tail.next = new Node(30, null);
		tail = tail.next;
		
		tail.next = new Node(40, null);
		tail = tail.next;
		
		/*
		for (Node t=head.next; t!=null; t=t.next) {
			System.out.println(t.data);
		}
		*/
		
		print(head.next);
	
	}
}

/*
	��������� ���ú����� �̸��� ���� �� �ִ�. �׶� ������?
	this.data �� �������, �׳� data�� ���ú����̴�.
	�̸��� ��ġ������ ������ ���� �� �ʿ�� ���µ� �̸��� ��ġ�� this.~�� ����.
	
	
	
*/