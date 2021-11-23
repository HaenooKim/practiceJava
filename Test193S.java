import java.net.ServerSocket;
import java.net.Socket;

public class Test193S { //서버는 기다리는 쪽
	public static void main(String[] args) {
		try {
			ServerSocket svr = new ServerSocket(7890); //전달인자는 포트번호임 (네트워크 통로의 고유번호)
			System.out.println("before accept"); //클라이언트를 기다림
			
			Socket skt = svr.accept();
			
			System.out.println(skt.toString());
			
			svr.close();
		}
		catch(Throwable e) {
			
		}
	}
}

//svr.accept()여기서 멈추어 대기하고 있는 상황이다.