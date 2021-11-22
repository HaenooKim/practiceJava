import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test188 {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("C:\\JavaWork\\a.dat");
			int a = in.read();
			int b = in.read();
			int c = in.read();
			int d = in.read();
			in.close();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c); // 256이 넘는 값은 저장하면서 짤린다.
			System.out.println(d); //-1 이 출력됨 읽을 게 없을 경우 -1이 나옴
		}
		catch (IOException e) {
			
		}
	}
}


/*
	OutputStream에 void write가 있으면
	InputStream에는 int read()가 있다.
	
	순서대로 write된 내용을 순서대로 read한다.
*/