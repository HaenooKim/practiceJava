class Node {
	int name = 0;
	Node next = null;
	
	Node(int i, Node j) {
		this.name = i;
		this.next = j;
	}
}

class XList {
	Node head = null;
	Node tail = null;
	
	XList() {
		this.head = new Node(0, null);
		tail = head;
	}
	
	void add(int i) {
		tail.next = new Node(i, null);
		tail = tail.next;
	}
	
	void printAll() {
		Node t;
		for (t=head; t!=null; t=t.next) {
			System.out.printf("%d\n", t.name);
		}
	}
	
	void deleteAll() {
		Node post = head;
		Node pre = post.next;
		
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

public class Test081 {
	public static void main(String[] args) {
		XList l = new XList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.printAll();
		l.deleteAll();
	}
}