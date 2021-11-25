import java.io.File;

public class Test212 {
	public static void main(String[] args) {
		File f = new File("C:\\MP3\\01.MP3");
		System.out.println(f.exists());
		
		File d = new File("C:\\MP3\\");
		System.out.println(d.exists());
		
		String[] lst = d.list();
		for (String l : lst) {
			System.out.println(l);
		}
		
		File f2 = new File("C:\\MP3\\17.mp3");
		if (f2.exists()) {
			f2.delete(); //파일 삭제
		}
		
		File f3 = new File("C:\\MP3\\16.mp3");
		if (f3.exists()) {
			f3.renameTo(new File("C:\\MP3\\16x.mp3"));
		}
		
		File f4 = new File("C:\\MP3\\15.mp3");
		long size = f4.length(); //파일의 바이트크기
		System.out.println(size);
		System.out.println(f4.getParent()); //getParent는 상위폴더명을 리턴해줌
	}
}



/*
	java.io.file : 파일/폴더의 정보를 추출하는 용도로 주로 사용된다.
	
	public FileInputStream(File file) throws FileNotFoundException
	: 문자열 뿐만 아니라 생성자가 fIle을 받을 수 있음.
*/
