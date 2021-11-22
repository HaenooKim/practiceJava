class Node{
	int name = 0;
	Node next = null;
	
	Node(int i, Node j) {
		name = i;
		next = j;
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
	
	void printAll() {
		Node t;
		for (t = head; t!=null; t=t.next) {
			System.out.println(t.name);
		}
	}
}



public class Test084 {
	public static void main(String[] args) {
		XList l = new XList();
		l.add(10);
		l.add(20);
		
		l.printAll();
	}
}