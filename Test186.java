import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Test186 {
	public static void main(String[] args) {
		try {
			OutputStream out = new FileOutputStream("C:\\JavaWork\\a.dat");
			
			out.close();
		}
		
		catch( IOException e) {
			
		}
		catch(FileNotFoundException e) {
			
		}
	}
}

/*
	어선이 그물을 내릴때 멸치그물 고등어그물
	- 고등어먼저, 나중에 멸치그물을 내려야 바람직함
	멸치그물은 고등어와 멸치를 둘다 잡을 수 잇지만
	고등어그물은 고등어만 잡을 수 있다.(멸치가 작아서 그물을 통해 빠져나가기가 가능함)
	
	비슷한 원리로,
	FileNotFoundException extends IOException임 따라서
	catch(IOException e) 는 FileNotFoundException 까지 다 잡아버리기에
	둘다 배치하려면 고등어(FileNotFoundException)먼저 잠고 멸치(IOException)을 잡아야한다.
	
	둘다 배치하려면
	catch(FileNotFoundException) {}
	catch(IOException e) {} 
	이렇게 반드시 순서를 지켜야 한다.
	
	catcho(IOException e) {} 하나만 배치해도 어차피 다 잡아버리니 문법이상이 없다.
*/
