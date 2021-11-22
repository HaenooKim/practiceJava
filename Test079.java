class Node {
	int name =0;
	Node next = null;

	Node(int i, Node j) {
		this.name = i;
		next = j; //this�� ��������.
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
	������� ����Լ� ������ �Լ� this �ν��Ͻ� ����������
	
	java������ ���ú����� �̸��� ��ġ���� ������ this�� ��������.
	
	��������� �ν��Ͻ� ������ �޸� �Ҵ�. �˾Ƽ� �Ұ�. ���ŵǴ� ������ ���� ������ �� (�����Ͱ� 0�� �Ǵ� ����)
*/