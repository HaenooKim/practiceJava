import java.net.*;
import java.io.*;

public class Test210S {
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
			
			else {
				int[] id = {10101, 10102, 10103, 10104};
				
				//아래 코드와 연동되는 Test210C를 짜보세요.
				ObjectOutputStream out = new ObjectOutputStream(skt.getOutputStream());
				out.writeInt(id.length); //보낼 개수를 지정해준다.
				for (int i=0; i<id.length; i++) {
					out.writeInt(id[i]);
				}
				out.flush();
				out.close();
			}
			
			skt.close();
		}
		
		svr.close();
	}
}


/*
	{10101, 10102, 10103, 10104}; - 이걸명단이라고 가정
	서버가 4번 보내면 클라이언트도 4개의 데이터를 받아야한다.
*/