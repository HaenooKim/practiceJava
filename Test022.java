public class Test022 {
	public static void main(String[] args) {
		int[] l = {3, 7 ,9, 10};
		int find = 9;
		boolean check = false;
		
		for (int i=0; i<l.length; i++) {
			if(l[i] == find) {
				check = true;
				break;
			}
		}
		
		System.out.println(check);
	}
	
}

/*
Q. 배열 안에 8이라는 값이 존재하면 true 아니면 false를 출력
*/