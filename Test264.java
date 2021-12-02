package banana;

public class Test264 {
	public static void main(String[] args) {
		//4개짜리 배열을 만들었는데 그 요소가 int[]이다.
		
		/*
			java의 배열은 포인터 즉 참조형 변수이다. null값을 대입할 수도 있다.
			배열을 생성할 때 new를 쓴다. -- 배열 만드는 걸 인스턴스 생성하듯 하고있다.
			
			->자바의 배열은 인스턴스이다. (다른 언어와는 많이 다르다.)
		*/
		int[][] map = new int[4][];
		map[0] = new int[]{1, 2};
		map[1] = new int[]{3, 4, 5};
		map[2] = new int[2]; //비어있음
		map[3] = new int[]{6};
		
		for (int i=0; i<map.length; i++) {
			for (int j=0; j<map[i].length; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		
		int[] t = null;
		int[] r = new int[4];
		
	}
}

/*
javac -d c:\classes Test264.java
java -classpath c:\classes banana.Test264
*/