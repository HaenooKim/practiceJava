import java.net.*;
import java.io.*;


public class Test211S {
	public static void main( String[] args ) throws Exception {
		ServerSocket svr = new ServerSocket(7890);
		
		boolean alive = true;
		while( alive ) {
			Socket skt = svr.accept();
			
			String l = skt.getInetAddress().toString();
			if( l.indexOf("127.0.0.1") != -1 ) {
				alive = false;
			}
			else {
				ObjectOutputStream out = new ObjectOutputStream(skt.getOutputStream());
				ObjectInputStream in = new ObjectInputStream(skt.getInputStream());
				
				String t = in.readUTF();
				File f = new File("C:\\MP3\\"+t);
				int len = 0;
				
				if (f.exists()) {
					out.writeInt(200);
					InputStream in2 = new FileInputStream("C:\\MP3\\"+t);
					OutputStream out2 = skt.getOutputStream();
					
				
					byte[] buf = new byte[1024*128];
					
				
					
					while((len = in2.read(buf))!=-1 ) {
						out2.write(buf, 0, len);
						out2.flush();
					}
					in2.close();
					out2.close();
					
					
					
				}
				else {
					out.writeInt(404);
					alive = false;
				}
				
				

				out.flush();
				
				
				in.close();
				out.close();
			}
			skt.close();
		}
		svr.close();
	}
}
/*

*/