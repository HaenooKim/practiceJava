import java.net.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class OneClient {
	private Socket socket = null;
	private ObjectOutputStream out= null;
	
	public OneClient(Socket s) {
		this.socket = s;
		try {
			out = new ObjectOutputStream(s.getOutputStream());
		}
		catch (IOException e) {}
		
		clients.add(this);
		
		//����ִ� �� �׳� ���� �ڵ�
		for (OneClient oc : clients) {
			System.out.println(oc.toString());
		}
		
	}
	private static List<OneClient> clients = null;
	static {
		clients = new ArrayList<OneClient>();
	}
}


public class Test213S {
	public static void main( String[] args ) throws Exception {
		ServerSocket svr = new ServerSocket(7890);
		
		new Thread(new Runnable() {
			public void run() {
				Scanner sc = new Scanner(System.in);
				boolean alive = true;
				while(alive) {
					String l = sc.nextLine();
					System.out.println(">" + l);
				}
			}
		}).start();
		
		boolean alive = true;
		while( alive ) {
			Socket skt = svr.accept();
			new OneClient(skt);

		}
			
	
		svr.close();
	}
}
/*

*/