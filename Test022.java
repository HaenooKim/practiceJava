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
Q. �迭 �ȿ� 8�̶�� ���� �����ϸ� true �ƴϸ� false�� ���
*/