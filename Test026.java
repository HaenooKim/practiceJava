public class Test026 {
	public static void main(String[] args) {
		char[] words = "HelloWorld".toCharArray();
		char[] ptn = "".toCharArray();
		int idx = -1;
		int count = 0;
		
		for (int i=0; i<words.length; i++) {
			int k = i;
			for (int j = 0; j<ptn.length; j++) {

				if (k<words.length && words[k] == ptn[j] ) { //k�� �迭�� ������ ���� ���� �ʵ��� �ϱ�����
					count++;
					k++;
					
				}
			}
			if (count == ptn.length && count !=0) {
				idx = i;
				break;
			} else {
				count = 0;
			}
		}
		
		System.out.println(idx);
		
	}

}

/*

ll
llo
lloW

ldx


*/