public class Test147 {
	public static void main( String[] args ) {
		int money = 100;
		double rate = 0.066;
		double total = 0.0;
		
		double total2 = 0.0;
		for( int j = 100 ; j > 0 ; j-- ) {
			total = money;
			for( int i = 0 ; i < j ; i++ ) {
				total = total + total * rate;
			}
			
			total2 = total2 + total ;
		}
		System.out.println( total2 );
	}
}
/*
	---------------------------------------------------
	
		for( int j = 100 ; j > 0 ; j-- ) {
			total = money;
			for( int i = 0 ; i < j ; i++ ) {
				total = total + total * rate;
			}
			System.out.println( total );
		}

	---------------------------------------------------
	
		total = money;
		for( int i = 0 ; i < 100 ; i++ ) {
			total = total + total * rate;
		}
		System.out.println( total );
		
		total = money;
		for( int i = 0 ; i < 99 ; i++ ) {
			total = total + total * rate;
		}
		System.out.println( total );
		
		total = money;
		for( int i = 0 ; i < 98 ; i++ ) {
			total = total + total * rate;
		}
		System.out.println( total );
		
		for( int i = 100 ; i > 0 ; i-- ) {
			System.out.println( i );
		}

	---------------------------------------------------

	100������ 100�Ⱓ �ų� 6.6% �� �������ڷ� ��Ϸ��� �Ѵ�.
	100�� �Ŀ� �� �󸶸� �ް� �ɱ��??

*/