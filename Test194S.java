import java.net.ServerSocket;
import java.net.Socket;
import java.io.OutputStream;

public class Test194S { //서버는 기다리는 쪽
	public static void main(String[] args) {
		try {
			ServerSocket svr = new ServerSocket(7890); //전달인자는 포트번호임 (네트워크 통로의 고유번호)
			System.out.println("before accept"); //클라이언트를 기다림
			
			byte[] buf = new byte[]{100, 101, 102, 103};
			
			Socket skt = svr.accept();
			
			OutputStream out = skt.getOutputStream();
			
			//out.write(100); //한 바이트를 보냄
			out.write(buf, 0, buf.length);
			
			out.flush();//네트워크 상의 전송은 보낸다음 반드시 flush()를 호출할 것.
			
			svr.close();
		}
		catch(Throwable e) {
			
		}
	}
}

//svr.accept()여기서 멈추어 대기하고 있는 상황이다.