import java.io.*;

public class Test234 {
	public static void main(String[] args) throws Exception {
		Writer out = new OutputStreamWriter(new FileOutputStream("C:\\JavaWork\\c.txt"));
		out.write('��'); //1 char�� ��������. Writer�� write�̱� ����
		out.close();
		
		/*
			����Ʈ ������ �д� Streamdp ����͸� ������ �����ϱ� ���бⰡ �����ؼ� char������ �д´�.
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
	Writer�� �ڼ��ε� �����ڿ� OutputStream ??
	
	����� new FileOutputStream("C:\\JavaWork\\c.txt")�ε� 1char�� ���ٴ�?
	
	OutputStreamWriter : char ������� byte ��������� �ٲٴ� ������ adapter����
	InputStreamReader : byte���� �Է��� char���� �Է����� �ٲٴ� �����
*/