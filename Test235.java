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
	자바는 유니코드를 쓰기때문에 utf-8로 인코딩된 파일을 그냥 읽음녀 깨진다.
	
	InputStreamReader는 한글문제 때문에 우리나라 개발자들이 안 쓸래야 안 쓰기 어렵다.
*/