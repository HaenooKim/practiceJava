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
			f2.delete(); //���� ����
		}
		
		File f3 = new File("C:\\MP3\\16.mp3");
		if (f3.exists()) {
			f3.renameTo(new File("C:\\MP3\\16x.mp3"));
		}
		
		File f4 = new File("C:\\MP3\\15.mp3");
		long size = f4.length(); //������ ����Ʈũ��
		System.out.println(size);
		System.out.println(f4.getParent()); //getParent�� ������������ ��������
	}
}



/*
	java.io.file : ����/������ ������ �����ϴ� �뵵�� �ַ� ���ȴ�.
	
	public FileInputStream(File file) throws FileNotFoundException
	: ���ڿ� �Ӹ� �ƴ϶� �����ڰ� fIle�� ���� �� ����.
*/
