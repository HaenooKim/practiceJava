
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
	������ �����ϴ� ���α׷��� �� - �ѹ���Ʈ �а� ���� �ƴϸ� ����!
	C����� FILE pointer ������ ���������� �о �аų� ���� ���� �ٷ� �� �������� ��� �а� ����.
*/