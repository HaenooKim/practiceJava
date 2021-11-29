import java.io.*;

public class Test229 {
	public static void main(String[] args) throws IOException{
		
		Writer out = new FileWriter("C:\\JavaWork\\a.txt");
		out.write('한'); // 1 char 전송 -> 안 깨진다.
		out.close();
		
		
		Reader in = new FileReader("C:\\JavaWork\\a.txt");
		int r = in.read();
		
		
		in.close();
		
		System.out.println((char)r);
	}
}

/*
	try catch안 쓰고 throws .. 에 명시해주는 것으로만으로도 문법에러는 아니다.

	InputStream / OunputStream 은 byte단위로 전송한다.
	헌데 문자는 char(2byte)를 쓴다. 그래서 초기 java 에서 특히 문자를 전송하면 죄다 깨졌음.
	
	이를 해결하고자 문자 데이터 전송에 특화되어 char단위의 전송을 지원하는 Writer/ Reader 가 생김
	- 데코레이터 패턴으로 만들어진 것은 똑같다. 이름도 거의 비슷함.
*/