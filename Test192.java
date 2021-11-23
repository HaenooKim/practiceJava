
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class Test192 {
	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		try {
			InputStream in = new FileInputStream("C:\\JavaWork\\01.mp3");
			OutputStream out = new FileOutputStream("C:\\JavaWork\\01a.mp3");
			
			
			int len = 0;
			
			//buf�� ũ�⸦ �뷫������ �����ϴٺ��� ������ �ӵ��� ã�� �� �ִ�. ������ ũ�ų� �۴ٰ��ؼ� �������� �� �ƴ�
			/*
				�칰�� �� �� 
				1.������ 2.�絿�� 3.�巳�� �� ���� ���� �����ұ�? -�������� �ʹ��۰� �巳���� ���ø��� �����.
				�Ѳ����� Ǫ�� �絿���� ũ��� ȯ�濡 ���� �ٸ����� �и� ����� ������ ��ģ��.
				buf�� ũ�Ⱑ �絿���� ũ��� ������ ������ �ȴ�.
				
				���Ͻý����� �ڹٿ��� �����ϴ� ����� �ƴϰ� OS�� ����� ������ ����Ѵ�.(�ý��� ��)
				�� JAVA�� �ڽ��� ��ġ�� OS�� �Ƿ��ؼ� ���Ͻý��ۿ� ���ٰ����ϴ�.
			
				buf�� ũ�Ⱑ �Ѳ����� �а� �������� ũ��(���ɾ� ũ��) - Ű�� ���������ϱ�
			*/
			byte[] buf = new byte[1024*4];
			
			
			while((len=in.read(buf)) !=-1) {
				out.write(buf, 0, len);
			}
			
			out.close();
			in.close();
			
		}
		catch (IOException e)  {}
		
		System.out.println(System.currentTimeMillis()-time);
		//�ð�����
	}
}

/*
	read���� �ΰ��� �����ε��� �Լ��� �ִ�.
	int read() : �� ����Ʈ�� �о �� ������ �����Ѵ�.
	int read (byte[]) : �о byte[]�� ������ �����ϰ� ���� ����Ʈ���� �����Ѵ�.
	
	write���� �ΰ��� ����� ������
	void write(int i) : ���� 8��Ʈ�� �����Ѵ�.
	void write(byte[] buf, int offset, int len) : buf���� ������ offset���� �����ؼ� lenũ�⸸ŭ �����Ѵ�. 
*/