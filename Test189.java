import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test189 {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("C:\\JavaWork\\a.dat");
			int r = 0;
			
			while((r=in.read())!= -1) {
				System.out.println(r);
			} //아래 주석된 코드보다 이 코드가 훨씬 많이씀. 반드시 암기할 것!!
			
			/*
			boolean alive = true;
			while(alive) {
				int r = in.read();
				if (r==-1) { //다읽었으면 빠져나가도록 한다.
					alive = false;
				} else {
					System.out.println(r);
				}
			}
			*/
			
			in.close();
		}
		catch (IOException e) {
			
		}
	}
}
