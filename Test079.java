class Node {
	int name =0;
	Node next = null;

	Node(int i, Node j) {
		this.name = i;
		next = j; //this가 생략가능.
	}
}

class XList {
	Node head = null;
	Node tail = null;
	
	XList() {
		this.head = new Node(0, null);
		this.tail = this.head;
	}
	
	void add(int i) {
		tail.next = new Node(i, null);
		tail = tail.next;
	}
	
	void print() {
		for (Node t = this.head; t!=null; t=t.next) {
			System.out.println(t.name);
		}
	}
	
	void deleteAll() {
		Node post = head;
		Node pre = head.next;
		while(pre!=null) {
			//System.out.println(pre.name);
			post.next = null;
			post = pre;
			pre = pre.next;
			
			//System.out.println(post.name);
		}
		post = null;
		
		tail = head;
	}
}


public class Test079 {
	public static void main(String[] args) {
		XList l = new XList();
		l.add(10);
		l.add(20);
		
		l.print();
		
	}
}

/*
	멤버변수 멤버함수 생성자 함수 this 인스턴스 참조형변수
	
	java에서는 로컬변수와 이름이 겹치지만 않으면 this를 생략가능.
	
	멤버변수는 인스턴스 생성시 메모리 할당. 알아서 소거. 수거되는 시점은 밥줄 끊겼을 때 (포인터가 0개 되는 시점)
*/