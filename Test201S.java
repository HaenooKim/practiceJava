import java.io.*;
import java.net.*;

public class Test201S {
	public static void main(String[] args) {
		try {
			ServerSocket svr = new ServerSocket(7890);
			Socket skt = svr.accept();
			
			ObjectOutputStream out =  new ObjectOutputStream(skt.getOutputStream());
			out.writeInt(32232);
			out.writeDouble(3.141512);
			out.flush();
			
			out.close();
			
			skt.close();
			svr.close();
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
	}
}

/*
	위의 코드는 Decorator 패턴에 대한 이해를 바탕으로 java.io패키지에서 제공하는
	다양한 Decorator 역할을 클래스 Socket에 응용하는 예시코드입니다.
*/