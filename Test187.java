import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Test187 {
	public static void main(String[] args) {
		try {
			OutputStream out = new FileOutputStream("C:\\JavaWork\\a.dat");
			out.write(100);
			out.write(101);
			out.write(123456);
			out.close();
		}
		
		catch( IOException e) {
			System.out.println(e);
		}
	}
}

/*
	cmd -> dir a.dat
	
	FileOutputStream : 해당 파일에 정보를 기록하게 해주는 클래스
	write : 한번 호출할 때 한바이트씩 기록 (int는 32비트인데...? - 32비트 중 하위 8비트만 기록. 즉 256이 넘어가면 짤려서더 들어간다는 뜻)
	close : 다끝나면 호출해야함
*/
