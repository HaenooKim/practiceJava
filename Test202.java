

public class Test202 {
	public static void main( String[] args ) {
		XList2 l = new XList2();
		l.add( 10101, 70 );
		l.add( 10102, 85 );
		l.add( 10103, 95 );
		l.add( 10104, 80 );
		l.printAll();		//	�й� , ���� ��µȴ�.
		
		boolean b = l.save("score.dat");
		System.out.println( b );
		
		l.deleteAll();		//	�� ����� �ʱ�� ���ư���.
		
		l.open("score.dat");
		l.printAll();		//	���Ͽ� ����� ������ �ҷ����� ��µȴ�.
	}
}