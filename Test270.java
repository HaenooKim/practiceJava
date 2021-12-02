package banana;

import java.util.*;
import static banana.Logic.*;

public class Test270 {
	public static void main( String[] args ) {
		int[][] map = {
			{ 0, 1, 1, 0, 1 },
			{ 1, 0, 1, 0, 0 },
			{ 1, 1, 0, 1, 1 },
			{ 0, 0, 1, 0, 1 },
			{ 1, 0, 1, 1, 0 }
		};
		
		
		visit(0, map);
		
	}
}

class Logic {
	
	
	public static void visit( int spot, int[][] map ) {
		boolean[] visited = new boolean[5];
		List<Integer> queue = new LinkedList<Integer>();
		
		visited[spot] = true;
		queue.add (spot);
		
		while(queue.size()!=0) {//큐가 빌때까지 돌림
			int v = queue.remove(0); //맨앞에 있는 것을 빼냄(이 때가 방문시점)	
			System.out.println("visited : " + v);
			
			/*	  0  1  2  3  4
				{ 0, 1, 1, 0, 1 },
				{ 1, 0, 1, 0, 0 },
				{ 1, 1, 0, 1, 1 },
				{ 0, 0, 1, 0, 1 },
				{ 1, 0, 1, 1, 0 }
				
				WHILE 1회 : v=0 VISITED : [- - - X -] QUEUE : [1 2 4] 
				          
							--큐에서 1을 끄집어냄
				while 2회 : v=1 VISITED : [- - - X -] QUEUE : [2 4] --신규 유입x
							
							--큐에서 2를 끄집어넴
				while 3회 :  v=2 VISITED : [- - - - -] QUEUE : [ 4 3] --2가 빠져나가고 3이 나옴
							
							
							모두 방문 완료!
							-- 큐에서 4를 끄집어넴
				while 4회 : v=4 VISITED : [- - - - -] QUEUE : [3] --신규유입x
				
							-- 큐에서 3을 끄집어냄
				while 5회 : v=3 VISITED : [- - - - -] QUEUE : [] --신규유입x 큐는 모두 비었다.
						   
			*/
			// VISITED : [- - - X -]
			// QUEUE : [1 2 4] 
			
			for (int i=0; i<map.length; i++) {//세로방향으로 훑는다.
				if(map[i][v] != 0) {
					if (visited[i] == false) {
						visited[i] = true;
						queue.add(i);
					}
				}
				
			}
		} 
		
	}
}

/*
	이전에 재귀호출을 이용한 방문 알고리즘을 "DFS = Depth first Search"알고리즘이라고 한다.
	이동하고 이동된 지점에서 다시 이동하는 형태의 검색이라 경로를 만들어내는 경우에 응용된다.
	
	그것과는 대비되게 '나와 가까운 지점부터 먼저 모두 방문하는 형태의 방문 알고리즘이 있는데
	이를 BFS알고리즘이라고 한다.
	
	방문 알고리즘은 크게 이 둘이 기본이 된다.
	BFS는 이해하기보단 파악하고 외우는게 싸게 먹힌다... 재귀호출을 안 쓰기 때문.
*/