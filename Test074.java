class Node {
	int name = 0;
	Node next = null; //���������� -> �ν��Ͻ��� ����ų �� ����
	
}


public class Test074 {
	public static void main(String[] args) {
		Node head = new Node(); //c����� malloc�� �Ȱ���.
		Node tail = head;//������ ������ ����? : �������� ����Ű�� ����� ����Ų��. 
		
		Node tmp = new Node();
		tmp.name = 10;
		tmp.next = null;
		
		tail.next = tmp;
		tail = tmp;
		
		tmp = new Node();
		tmp.name = 20;
		tmp.next = null;
		
		tail.next = tmp;
		tail = tmp;
		
		for (Node t = head; t!=null; t=t.next) {
			System.out.println(t.name);
		}
		
		Node post = head;
		Node pre = head.next;
		
		while(pre != null) {
			//System.out.println(pre.name);
			post.next = null;
			
			post = pre;
			pre = pre.next;
			//System.out.println(post.name);
		}
		post = null;
		
		
	}
}

/*
	������ ���� : �ν��Ͻ��� ����ų �� �ִ� ����
	��������� ���� �޸𸮸� �Ҵ�? -> �ν��Ͻ��� ������ �� �Ҵ���
	
	
*/