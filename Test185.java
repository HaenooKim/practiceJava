import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Test185 {
	public static void main(String[] args) {
		try {
			OutputStream out = new FileOutputStream("C:\\JavaWork\\a.dat");
			
			out.close();
		}
		catch(FileNotFoundException e) {
			
		}
		
		
		catch( IOException e) {
			
		}
		
	}
}

/*
	flush() close() write()
*/
