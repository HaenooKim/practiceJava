
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class Test192 {
	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		try {
			InputStream in = new FileInputStream("C:\\JavaWork\\01.mp3");
			OutputStream out = new FileOutputStream("C:\\JavaWork\\01a.mp3");
			
			
			int len = 0;
			
			//buf의 크기를 대략적으로 조정하다보면 최적의 속도를 찾을 수 있다. 무조건 크거나 작다고해서 빨라지는 게 아님
			/*
				우물을 팔 때 
				1.숟가락 2.양동이 3.드럼통 중 뭐가 제일 적절할까? -숟가락은 너무작고 드럼통은 들어올리기 어려움.
				한꺼번에 푸는 양동이의 크기는 환경에 따라 다르지만 분명 결과에 영향을 미친다.
				buf의 크기가 양동이의 크기와 동일한 개념이 된다.
				
				파일시스템은 자바에서 제공하는 기능이 아니고 OS의 기능을 빌려서 사용한다.(시스템 콜)
				즉 JAVA는 자신이 설치된 OS에 의뢰해서 파일시스템에 접근가능하다.
			
				buf의 크기가 한꺼번에 읽고 내보내는 크기(바케쓰 크기) - 키톡 사진참조하기
			*/
			byte[] buf = new byte[1024*4];
			
			
			while((len=in.read(buf)) !=-1) {
				out.write(buf, 0, len);
			}
			
			out.close();
			in.close();
			
		}
		catch (IOException e)  {}
		
		System.out.println(System.currentTimeMillis()-time);
		//시간측정
	}
}

/*
	read에는 두가지 오버로딩된 함수가 있다.
	int read() : 한 바이트를 읽어서 그 내용을 리턴한다.
	int read (byte[]) : 읽어서 byte[]에 내용을 복사하고 읽은 바이트수를 리턴한다.
	
	write에도 두가지 방법이 제공됨
	void write(int i) : 하위 8비트를 전송한다.
	void write(byte[] buf, int offset, int len) : buf안의 내용을 offset부터 시작해서 len크기만큼 전송한다. 
*/