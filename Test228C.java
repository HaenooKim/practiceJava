import java.net.*;
import java.io.*;

public class Test228C {
	public static void main(String[] args) throws Exception{
		long time = System.currentTimeMillis();
		
		Socket skt = new Socket("192.168.0.11", 7890);
		InputStream in = skt.getInputStream();
		OutputStream fout = new FileOutputStream("C:\\movie\\"+args[0] + ".zip");
		
		int len = 0;
		byte[] buf = new byte[1024*64];
		
		while((len = in.read(buf))!=-1) {
			fout.write(buf,0, len);
			//���Ͽ��ٰ� ������ flush�� ���� �ʴ´�!!
		}
		
		
		System.out.println(System.currentTimeMillis()-time);
		
		
		fout.close();
		in.close();
		skt.close();
	}
}

/*
3���� Ŭ���̾�Ʈ�� ���� ���ÿ� ���Դ�.
a:10��
b : 23��
c : 38��

--�⺻������ �����带 ������� �ʰ� ������ ���� �̷����� ��������.
--�������� ���� �ٿ�޴� ���� ������ �޴� ��� �ð��� cpu�Ҹ��� ������ �ٸ���? -> ���� ����

--��Ʈ��ũ �������α׷��� ���� �� ������� �ְ�����? �����̿� ������ �д�.
���� �ٿ�ް� ���� ����� ���� ���񽺸��ϴµ� �����ϳ� �������� ���� ��ģ��.

�ϴ��� ������ ����ڵ��� ���� �ִ� �� ��ó�� �ű�� �� �������� �����带 �����ϴ� ���� �߿��ϴ�.
�����带 �����ؾ� �տ��� �ٿ�޴� ���� ��ȸ�Ͽ� �ٸ� �����忡 ���� �ٿ���� �� �ִ�.
*/