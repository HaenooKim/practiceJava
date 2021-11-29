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
	printWriter::println -> 문자열을 통째로 내보내고 줄을 바꾸어 준다.
	BufferedReader::readLine() -> 줄바꿈 표시까지의 한 줄을 읽어서 String으로 리턴
	BufferedReader::readLine() api에 확이냏보면
	null if the end of the stream has been reached(더이상 읽을 것이 없을 때 null을 반환)
*/
