import java.io.*;

public class Test199 {
	public static void main(String[] args) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("e.dat"));
			out.writeInt(233232);
			out.writeDouble(3.141692);
			out.writeUTF("����ѹ��� �ź���");
			out.close();
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("e.dat"));
			int r = in.readInt();
			double d = in.readDouble();
			String t = in.readUTF();
			
			/*
				�� �̻� ���� ���� ���� �� in.read()�� ������ �߻����� �ʰ� -1�� �����Ѵ�.
				������ in.readInt()�� �ϰ� �ɰ�� EOFException �̶�� ������ �߻���Ų��.
			*/
			int j = in.readInt();
			System.out.println(j);
			
			in.close();
			
			System.out.println(r);
			System.out.println(d);
			System.out.println(t);
			//������� �ְ�ޱ� ������ ������ ������ ���Ѽ� ������!
		}
		
		catch(IOException e) {
			e.printStackTrace(); //�߻��� ������ ���������� ����
		}
	}
}

/*
 public ObjectOutputStream(OutputStream out) throws IOException
 
 --�Ű����� out�� FileOutputStream�� �ν��Ͻ��� ����ų �� �ֱ⿡ ���� �ڵ尡 �����ϴ�.
 
 writeInt / readInt - int�� �����ʰ� �ְ���� �� �ִ� ����Լ�
 ObjectInputStream / ObjectOutputStream �� �پ��� �ڷ����� ���ڿ����� �ְ���� �� �ִ� �Լ��� ����

java���� ��� ������ ����� ����� �Ǵ� Ŭ������ ObjectInputStream / ObjectOutputStream�̵ȴ�.
�̰� ���Ͽ����� �� �� �ֳ���? �½��ϴ�. �̰��� Decorator Pattern�̶�� ������������ ����Ǿ ó������
�װ� ���ο� �ΰ� �������
*/

