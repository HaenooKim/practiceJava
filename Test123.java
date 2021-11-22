class Node<T> {
	T name = null;
	Node<T> next = null;
	
	Node(T i, Node<T> j) {
		this.name = i;
		this.next = j;
	}
}

interface IList <Z> {
	public void add(Z i);
}

class XList<T> implements IList<Z> {
	private Node<T> head = null;
	private Node<T> tail = null;
	
	XList() {
		head = new Node<T>(null, null);
		tail = head;
	}
	
	public void add(T i) {
		tail.next = new Node<T>(null, null);
		tail = tail.next;
	}
}


public class Test123 {
	public static void main(String[] args) {
		XList<Integer> l = new XList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
	}
}