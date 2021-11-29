package banana;

import static banana.Logic.*;

class Logic {
	public static void print(Node head) {
		if (head!=null) {
			System.out.println(head.data);
			print(head.next);
		}
		
		/*
		
			재귀 호출은 메모리 소모가 많다?? 반복문으로 처리한 경우에 비해 메모리 소모가 많은 편이다.
			-코드자체는 짧은 편이지만 많은 재귀호출이 반복되면 메모리가 금방 바닥난다.
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
	멤버변수와 로컬변수가 이름이 같을 수 있다. 그때 구별은?
	this.data 는 멤버변수, 그냥 data는 로컬변수이다.
	이름이 겹치지지만 않으면 굳이 할 필요는 없는데 이름이 겹치면 this.~를 쓴다.
	
	
	
*/