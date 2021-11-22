public class Test027 {
	public static void main( String[] args ) {
		char[] a = "HelloWorld".toCharArray();
		char[] b = "orl".toCharArray();

		int idx = -1;
		
		int len = a.length - b.length + 1;
		for( int i = 0 ; i < len ; i++ ) 
		{
			boolean match = true;
			
			for( int j = 0 ; j < b.length ; j++ ) {
				if( a[i+j] != b[j] ) {
					match = false;
					break;
				}
			}
			
			if( match == true ) {
				idx = i;
				break;
			}
			
		}
		
		System.out.println( idx );
	}
}
/*
	크게보고 , 한번에 하나씩 
	
	[H][e][l][l][o][W][o][r][l][d]
	                     [l][l][o]



		int len = a.length - b.length + 1;
		for( int i = 0 ; i < len ; i++ ) {
			if( a[i] == b[0] && a[i+1] == b[1] && a[i+2] == b[2] ) {
				idx = i;
				break;
			}			
		}


----------------------------------------------------------------------------------

			boolean match = true;
			if( a[i] != b[0] ) {
				match = false;
			}
			else if( a[i+1] != b[1] ) {
				match = false;
			}			
			else if( a[i+2] != b[2] ) {
				match = false;
			}
			
			if( match == true ) {
				idx = i;
				break;
			}

----------------------------------------------------------------------------------

		이건 셋 다 일치하면 브레이크 , 즉 하나라도 어긋나면 브레이크 안한다. 
		
			if( a[i] == b[0] && a[i+1] == b[1] && a[i+2] == b[2] ) {
				idx = i;
				break;
			}			

--------------------------------------------------------------------------------

		if( a[0] == b[0] && a[1] == b[1] && a[2] == b[2] ) {
			idx = 0;
		}
		else if( a[1] == b[0] && a[2] == b[1] && a[3] == b[2] ) {
			idx = 1;
		}
		else if( a[2] == b[0] && a[3] == b[1] && a[4] == b[2] ) {
			idx = 2;
		}
		else if( a[3] == b[0] && a[4] == b[1] && a[5] == b[2] ) {
			idx = 3;
		}
		else if( a[4] == b[0] && a[5] == b[1] && a[6] == b[2] ) {
			idx = 4;
		}
		else if( a[5] == b[0] && a[6] == b[1] && a[7] == b[2] ) {
			idx = 5;
		}
		else if( a[6] == b[0] && a[7] == b[1] && a[8] == b[2] ) {
			idx = 6;
		}
		else if( a[7] == b[0] && a[8] == b[1] && a[9] == b[2] ) {
			idx = 7;
		}


--------------------------------------------------------------------------

		char[] a = "HelloWorld".toCharArray();
		char[] b = "llo".toCharArray();

		int idx = -1;
		
		if( a[0] == b[0] && a[1] == b[1] && a[2] == b[2] ) {
			idx = 0;
		}
		else if( a[1] == b[0] && a[2] == b[1] && a[3] == b[2] ) {
			idx = 1;
		}
		else if( a[2] == b[0] && a[3] == b[1] && a[4] == b[2] ) {
			idx = 2;
		}
	   
*/
