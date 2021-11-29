import java.io.*;

public class Test234 {
	public static void main(String[] args) throws Exception {
		Writer out = new OutputStreamWriter(new FileOutputStream("C:\\JavaWork\\c.txt"));
		out.write('한'); //1 char을 내보낸다. Writer의 write이기 때문
		out.close();
		
		/*
			바이트 단위로 읽는 Streamdp 어댑터를 씌워서 읽으니까 변압기가 동작해서 char단위로 읽는다.
		*/
		
		
		Reader in = new InputStreamReader(new FileInputStream("C:\\JavaWork\\c.txt"));
		char r = (char)in.read();
		
		in.close();
		System.out.println(r);
	}
}

/*
	out.write(10000);
	
	OutputStreamWriter(OutputStream out)
	Writer의 자손인데 생성자에 OutputStream ??
	
	대상은 new FileOutputStream("C:\\JavaWork\\c.txt")인데 1char를 보넨다?
	
	OutputStreamWriter : char 입출력을 byte 입출력으로 바꾸는 일종의 adapter역할
	InputStreamReader : byte단위 입력을 char단위 입력으로 바꾸는 어댑터
*/