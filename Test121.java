interface IList<X> {
	public void add(X i);
	public void deleteAll();
	public void printAll();
}

class Node <X>{
	X name;
	Node<X> next;
	
	Node(X i, Node<X> j) {
		this.name = i;
		this.next = j;
	}
	
}

class XList<X> implements IList<X>{
	Node<X> head = null;
	Node<X> tail = null;
	
	XList() {
		head = new Node<X>(null, null);
		tail = head;
	}
	
	public void add(X i) {
		tail.next = new Node<X>(i, null);
		tail = tail.next;
	}
	
	public void printAll() {
		for (Node<X> t = head; t!=null; t=t.next) {
			System.out.println(t.name);
		}
	}
	
	public void deleteAll() {
		Node<X> post = head;
		Node<X> pre = post.next;
		
		while(pre!=null) {
			//System.out.println(post.name);
			post.next = null;
			post = pre;
			pre = pre.next;
			//System.out.println(post.name);
		}
		post = null;
		
		tail = head;
	}
	
		
}

public class Test121 {
	public static void main(String[] args) {
		IList<String> l = new XList<String>();
		
	}
}