import java.net.*;
import java.io.*;

public class Test228C {
	public static void main(String[] args) throws Exception{
		long time = System.currentTimeMillis();
		
		Socket skt = new Socket("192.168.0.11", 7890);
		InputStream in = skt.getInputStream();
		OutputStream fout = new FileOutputStream("C:\\movie\\"+args[0] + ".zip");
		
		int len = 0;
		byte[] buf = new byte[1024*64];
		
		while((len = in.read(buf))!=-1) {
			fout.write(buf,0, len);
			//파일에다가 쓸때는 flush를 쓰지 않는다!!
		}
		
		
		System.out.println(System.currentTimeMillis()-time);
		
		
		fout.close();
		in.close();
		skt.close();
	}
}

/*
3개의 클라이언트가 거의 동시에 들어왔다.
a:10초
b : 23초
c : 38초

--기본적으로 스레드를 고려하지 않고 서버를 쓰면 이런일이 벌어진다.
--동영상을 빨리 다운받는 경우와 느리게 받는 경우 시간당 cpu소모량은 같을까 다를까? -> 거의 같다

--네트워크 응용프로그램을 만들 때 성능향상 최고기법은? 가까이에 서버를 둔다.
빨리 다운받고 접속 끊어야 다음 서비스를하는데 누구하나 질질끌면 정말 미친다.

일단은 서버를 사용자들이 많이 있는 곳 근처로 옮기고 그 다음에는 쓰레드를 도입하는 것이 중요하다.
쓰레드를 도입해야 앞에서 다운받는 동안 우회하여 다른 쓰레드에 의해 다운받을 수 있다.
*/