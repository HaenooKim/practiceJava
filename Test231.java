import java.io.*;

public class Test229 {
	public static void main(String[] args) throws IOException{
		Writer out = null;
		try {
			out = new FileWriter("C:\\JavaWork\\a.txt");
			out.write('한');
		}
		catch(IOException e) {
			throw e; //받는놈은 없다. 그냥 던져줌
			
		}
		
		finally {
			if (out != null) {
				out.close();
			}
			
		}
	
	
		
		
		
		Reader in = new FileReader("C:\\JavaWork\\a.txt");
		int r = in.read();
		
		
		in.close();
		
		System.out.println((char)r);
	}
}

/*
	
*/