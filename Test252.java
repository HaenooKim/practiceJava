package banana;

import static banana.Logic.*;

class Node {
	int data = 0;
	Node left = null;
	Node right = null;
	
	public Node (int data ) {
		this.data = data;
	}
}

class Logic {
	public static void print(Node n, int depth) {
		if (n!=null) {
			print(n.left, depth+1);
			StringBuffer sb = new StringBuffer(); //문자를 이어붙일 땐 Stinrg대신 StringBuffer가 적합!
			
			for (int i=0; i<depth; i++) {
				sb.append(" ");
			}
			sb.append("{").append(n.data).append("}");
		
			
			if(n.left!=null) 
				sb.append(" L : {").append(n.left.data).append("}");

			if (n.right!=null)
				sb.append(" R : {").append(n.right.data).append("}");
				
			
			System.out.println(sb.toString());
			print(n.right, depth+1);
		}
	}
	
	public static Node add(Node n, int data) {
		if (n==null) {
			n = new Node(data);
		}
		else {
			if (n.data > data) {
				n.left = add(n.left, data);
			}
			else if (n.data<data) {
				n.right = add(n.right, data);
			}
			else { //데이터 중복방지
				throw new RuntimeException("Data Duplication");
			}
			
		}
		
		return n;
	}
	
	public static Node find(Node n, int data) {
		Node found = null;
		
		if (n!=null) {
			if (data == n.data) {
				found = n;
			}
			if(found ==null && n.data > data) {
				found = find(n.left, data);
			}
			if(found == null && n.data < data) {
				found = find(n.right, data);
			}
		}
		
		return found;
	}
	
	public static Node rotationR(Node a) {
		if (a.left != null) { //쿠데타를 일으킬 놈이 있어야 rotation가능
			Node b = a.left;
			a.left = b.right;
			b.right = a;
			return b;
		}
		else {
			return a;
		}
	}
	
	public static Node rotationL(Node a) {
		if (a.right != null) { //rotationL은 오른팔이 Null이면 안된다.
			Node b = a.right;
			a.right = b.left;
			b.left = a;
			
			
			return b;
			
		} else { //null이면 쿠데타 없이 바로 돌려줌
			return a;
		}
		
		
		
	}
}


public class Test252 {
	public static void main(String[] args) {
		Node root = null;
		

		root = add(root, 5);
		root = add(root, 3);
		root = add(root, 8);
		root = add(root, 1);
		root = add(root, 4);
		print(root, 0);
		
		root = rotationR(root);
		
		Node f = find(root, 4);
		if (f!=null) {
			System.out.println(f.data);
		}
		
		root = rotationR(root);
		root = rotationL(root);
		
		//트리의 임의의 위치에서 로테이션이 두번 일어나도 원래 모양으로 돌아온다.
		root.left = rotationR(root.left);
		root.left = rotationL(root.left);
	}
}