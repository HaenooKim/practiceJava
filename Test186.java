import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Test186 {
	public static void main(String[] args) {
		try {
			OutputStream out = new FileOutputStream("C:\\JavaWork\\a.dat");
			
			out.close();
		}
		
		catch( IOException e) {
			
		}
		catch(FileNotFoundException e) {
			
		}
	}
}

/*
	��� �׹��� ������ ��ġ�׹� ����׹�
	- �������, ���߿� ��ġ�׹��� ������ �ٶ�����
	��ġ�׹��� ����� ��ġ�� �Ѵ� ���� �� ������
	����׹��� ��� ���� �� �ִ�.(��ġ�� �۾Ƽ� �׹��� ���� ���������Ⱑ ������)
	
	����� ������,
	FileNotFoundException extends IOException�� ����
	catch(IOException e) �� FileNotFoundException ���� �� ��ƹ����⿡
	�Ѵ� ��ġ�Ϸ��� ����(FileNotFoundException)���� ��� ��ġ(IOException)�� ��ƾ��Ѵ�.
	
	�Ѵ� ��ġ�Ϸ���
	catch(FileNotFoundException) {}
	catch(IOException e) {} 
	�̷��� �ݵ�� ������ ���Ѿ� �Ѵ�.
	
	catcho(IOException e) {} �ϳ��� ��ġ�ص� ������ �� ��ƹ����� �����̻��� ����.
*/
