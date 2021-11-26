import java.net.*;
import java.io.*;

public class Test227S {
	public static void main(String[] args) throws Exception {
		ServerSocket svr = new ServerSocket(7890);
		boolean alive = true;
		 
		while(alive) {
			
			Socket skt = svr.accept();
			
			InputStream fin = new FileInputStream("C:\\movie\\movie.zip");
			OutputStream out = skt.getOutputStream();
			
			
			byte[] buf = new byte[1024*64];
			int len = 0;
			
			while((len=fin.read(buf))!=-1) {
				out.write(buf, 0, len);
				out.flush();
			}
			
			
			
			
			out.close();
			
			skt.close();
		}
		
		
		svr.close();
	}
}