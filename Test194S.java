import java.net.ServerSocket;
import java.net.Socket;
import java.io.OutputStream;

public class Test194S { //������ ��ٸ��� ��
	public static void main(String[] args) {
		try {
			ServerSocket svr = new ServerSocket(7890); //�������ڴ� ��Ʈ��ȣ�� (��Ʈ��ũ ����� ������ȣ)
			System.out.println("before accept"); //Ŭ���̾�Ʈ�� ��ٸ�
			
			byte[] buf = new byte[]{100, 101, 102, 103};
			
			Socket skt = svr.accept();
			
			OutputStream out = skt.getOutputStream();
			
			//out.write(100); //�� ����Ʈ�� ����
			out.write(buf, 0, buf.length);
			
			out.flush();//��Ʈ��ũ ���� ������ �������� �ݵ�� flush()�� ȣ���� ��.
			
			svr.close();
		}
		catch(Throwable e) {
			
		}
	}
}

//svr.accept()���⼭ ���߾� ����ϰ� �ִ� ��Ȳ�̴�.