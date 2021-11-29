import java.io.*;

public class Test230 {
	public static void main(String[] args) throws IOException{
		/*
			���� ���� ���̴� ���� ����ó�� ����
			������ ���� �׿� ���� óġ�� �ݵ�� �ϰ� �� ����� �ٽ� ������ �˸���.
		*/
		
		Writer out = null; //try�� �ȿ��� �����ϸ� finally���� ���� ���ϱ� ������ �ۿ��� ��������
		try {
			out = new FileWriter("C:\\JavaWork\\a.txt");
			out.write('��'); 
		}
		catch (IOException e) {
			throw e;//�޴³��� ����. �׳� ������
		}
		finally { //������ ������ ���� ���� ������ ������
			if (out!=null) 
				out.close(); //�ݵ�� �ݾ���� �ϱ⶧���� finally�� ������			
			System.out.println("finally");
		}
		
		
		//�ݵ�� �ϱ�
		Reader in = null;
		try {
			in = new FileReader("C:\\JavaWork\\a.txt");
			int r = in.read();
			System.out.println((char)r);
			
		}
		catch(IOException e) {
			throw e;
		}
		finally{
			if (in !=null)
				in.close();
		}
		
		
	}
}

/*
	close()�� �ݵ�� ȣ��Ǿ�� �Ѵ�!
	write / read�� �� ������ ���� close()�� �ݵ�� ȣ��Ǿ�� �Ѵ�.
	
	finally�� ������ ���� �����۵��� �ϰ� ������ ����ȴ�.
	
	java.lang.NullPointerException
	-- ���� ���� ���� ����. null���� ���Ե� ������ ����Լ� ��������� ȣ���� �� �߻�.
	
	if, for���� ��ɾ ������ ����ö��� {}��������.
*/