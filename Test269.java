package banana;

import static banana.Logic.*;

public class Test269 {
	public static void main( String[] args ) {
		int[][] map = {
			{ 0, 3, 2, 0, 5 },
			{ 3, 0, 2, 0, 0 },
			{ 2, 2, 0, 1, 2 },
			{ 0, 0, 1, 0, 1 },
			{ 5, 0, 2, 1, 0 }
		};
		
		map[0][1] = map[1][0] = 3;
		map[0][2] = map[2][0] = 2;
		map[0][4] = map[4][0] = 5;
		
		map[1][2] = map[2][1] = 2;
		
		map[2][3] = map[3][2] = 1;
		map[2][4] = map[4][2] = 1;
		
		map[3][4] = map[4][3] = 1;
		
		boolean[] visited = new boolean[5];

		visit( 0, visited, map );
	}
}

class Logic {
	public static void visit( int spot, boolean[] visited, int[][] map ) {
		visited[spot] = true;
		System.out.println( "visit : " + spot );
		
		/*
		for( int i = 0 ; i < map[spot].length ; i++ ) {
			if( map[spot][i] != 0 && visited[i] == false ) {
				visit( i, visited, map );
			}
		}
		*/
		
		/*
			이 알고리즘은 갈 수 있는 곳 중 가장 가중치가 낮은 순으로 방문하게 되어있다.
			
			하지만 이 알고리즘은 약점이있다. 더이상 직접방문이 불가능하게 되면 도라가서 방문하는 개념이 없다.
			
			때로는 모든 지점을 방문하는 최단거리를 구할 수도 있지만 그렇게 되지 않을 수도 있다.
			(그렇다고 이 알고리즘이 의미가 없는것은 아니다.) 그래서 최단거리 알고리즘은 별도로 존재한다.
			
		*/
		
		int min = 100000;
		int minIdx = -1;
		
		for (int i=0; i<map[spot].length; i++) {
			if (map[spot][i] != 0 && visited[i] == false) {
				if (min> map[spot][i]) {
					min = map[spot][i];
					minIdx = i;
				}
			}
		}
		
		if (minIdx != -1 ) {
			visit(minIdx, visited, map); //모든 노드를 방문하진 않음. 왜냐? 이전 코드와 달리 반복문이 없어서 되돌아가서 다시 방문하지 않기때문!
		}
		
		//System.out.println(min+" "+minIdx);
		
	
			/*
			{0, 3, 2, 0, 5},
			0이 아닌 값 중 최소값을 찾고 그 위치에 있는 지점을 방문하게 하려면?
			
			처음에는 가장 짧은 곳으로만 가면 될 줄 알았지만 해보니깐 아님.
			->다익스트라 알고리즘이 필요함!
			*/
			
			
			
			
			
			
		
	}
}