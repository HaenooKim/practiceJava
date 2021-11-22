public class Test017 {
	public static void main(String[] args) {
		
		//int[] l = new int[]{3, 7, 9, 10};
		
		//아래의 코드는 위와 동일한 구조의 배열을 만든다.
		int[] l = new int[4];
		l[0] = 3;
		l[1] = 7;
		l[2] = 9;
		l[3] = 10;
		
		System.out.println(l[0]);
		System.out.println(l[1]);
		System.out.println(l[2]);
		System.out.println(l[3]);
	}
}


/* 배열
	
	- 동일한 자료형의 변수가 연속으로 확보된 기억공간을 배열이라고 한다.
	(int double 섞어서 배열 못 만든다.)
	
	- 위의 경우에는 l이라는 변수명으로 4개의 기억공간이 확보되어 있다.
	각각은 l[0] ~ l[3] 으로 그분되고 각각 값을 대입할 수 있고, 이용할 수 있다.

	- java에서 변수에 초기값을 주지 않으면 에러가 나지만 배열의 경우 자동으로 초기값을 부여한다.( 0 또는 0.0, false)
*/