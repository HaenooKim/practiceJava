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
			System.out.println(c); // 256�� �Ѵ� ���� �����ϸ鼭 ©����.
			System.out.println(d); //-1 �� ��µ� ���� �� ���� ��� -1�� ����
		}
		catch (IOException e) {
			
		}
	}
}


/*
	OutputStream�� void write�� ������
	InputStream���� int read()�� �ִ�.
	
	������� write�� ������ ������� read�Ѵ�.
*/