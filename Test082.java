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
	
	int removeLikeQueue() {
		
		//비어있을 땐 동작하지 않도록 하기 위해 if문을 씀.
		if(head.next == null) {
			return -1;
		} //치명적인 문제 해결기법 1. 2개를 넣었는데 3개를 빼려고 할때 에러나는 것을 방지하기 위함.
		
		
		Node post = head;
		Node pre = head.next;
		
		post.next = pre.next;
		pre.next = null;
		
		//포인터의 ==는 같은 대상을 가리키면 true
		// tail == pre가 만족되는 시점은 딱 하나 남았을 때만 성립하고 이때는 지우고 난 다음 tail은 원좀으로 돌아가도록 만들어줘야 한다.
		if(tail == pre) {
			tail = head;
		}
		
		return pre.name;
	}
}

public class Test082 {
	public static void main(String[] args) {
		XList l = new XList();
		l.add(10);
		l.add(20);
		
		//l.printAll();
		//l.deleteAll();
		
		int n = l.removeLikeQueue();
		System.out.println("큐"+n);
		
		n = l.removeLikeQueue();
		System.out.println("큐"+n);
		
		n = l.removeLikeQueue();
		System.out.println("큐"+n);
		
	}
}