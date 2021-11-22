import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Test187 {
	public static void main(String[] args) {
		try {
			OutputStream out = new FileOutputStream("C:\\JavaWork\\a.dat");
			out.write(100);
			out.write(101);
			out.write(123456);
			out.close();
		}
		
		catch( IOException e) {
			System.out.println(e);
		}
	}
}

/*
	cmd -> dir a.dat
	
	FileOutputStream : �ش� ���Ͽ� ������ ����ϰ� ���ִ� Ŭ����
	write : �ѹ� ȣ���� �� �ѹ���Ʈ�� ��� (int�� 32��Ʈ�ε�...? - 32��Ʈ �� ���� 8��Ʈ�� ���. �� 256�� �Ѿ�� ©������ ���ٴ� ��)
	close : �ٳ����� ȣ���ؾ���
*/
