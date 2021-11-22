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

/* "Hello World" - 이건 char가 아니라 string이다. 
	1. char는 자료형이다. string은 자료형이 아니다.
	2. char는 1개의 문자에 해당하는 코드값을 저장할 수 있는 변수선언이다.	
		String은 "" 로 감싼 문자열(0개 이상 문자의 나열)을 대입할 수 있는 변수선언이 가능하다.
		(t는 실은 포인터이다.)
		
	
	String t = "Hello World";
		System.out.println(t);
		
		//char i = "한";
		
		// 안에 있는 문자 하나하나를 요소로 갖는 배열을 생성하는 것.
		char[] j = "HelloWorld".toCharArray();
		
		for (int i=0; i<j.length; i++) {
			System.out.println(j[i]);
		}
		
*/