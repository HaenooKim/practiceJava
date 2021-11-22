class Node {
	int name;
	Node next;
	
	Node(int i, Node j) {
		name = i;
		next = this;
	}
	
	
	
}

class XList {
	Node head = null;
	Node tail = null;
	
	XList() {
		head = new Node(0, null);
		tail = head;
	}
	
	void add(int i) {
		
		tail.next = new Node(i, null);
		tail = tail.next;
	}
}


public class practiceLinkedList {
	public static void main(String[] args) {
		XList l = new XList();
		l.add(10);
		
	}
}