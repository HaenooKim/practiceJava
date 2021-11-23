import java.io.*;

public class Test198 {
	public static void main(String[] args) {
		int i = 2342694;
		
		try {
			/*
				클라이언트가 c이거 서버가 java인 경우 이렇게 일일이 짜주는 경우가 많은데
				C의 운영체제에 따라서 C의 int와 java int가 호환이 안 될 경우가 있다.
				
				클라이언트 쪽 환경이 리틀인디언이냐 빅인디언이냐에 따라 다름
			*/
			
			OutputStream out = new FileOutputStream("C:\\JavaWork\\c.dat");
			out.write(i);
			out.write(i>>>8);
			out.write(i>>>16);
			out.write(i>>>24);
			out.close();
			
			InputStream in = new FileInputStream("C:\\JavaWork\\c.dat");
		
			
			int a = in.read(); 
			int b = in.read();
			int c = in.read();
			int d = in.read();
			
			int r = a+(b<<8) + (c<<16) + (d<<24);
			System.out.println(r);
			in.close();
		}
		catch(IOException e){}
	}
}

/*
	import java.io.*;
	-- 해당패키지에 속한 모든 클래스를 임포트, 실전에서는 절대 비추.
	왜냐하면 이름이 클래스이름이 겹치면 대책이 없다.
*/