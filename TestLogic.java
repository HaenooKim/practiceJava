/*
1. 주어진 파일로 부터 데이터를 읽어들였다 ? 5점 / 0점
2. 평균 160.6 을 구했다 ? 5점 / 0점
3. 표준편차 5.521674464226308 을 구했다? 5점 / 0점
4. 생성자 함수에서 멤버변수를 초기화 했다? 5점 / 0점 

0점 맞은 사람들을 대상으로 하는 부분점수 

public void load( String l ) throws IOException : +1
BufferedReader ? +1
finally ? +1 
catch 에서 throw ? +1
while( ( t = in.readLine() ) != null ) ? + 1
*/


import java.util.*;
import java.io.*;

class Logic {
	private List<Integer> data = null;

	public Logic () {
		data = new LinkedList<Integer>();

		/*
			 파일로 부터 읽는거 몰라서 이런 코드를 짜서 풀었다? 만점
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
		System.out.println( avg );	//	평균

		double dev = l.stdev();
		System.out.println( dev );	//	표준편차
	}
}