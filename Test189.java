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
			} //�Ʒ� �ּ��� �ڵ庸�� �� �ڵ尡 �ξ� ���̾�. �ݵ�� �ϱ��� ��!!
			
			/*
			boolean alive = true;
			while(alive) {
				int r = in.read();
				if (r==-1) { //���о����� ������������ �Ѵ�.
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
