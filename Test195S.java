import java.net.ServerSocket;
import java.net.Socket;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.FileInputStream;

public class Test195S { //������ ��ٸ��� ��
	public static void main(String[] args) {
		try {
			ServerSocket svr = new ServerSocket(7890); //�������ڴ� ��Ʈ��ȣ�� (��Ʈ��ũ ����� ������ȣ)
			
			System.out.println("before accept"); //Ŭ���̾�Ʈ�� ��ٸ�
			
			Socket skt = svr.accept();
			
			OutputStream out = skt.getOutputStream();
			InputStream in = new FileInputStream("C:\\JavaWork\\01.mp3");
			
			int len = 0;
			byte[] buf = new byte[1024*128];
			while((len=in.read(buf)) != -1) {
				out.write(buf, 0, len);
				out.flush();
			}
			
			in.close();
			out.close();
			
			skt.close();
			svr.close();
			
		
		}
		catch(Throwable e) {
			
		}
	}
}

//svr.accept()���⼭ ���߾� ����ϰ� �ִ� ��Ȳ�̴�.