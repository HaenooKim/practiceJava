import java.net.*;
import java.io.*;

public class Test210C {
	public static void main(String[] args) throws Exception{
		Socket skt = new Socket("192.168.0.11", 7890);
		ObjectInputStream in = new ObjectInputStream(skt.getInputStream());
		int r = in.readInt();
		
		
		for (int i=0; i<r; i++) {
			int id = in.readInt();
			System.out.println(id);
		}
		
		in.close();
		skt.close();
		
		System.out.println(r);
		
	}
}