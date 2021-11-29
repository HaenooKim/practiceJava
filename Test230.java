import java.io.*;

public class Test230 {
	public static void main(String[] args) throws IOException{
		/*
			가장 많이 쓰이는 실전 예외처리 전형
			에러가 나면 그에 대한 처치는 반드시 하고 그 사실을 다시 던져서 알린다.
		*/
		
		Writer out = null; //try문 안에서 선언하면 finally에서 쓰지 못하기 때문에 밖에서 선언해줌
		try {
			out = new FileWriter("C:\\JavaWork\\a.txt");
			out.write('한'); 
		}
		catch (IOException e) {
			throw e;//받는놈은 없다. 그냥 던져줌
		}
		finally { //위에서 에러가 나건 말건 무조건 동작함
			if (out!=null) 
				out.close(); //반드시 닫아줘야 하기때문에 finally에 적어줌			
			System.out.println("finally");
		}
		
		
		//반드시 암기
		Reader in = null;
		try {
			in = new FileReader("C:\\JavaWork\\a.txt");
			int r = in.read();
			System.out.println((char)r);
			
		}
		catch(IOException e) {
			throw e;
		}
		finally{
			if (in !=null)
				in.close();
		}
		
		
	}
}

/*
	close()는 반드시 호출되어야 한다!
	write / read할 때 에러가 나도 close()는 반드시 호출되어야 한다.
	
	finally는 에러가 나건 정상작동을 하건 무조건 실행된다.
	
	java.lang.NullPointerException
	-- 가장 많이 내는 에러. null값이 대입된 변수로 멤버함수 멤버변수를 호출할 때 발생.
	
	if, for에서 명령어가 한줄이 따라올때는 {}생략가능.
*/