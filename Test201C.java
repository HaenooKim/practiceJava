import java.io.*;
import java.net.*;

public class Test201C {
	public static void main( String[] args ) {
		try {
			Socket skt = new Socket("192.168.31.100",7890);
			
			//	Test201S.java �� �����ǵ��� ������ �ڵ带 ¥ ��������.
			InputStream in = skt.getInputStream();
			System.out.println( in.getClass().getName() );	// ���� �������. InputStream ��ӹ��� ��.
			
			ObjectInputStream in2 = new ObjectInputStream( in );
			int r = in2.readInt();
			double d = in2.readDouble();
			
			in2.close();
			
			System.out.println( r );
			System.out.println( d );
			
			skt.close();
		}
		catch( Throwable e ) { e.printStackTrace(); }
	}
}