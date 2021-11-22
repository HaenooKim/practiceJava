public class Test011 {
	public static void main(String[] args) {
		int len = 5;
		for (int i=0; i<len; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int i=len-1; i>0; i--) {
			for (int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
	int len = 3; ÀÌ¸י
*/