public class Test019 {
	public static void main(String[] args) {
		int[] arr = new int[]{3, 7, 9, 10};
		int sum = 0;
		int max=0;
		int min = 99999;
		
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("총합 : " + sum);
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("최소값 : " + min);
		
		
		
		
	}


	
}

/*
	Q. 3, 7, 9, 10이 들어있는 int 배열을 만들고 
	그 안의 모든 값들의 총합을 구하는 코드를 짜세요.
	
	Q2. 위의 배열에 들어있는 최대값과 최소값을 각각 구하시오

*/