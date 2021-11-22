public class Test018 {
	public static void main(String[] args) {
		int[] l = new int[]{3, 7, 9, 10};
		
		System.out.println(l[2]);
	
		for (int i=0; i<l.length; i++) {
			System.out.println(l[i]);
		}
	
	}
}

/*
	int[] l = {3, 7, 9, 10}; 이렇게도 가능하다.
	
	for 반복문과 연동해서 사용하는 경우는 굉장히 흔하다.
	배열이 가지는 크기는 굳이 숫자를 명시하지 않고 l.length로 사용이 가능하다.
*/