import java.net.*;
import java.io.*;

public class Test211C {
	public static void main( String[] args ) throws Exception {
		Socket skt = new Socket("192.168.0.11",7890);
		ObjectInputStream in = new ObjectInputStream(skt.getInputStream());
		ObjectOutputStream out = new ObjectOutputStream(skt.getOutputStream());
		
		
		out.writeUTF("01.MP3");
		out.flush();
		int r = in.readInt();
		int len = 0;
		
		byte[] buf = new byte[1024*128];
		
		if (r == 200) {
			//System.out.println("200¹ÞÀ½");
			InputStream in2 = skt.getInputStream();
			OutputStream out2 = new FileOutputStream("C:\\MP3\\download.mp3");
			
			
			while ((len = in2.read(buf))!=-1) {
				out2.write(buf, 0, len);
			}
			
			//out2.close();
			//in2.close();
			
		}
		else if (r==404) {
			
		}
		
		in.close();
		out.close();
		skt.close();
	}
}

//	ipconfig
//	