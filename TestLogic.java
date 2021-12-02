/*
1. �־��� ���Ϸ� ���� �����͸� �о�鿴�� ? 5�� / 0��
2. ��� 160.6 �� ���ߴ� ? 5�� / 0��
3. ǥ������ 5.521674464226308 �� ���ߴ�? 5�� / 0��
4. ������ �Լ����� ��������� �ʱ�ȭ �ߴ�? 5�� / 0�� 

0�� ���� ������� ������� �ϴ� �κ����� 

public void load( String l ) throws IOException : +1
BufferedReader ? +1
finally ? +1 
catch ���� throw ? +1
while( ( t = in.readLine() ) != null ) ? + 1
*/


import java.util.*;
import java.io.*;

class Logic {
	private List<Integer> data = null;

	public Logic () {
		data = new LinkedList<Integer>();

		/*
			 ���Ϸ� ���� �д°� ���� �̷� �ڵ带 ¥�� Ǯ����? ����
		*/
		data.add(157);
		data.add(155);
		data.add(166);
		data.add(166);
		data.add(155);
		data.add(162);
		data.add(170);
		data.add(163);
		data.add(157);
		data.add(155);
	}

	public void load( String l ) throws IOException {
		BufferedReader in = null;
		try {
			in = new BufferedReader( new FileReader(l) );

			String t = null;
			while( ( t = in.readLine() ) != null ) {
				data.add( Integer.parseInt( t ) );
			}
		}
		catch ( IOException e ) {
			throw e;
		} 
		finally {
			if( in != null ) {
				in.close();
			}
		}
	}
	/*
		public double avg() + 1
	*/
	public double avg() {
		double total = 0.0;
		int count = 0;
		for( int i : data ) {
			total = total + i;
			count++;
		}
		return ( total / count );
	}

	/*
		public double stdev() + 1
		avg() + 1
		Math.sqrt( dev2 / ( count - 1 ) ) + 1
	*/
	public double stdev() {
		double dev2 = 0.0;
		double avg = avg();

		int count = 0;
		for( int i : data ) {
			dev2 += (i-avg)*(i-avg);
			count++;
		}
		return Math.sqrt( dev2 / ( count - 1 ) );
	}
}

public class TestLogic {
	public static void main( String[] args ) {
		Logic l = new Logic();

		try{
			l.load("C:\\JavaWork\\tall_data.txt");
		}
		catch( IOException e ){
			e.printStackTrace();
		}

		double avg = l.avg();
		System.out.println( avg );	//	���

		double dev = l.stdev();
		System.out.println( dev );	//	ǥ������
	}
}