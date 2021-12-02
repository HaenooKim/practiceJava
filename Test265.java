package banana;

import static banana.Logic.*;

public class Test265 {
	public static void main(String[] args) {
		int[][] map = {
			{0, 1, 1, 0, 1},
			{1, 0, 1, 0, 0},
			{1, 1, 0, 1, 1},
			{0, 0, 1, 0, 1},
			{1, 0, 1, 1, 0},
			
		
		};
		map[0][1] = map[1][0] = 1;
		map[0][2] = map[2][0] = 1;
		map[0][4] = map[4][0] = 1;
		map[1][2] = map[2][1] = 1;
		map[2][3] = map[3][2] = 1;
		map[2][4] = map[4][2] = 1;
		map[3][4] = map[4][3] = 1;
		
		/*
			0부터 시작해서 모두 방문하고싶을때 트리처럼 방문하려면?
		*/
		/*
			로컬변수라도 배열로 선언하면 내부는 초기값이 자동으로 들어가는데
			int의 경우 0, boolean은 flase, 포인터는 null이 들어간다.
		*/
		boolean[] visited = new boolean[5];
		//System.out.println(visited[0]);
		
		//0에서 출발
		visit(0, visited, map);
	}
}

class Logic {
	/*
		[X X X X X] --방문기록이 없는 거 부터 시작
		visit(0)
			visited : 0 [O X X X X]
			visit(1)
				visited : 1
				visit(2)
					visited:2
					visit(3)
						visited : 3
						visit(4)
							visited : 4
	
	*/
	
	
	public static void visit(int spot, boolean[] visited, int[][] map ) {
		visited[spot] = true;
		System.out.println("visit : " + spot);
		
		//멀고 가까운 게 없으면 먼저 걸리는 곳에 간다.
		
		
		/*
			{0, 1, 1, 0, 1}, 0입장
			{1, 0, 1, 0, 0}, 1입장
			{1, 1, 0, 1, 1}, 2입장
			{0, 0, 1, 0, 1}, 3입장
			{1, 0, 1, 1, 0}, 4입장
		
		0입장에서 보면 방문가능 && 방문한적없는 곳 재귀호출
		
		*/
		
		for (int i=0; i<map[spot].length; i++) {
			if (map[spot][i] != 0 && visited[i] == false) {
				visit(i, visited, map);
			}
		}
	}
	
}