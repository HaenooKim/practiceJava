class Util {
	public static boolean endsWith(char[] src, char[] ptn) {
		boolean b= true;
		int start = src.length - ptn.length;
		
		for (int i=0; i<ptn.length; i++) {
			if(src[i+start] == ptn[i]) {
				continue;
			} else {
				b = false;
				break;
			}
		}
		
		return b;
	}
}

public class Test161 {
	public static void main(String[] ags) {
		boolean b = Util.endsWith("Apple".toCharArray(), "ple".toCharArray());
		System.out.println(b);
	
	}
}