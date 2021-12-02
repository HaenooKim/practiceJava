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
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("C:\\JavaWork\\score.dat"));
			
			out.writeInt(4);
			for (Node t = head.next; t!=null; t=t.next) {
				out.writeInt(t.id);
				out.write(t.score);
			}
			
		}
		catch(IOException e) {}
		finally {
			if (out!=null){ //만약 파일이 없다면 널포인트 익셉션 에러가 나므로 out이 널이 아닐때만 닫아줘야함
				try {
					out.close();
				}
				catch (IOExecption e) {}
			}
		}
		
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
		함수에 throws IOExecption 이렇게 선언되어있으면?
	*/
	
	public void open(String fn) {
		ObjectInputStream in = null; //finally때문에 바깥에 선언
		try {
			in = new ObjectInputStream(new FileInputStream("C:\\JavaWork\\score.dat"));
			int len = in.readInt();
			for (int i=0; i<len; i++) {
				int id = in.readInt();
				int score = in.read();
				
				add(id, score);
			}
		}
		catch(IOException e){}
		finally { //반드시 close가 호출되도록 한다.
			if(n!=null) {
				try { //finally로 왔으니 try catch를 한번 더 써줘야함
					in.close();
				}
				catch(IOException e) {}
			}
		}
	}
}

//	public class Test202 {
public class Test262 {
	public static void main( String[] args ) {
		XList2 l = new XList2();
		l.add( 10101, 70 );
		l.add( 10102, 85 );
		l.add( 10103, 95 );
		l.add( 10104, 80 );
		l.printAll();		//	학번 , 성적 출력된다.

		boolean b = l.save("score.dat");
		System.out.println( b );
		
		l.deleteAll();		//	다 지우고 초기로 돌아간다.

		l.open("score.dat");
		l.printAll();		//	파일에 저장된 내역이 불려져서 출력된다.
	}
}
