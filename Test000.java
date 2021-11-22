public class Test000 {
	public static void main(String[] args) {
		char[] words = "HelloWorld".toCharArray();
		char[] ptn = "ll".toCharArray();
		int idx = -1;
		
		for (int i=0; i<words.length; i++) {
			int k = i;
			
			for (int j = 0; j<ptn.length; j++) {
				if (k < words.length && ptn[j] == words[k]) {
					idx = i;
					k++;
				} else {
					idx = -1;
				}
				
			}
		}
		
		System.out.println(idx);
		
		
		
		
	}
}