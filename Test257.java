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
	
	
	
	//*가 들어가있는 것들을 검색하려면?
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
	//포인터 두개로 재귀호출 이용해서 검색하는 기본 개념은 트리의 종류에 상관없이 거의 유사
	
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
		
		Node root = new Node(null); //링크드 리스트 처럼 더미노드 하나 끼고 시작
		Node document = new Node("[document]");
		root.child = document;
		
		//-------- 여기까지가 시작지점----------------
		Node a = new Node("상품");
		Node b = new Node("공산품");
		
		b.addChild(new Node("IT기기"));
		b.addChild(new Node("주방기기"));
		b.addChild(new Node("가전*"));
		
		a.addChild(b);
		
		
		Node c = new Node("수산품");
		c.addChild(new Node("젖갈류"));
		c.addChild(new Node("생물"));
		c.addChild(new Node("건어물*"));
		a.addChild(c);
		
		Node d = new Node("농산품");
		d.addChild(new Node("채소*"));
		d.addChild(new Node("곡물"));
		a.addChild(d);
		
		
		
		document.addChild(a);
		

		Node f = find(document, "IT기기");
		System.out.println(f.name);
		f.addChild(new Node("스마트폰*"));
		f.addChild(new Node("노트북"));
		print(document, 0);
		
		
		List<Node> list = new ArrayList<Node>();
		travel(document, list);
		for (Node t : list) {
			System.out.println(t.name);
		}
		
		System.out.println("-----------");
		
		//공산품 카테고리 아래의 모든 하위 카테고리만 출력하려면?
		Node cate = find(document, "공산품");
		System.out.println(cate.name);
		print(cate.child, 0);
		System.out.println("-----------");
		print(document, 0);
	}
}