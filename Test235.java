import java.io.*;

public class Test235 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader
		(new InputStreamReader(new FileInputStream("C:\\JavaWork\\2001.smi"), "utf-8"));
		
		PrintWriter out = new PrintWriter
		(new OutputStreamWriter(new FileOutputStream("C:\\JavaWork\\2001c.smi"), "utf-8"));
		
		
		String l = null;
		while ((l=in.readLine())!=null) {
			System.out.println(l);
		} 
		in.close();
	}
}


/*
	�ڹٴ� �����ڵ带 ���⶧���� utf-8�� ���ڵ��� ������ �׳� ������ ������.
	
	InputStreamReader�� �ѱ۹��� ������ �츮���� �����ڵ��� �� ������ �� ���� ��ƴ�.
*/