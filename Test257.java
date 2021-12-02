package banana;

import static banana.Logic.*;
import java.util.*;

class Node {
	String name = null;
	Node child = null;
	Node sibling = null;
	
	public Node(String n) {
		this.name = n;
	}
	
	public void addChild(Node n) {
		if(child ==null) {
			child = n;
		}
		else {
			Node t = child;
			while(t.sibling != null) {
				t = t.sibling;
			}
			t.sibling = n;
			
		}
	}
}

class Logic{
	public static void travel(Node n, List<Node> lst) {
		if (n!=null) {
			if (n.name.endsWith("*")) {
				System.out.println(n.name);
				lst.add(n);
			}
			
			travel(n.child, lst);
			travel(n.sibling, lst);
		}
	}
	
	
	
	//*�� ���ִ� �͵��� �˻��Ϸ���?
	public static void print(Node n, int depth) {
	if( n != null ) {
			StringBuffer sb = new StringBuffer();
			for( int i = 0 ; i < depth ; i++ ) {
				sb.append("   ");
			}
			sb.append("{").append(n.name).append("}");
			System.out.println( sb.toString() );
			
			print( n.child, depth+1 );
			print( n.sibling, depth );
		}
	}
	//������ �ΰ��� ���ȣ�� �̿��ؼ� �˻��ϴ� �⺻ ������ Ʈ���� ������ ������� ���� ����
	
	public static Node find(Node n, String name) {
		Node found = null;
		if (n != null) {
			if (name.equals(n.name)) {
				found = n;
			}
			if (found == null) {
				found = find(n.child, name);
			}
			if (found ==null) {
				found = find(n.sibling, name);
			}
		}
		return found;
	}
	
	
}

public class Test257 {
	public static void main(String[] args) {
		
		Node root = new Node(null); //��ũ�� ����Ʈ ó�� ���̳�� �ϳ� ���� ����
		Node document = new Node("[document]");
		root.child = document;
		
		//-------- ��������� ��������----------------
		Node a = new Node("��ǰ");
		Node b = new Node("����ǰ");
		
		b.addChild(new Node("IT���"));
		b.addChild(new Node("�ֹ���"));
		b.addChild(new Node("����*"));
		
		a.addChild(b);
		
		
		Node c = new Node("����ǰ");
		c.addChild(new Node("������"));
		c.addChild(new Node("����"));
		c.addChild(new Node("�Ǿ*"));
		a.addChild(c);
		
		Node d = new Node("���ǰ");
		d.addChild(new Node("ä��*"));
		d.addChild(new Node("�"));
		a.addChild(d);
		
		
		
		document.addChild(a);
		

		Node f = find(document, "IT���");
		System.out.println(f.name);
		f.addChild(new Node("����Ʈ��*"));
		f.addChild(new Node("��Ʈ��"));
		print(document, 0);
		
		
		List<Node> list = new ArrayList<Node>();
		travel(document, list);
		for (Node t : list) {
			System.out.println(t.name);
		}
		
		System.out.println("-----------");
		
		//����ǰ ī�װ� �Ʒ��� ��� ���� ī�װ��� ����Ϸ���?
		Node cate = find(document, "����ǰ");
		System.out.println(cate.name);
		print(cate.child, 0);
		System.out.println("-----------");
		print(document, 0);
	}
}