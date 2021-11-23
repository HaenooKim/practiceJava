

public class Test202 {
	public static void main( String[] args ) {
		XList2 l = new XList2();
		l.add( 10101, 70 );
		l.add( 10102, 85 );
		l.add( 10103, 95 );
		l.add( 10104, 80 );
		l.printAll();		//	학번 , 성적 출력된다.
		
		boolean b = l.save("score.dat");
		System.out.println( b );
		
		l.deleteAll();		//	다 지우고 초기로 돌아간다.
		
		l.open("score.dat");
		l.printAll();		//	파일에 저장된 내역이 불려져서 출력된다.
	}
}