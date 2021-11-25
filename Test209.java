import java.net.*;

public class Test209 {
	public static void main(String[] args) throws Exception{
		ServerSocket svr = new ServerSocket(7890);
		
		boolean alive = true;
		while (alive) {
			Socket skt = svr.accept();
			String l = skt.getInetAddress().toString();
			System.out.println(l);
			
			if (l.indexOf("127.0.0.1")!=-1) { //127.0.0.1로 접속하면 서버를 꺼지게 한다.
				alive = false;
			}
			
			skt.close();
		}
		
		svr.close();
	}
}


/*
	통신을 마무리하고 서버는 다시 대기상태로 돌아가야 한다.
	
	skt.getInetAddress() : 접속한 클라이언트의 IP를 추출한다.
	
	127.0.0.1 - 공유기를 거치지 않고 내 컴퓨터에 접속할 때 쓰는 IP
	192.168.0.11 - 공유기를 거쳐서 내 컴퓨터에 접속할 때 쓰는 IP
*/