import java.io.*;

class Node {
	int id = 0;
	int score = 0;
	Node next = null;
	
	public Node( int i, int j, Node n ) {
		this.id    = i;
		this.score = j;
		this.next  = n;
	}
	
	
}

class XList2 {
	private Node head = null;
	private Node tail = null;
	
	public XList2( ) {
		head = new Node( 0, 0, null );
		tail = head;
	}
	
	public void add( int i, int j  ) {
		tail.next = new Node( i, j, null );
		tail = tail.next;
	}
	
	public void printAll() {
		for( Node t = head.next ; t != null ; t = t.next ) {
			System.out.println( t.id + "\t" + t.score );
		}
	}
	
	public boolean save(String fn) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\JavaWork\\score.dat"));
			
			out.writeInt(4);
			for (Node t = head.next; t!=null; t=t.next) {
				out.writeInt(t.id);
				out.write(t.score);
			}
			
			
			out.close();
			
			
			
			
		}
		catch(IOException e) {}
		
		return true;
	}
	
	public void deleteAll() {
		Node post = head;
		Node pre = head.next;
		while(pre!=null) {
			post.next = null;
			
			post = pre;
			pre = pre.next;
			
			
		}
		tail=head;
	}
	
	/*
		�Լ��� throws IOExecption �̷��� ����Ǿ�������?
	*/
	
	public void open(String fn) {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\JavaWork\\score.dat"));
			int len = in.readInt();
			for (int i=0; i<len; i++) {
				int id = in.readInt();
				int score = in.read();
				
				add(id, score);
			}
			in.close();
		}
		catch(IOException e){}
		
	
	}
	
	
}

//	public class Test202 {
public class Test260 {
	public static void main( String[] args ) {
		XList2 l = new XList2();
		l.add( 10101, 70 );
		l.add( 10102, 85 );
		l.add( 10103, 95 );
		l.add( 10104, 80 );
		l.printAll();		//	�й� , ���� ��µȴ�.


		boolean b = l.save("score.dat");
		System.out.println( b );
		
		l.deleteAll();		//	�� ����� �ʱ�� ���ư���.

		l.open("score.dat");
		l.printAll();		//	���Ͽ� ����� ������ �ҷ����� ��µȴ�.
		
	}
}


/*
	ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\JavaWork\\score.dat"));
			for (int i=0; i<4; i++) {
				int r = in.readInt();
				int r2 = in.read();
				System.out.println(r + " " + r2);
			}
			in.close();
*/

/*---------------���--------------
try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\JavaWork\\score.dat"));
		
		out.writeInt(4);
		for (Node t = head.next; t!=null; t=t.next) {
			out.writeInt(t.id);
			out.write(t.score);
		}
 
			out.close();

		
		}
		catch(IOException e){}
		return true;
	}


*/