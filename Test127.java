class Node {
	int name = 0;
	Node next = null;
	
	Node(int i, Node j) {
		name = i;
		next = j;
	}
}

class YList {
	Node head = null;
	
	YList() {
		head = new Node(0, null);
		
	}
	
	//아래 코드에서 post는 tail의 역할을 한다.
	void add(int i) {
		Node post = head;
		Node pre = head.next;
		while(pre!=null && pre.name < i) { //정렬을 위한 조건문
			//System.out.println(pre.name);
			
			post = pre;
			pre= pre.next;
			//System.out.println(post.name);
		}
		post.next = new Node(i, pre);
	}
	
	void printAll() {
		for (Node t= head.next; t != null; t = t.next) {
			System.out.println(t.name);
		}
	}
}


public class Test127 {
	public static void main(String[] args) {
		YList l = new YList();
		l.add(10);
		l.add(30);
		l.add(20);
		l.add(50);
		l.printAll();
	}
}