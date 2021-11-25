import java.net.*;

public class Test209 {
	public static void main(String[] args) throws Exception{
		ServerSocket svr = new ServerSocket(7890);
		
		boolean alive = true;
		while (alive) {
			Socket skt = svr.accept();
			String l = skt.getInetAddress().toString();
			System.out.println(l);
			
			if (l.indexOf("127.0.0.1")!=-1) { //127.0.0.1�� �����ϸ� ������ ������ �Ѵ�.
				alive = false;
			}
			
			skt.close();
		}
		
		svr.close();
	}
}


/*
	����� �������ϰ� ������ �ٽ� �����·� ���ư��� �Ѵ�.
	
	skt.getInetAddress() : ������ Ŭ���̾�Ʈ�� IP�� �����Ѵ�.
	
	127.0.0.1 - �����⸦ ��ġ�� �ʰ� �� ��ǻ�Ϳ� ������ �� ���� IP
	192.168.0.11 - �����⸦ ���ļ� �� ��ǻ�Ϳ� ������ �� ���� IP
*/