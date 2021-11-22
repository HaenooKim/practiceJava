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
	
	
}



public class Test080 {
	public static void main(String[] args) {
		XList l = new XList();
		l.add(10);
		l.add(20);
		l.printAll();
	}
}