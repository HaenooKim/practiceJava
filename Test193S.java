import java.net.ServerSocket;
import java.net.Socket;

public class Test193S { //������ ��ٸ��� ��
	public static void main(String[] args) {
		try {
			ServerSocket svr = new ServerSocket(7890); //�������ڴ� ��Ʈ��ȣ�� (��Ʈ��ũ ����� ������ȣ)
			System.out.println("before accept"); //Ŭ���̾�Ʈ�� ��ٸ�
			
			Socket skt = svr.accept();
			
			System.out.println(skt.toString());
			
			svr.close();
		}
		catch(Throwable e) {
			
		}
	}
}

//svr.accept()���⼭ ���߾� ����ϰ� �ִ� ��Ȳ�̴�.