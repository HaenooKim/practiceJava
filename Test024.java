public class Test024 {
	public static void main(String[] args) {
		
		char[] a = "apple".toCharArray();
		char[] b = "apple".toCharArray();
		boolean same= true;
		
		if (a.length != b.length) {
			same = false;
		} else {
			for (int i=0; i<a.length; i++) {
				if (a[i] != b[i]) {
					same = false;
					break;
				}
			}
		}
		
		System.out.println(same);
		
	}
}

/* "Hello World" - �̰� char�� �ƴ϶� string�̴�. 
	1. char�� �ڷ����̴�. string�� �ڷ����� �ƴϴ�.
	2. char�� 1���� ���ڿ� �ش��ϴ� �ڵ尪�� ������ �� �ִ� ���������̴�.	
		String�� "" �� ���� ���ڿ�(0�� �̻� ������ ����)�� ������ �� �ִ� ���������� �����ϴ�.
		(t�� ���� �������̴�.)
		
	
	String t = "Hello World";
		System.out.println(t);
		
		//char i = "��";
		
		// �ȿ� �ִ� ���� �ϳ��ϳ��� ��ҷ� ���� �迭�� �����ϴ� ��.
		char[] j = "HelloWorld".toCharArray();
		
		for (int i=0; i<j.length; i++) {
			System.out.println(j[i]);
		}
		
*/