import java.net.Socket;
import java.io.InputStream;

public class Test194C { //Ŭ���̾�Ʈ�� ã�ư��� ��
	public static void main(String[] args) {
		try {
			Socket skt = new Socket("192.168.0.11", 7890); //ã�ư��� ���ӽõ�->��ٸ��� ������ ������ ������ ������ ����
			InputStream in = skt.getInputStream();
			//int r = in.read();
			
			
			byte[] buf = new byte[4];
			int len = in.read(buf);
			
			in.close();
			
			for (int i=0; i<len; i++) {
				System.out.println(buf[i]);
			}
			
			
			//System.out.println(r);
			
			
			skt.close();
		}
		catch(Throwable e) {}
	}
} 

