
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class Test191 {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("C:\\JavaWork\\01.mp3");
			OutputStream out = new FileOutputStream("C:\\JavaWork\\01a.mp3");
			
			
			int r = 0;
			
			while((r=in.read()) !=-1) {
				out.write(r);
			}
			
			out.close();
			in.close();
			
		}
		catch (IOException e)  {
			
		}
		
	}
}

/*
	파일을 복사하는 프로그램이 됨 - 한바이트 읽고 끝이 아니면 쓴다!
	C언어의 FILE pointer 개념이 내부적으로 읽어서 읽거나 쓰고 나면 바로 그 다음부터 계속 읽고 쓴다.
*/