import java.io.*;
import java.net.*;

public class Test201C {
	public static void main( String[] args ) {
		try {
			Socket skt = new Socket("192.168.31.100",7890);
			
			//	Test201S.java 와 연동되도록 나머지 코드를 짜 넣으세요.
			InputStream in = skt.getInputStream();
			System.out.println( in.getClass().getName() );	// 몰라도 상관없다. InputStream 상속받음 됨.
			
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