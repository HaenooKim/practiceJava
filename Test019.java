public class Test019 {
	public static void main(String[] args) {
		int[] arr = new int[]{3, 7, 9, 10};
		int sum = 0;
		int max=0;
		int min = 99999;
		
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("���� : " + sum);
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("�ִ밪 : " + max);
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("�ּҰ� : " + min);
		
		
		
		
	}


	
}

/*
	Q. 3, 7, 9, 10�� ����ִ� int �迭�� ����� 
	�� ���� ��� ������ ������ ���ϴ� �ڵ带 ¥����.
	
	Q2. ���� �迭�� ����ִ� �ִ밪�� �ּҰ��� ���� ���Ͻÿ�

*/