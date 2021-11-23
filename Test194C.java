import java.net.Socket;
import java.io.InputStream;

public class Test194C { //클라이언트는 찾아가는 쪽
	public static void main(String[] args) {
		try {
			Socket skt = new Socket("192.168.0.11", 7890); //찾아가서 접속시도->기다리던 서버와 만나면 소켓을 생성후 리턴
			InputStream in = skt.getInputStream();
			//int r = in.read();
			
			
			byte[] buf = new byte[4];
			int len = in.read(buf);
			
			in.close();
			
			for (int i=0; i<len; i++) {
				System.out.println(buf[i]);
			}
			
			
			//System.out.println(r);
			
			
			skt.close();
		}
		catch(Throwable e) {}
	}
} 

