import java.io.*;

public class Test198 {
	public static void main(String[] args) {
		int i = 2342694;
		
		try {
			/*
				Ŭ���̾�Ʈ�� c�̰� ������ java�� ��� �̷��� ������ ¥�ִ� ��찡 ������
				C�� �ü���� ���� C�� int�� java int�� ȣȯ�� �� �� ��찡 �ִ�.
				
				Ŭ���̾�Ʈ �� ȯ���� ��Ʋ�ε���̳� ���ε���̳Ŀ� ���� �ٸ�
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
	-- �ش���Ű���� ���� ��� Ŭ������ ����Ʈ, ���������� ���� ����.
	�ֳ��ϸ� �̸��� Ŭ�����̸��� ��ġ�� ��å�� ����.
*/