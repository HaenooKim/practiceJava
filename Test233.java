import java.io.*;

public class Test233{
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("C:\\JavaWork\\2001.smi"));
		PrintWriter out = new PrintWriter(new FileWriter("C:\\JavaWork\\2001b.smi"));
		
		String l = null;
		while((l = in.readLine())!=null) {
			
			System.out.println(l);
			out.println(l);
			
		}
		
		
		out.close();
		in.close();
	}
}

/*
	printWriter::println -> ���ڿ��� ��°�� �������� ���� �ٲپ� �ش�.
	BufferedReader::readLine() -> �ٹٲ� ǥ�ñ����� �� ���� �о String���� ����
	BufferedReader::readLine() api�� Ȯ�̆Y����
	null if the end of the stream has been reached(���̻� ���� ���� ���� �� null�� ��ȯ)
*/
