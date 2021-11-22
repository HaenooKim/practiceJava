class Node {
	int name = 0;
	Node next = null; //참조형변수 -> 인스턴스를 가리킬 수 있음
	
}


public class Test074 {
	public static void main(String[] args) {
		Node head = new Node(); //c언어의 malloc과 똑같음.
		Node tail = head;//참조형 변수의 대입? : 오른쪽이 가리키는 대상을 가리킨다. 
		
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
	참조형 변수 : 인스턴스를 가리킬 수 있는 변수
	멤버변수는 언제 메모리를 할당? -> 인스턴스가 생성될 때 할당함
	
	
*/