import java.io.*;

public class Test229 {
	public static void main(String[] args) throws IOException{
		
		Writer out = new FileWriter("C:\\JavaWork\\a.txt");
		out.write('��'); // 1 char ���� -> �� ������.
		out.close();
		
		
		Reader in = new FileReader("C:\\JavaWork\\a.txt");
		int r = in.read();
		
		
		in.close();
		
		System.out.println((char)r);
	}
}

/*
	try catch�� ���� throws .. �� ������ִ� �����θ����ε� ���������� �ƴϴ�.

	InputStream / OunputStream �� byte������ �����Ѵ�.
	�嵥 ���ڴ� char(2byte)�� ����. �׷��� �ʱ� java ���� Ư�� ���ڸ� �����ϸ� �˴� ������.
	
	�̸� �ذ��ϰ��� ���� ������ ���ۿ� Ưȭ�Ǿ� char������ ������ �����ϴ� Writer/ Reader �� ����
	- ���ڷ����� �������� ������� ���� �Ȱ���. �̸��� ���� �����.
*/