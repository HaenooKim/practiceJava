import java.io.*;

public class Test232{
	public static void main(String[] args) throws IOException{
		PrintWriter out = new PrintWriter(new FileWriter("C:\\JavaWork\\b.txt"));
		out.println("apple");
		out.println("banana");
		out.println("oranger");
		out.println("kiwi");
		
		out.close();
		
		BufferedReader in = new BufferedReader(new FileReader("C:\\JavaWork\\b.txt"));
		String l = in.readLine();
		in.close();
		System.out.println(l);
	}
}

/*
	printWriter::println -> ���ڿ��� ��°�� �������� ���� �ٲپ� �ش�.
	BufferedReader::readLine() -> �ٹٲ� ǥ�ñ����� �� ���� �о String���� ����
*/
