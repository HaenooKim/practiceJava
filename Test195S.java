import java.net.ServerSocket;
import java.net.Socket;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.FileInputStream;

public class Test195S { //서버는 기다리는 쪽
	public static void main(String[] args) {
		try {
			ServerSocket svr = new ServerSocket(7890); //전달인자는 포트번호임 (네트워크 통로의 고유번호)
			
			System.out.println("before accept"); //클라이언트를 기다림
			
			Socket skt = svr.accept();
			
			OutputStream out = skt.getOutputStream();
			InputStream in = new FileInputStream("C:\\JavaWork\\01.mp3");
			
			int len = 0;
			byte[] buf = new byte[1024*128];
			while((len=in.read(buf)) != -1) {
				out.write(buf, 0, len);
				out.flush();
			}
			
			in.close();
			out.close();
			
			skt.close();
			svr.close();
			
		
		}
		catch(Throwable e) {
			
		}
	}
}

//svr.accept()여기서 멈추어 대기하고 있는 상황이다.