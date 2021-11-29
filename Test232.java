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
	printWriter::println -> 문자열을 통째로 내보내고 줄을 바꾸어 준다.
	BufferedReader::readLine() -> 줄바꿈 표시까지의 한 줄을 읽어서 String으로 리턴
*/
