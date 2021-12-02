/*
	Graph : 지점과 지점이 얽혀 있는 문제를 풀어내는 자료구조로
	배열을 이용하여 구현하는 방법과
	List를 이용하여 구현하는 방법 두가지가 있다.
	
	spot : 지점
	4개의 spot의 관계를 표현하기 위해서는 4*4크기의 배열을 필요로 한다.
	int 4개를 요소ㅗㄹ 가진 배열을 가지고 있는 배열
*/


public class Test263 {
	public static void main(String[] args) {
		
		int[][] map = {
			{0, 1, 0, 1},
			{1, 0, 0, 0},
			{0, 0 ,0 ,1},
			{1, 0, 1, 0}
		};
		
		/*
			0-1
			0-3
			2-3
		*/
		
		
		//int[][] map = new int[4][4]; //배열을 선언하면 그 내부는 0으로 초기화. (쓰레기값 들어가는 거 아님)
		int[][] map2 = new int[4][4];
		map2[0][1] = map2[1][0] = 1;
		map2[0][3] = map2[3][0] = 1;
		map2[2][3] = map2[3][2] = 1;
		
		/*
		for (int i=0; i<map2.length; i++) {
			StringBuffer sb = new StringBuffer();
			sb.append(map2[i][0]).append(' ');
			sb.append(map2[i][1]).append(' ');
			sb.append(map2[i][2]).append(' ');
			sb.append(map2[i][3]).append(' ');
			System.out.println(sb.toString());
		}
		*/
		
		/*
			a=b ? c:d
			b가 참이면 a=c, b가 거짓이면 a=d로 대입된다.
		*/
		
		for (int i=0; i<map2.length; i++) {
			StringBuffer sb = null;
			for (int j=0; j<map2[i].length; j++) {
				sb =(sb ==null ? new StringBuffer() : sb.append(' '));
				sb.append(map2[i][j]);
			}
			System.out.println(sb.toString());
		}
		
	}
}