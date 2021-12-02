package banana;

import static banana.Logic.*;

public class Test267 {
	public static void main( String[] args ) {
		int[][] map = {
			{ 0, 1, 1, 0, 1 },	//	0
			{ 1, 0, 1, 0, 0 },
			{ 1, 1, 0, 1, 1 },
			{ 0, 0, 1, 0, 1 },
			{ 1, 0, 1, 1, 0 }
		};
		
		map[0][1] = map[1][0] = 1;
		map[0][2] = map[2][0] = 1;
		map[0][4] = map[4][0] = 1;
		
		map[1][2] = map[2][1] = 1;
		
		map[2][3] = map[3][2] = 1;
		map[2][4] = map[4][2] = 1;
		
		map[3][4] = map[4][3] = 1;
		
		boolean[] visited = new boolean[5];

		visit( 2, visited, map );
	}
}

/*
	[X X X X X]
		visit (2) print 2 
		visited[2] [X X O X X]
			visit(0) print 0
			visited[0] [O X O X X]
				visit(1) print 1
				visited[1] [O O O X X]
				재귀호출 x --0으로 올라간다.
			visit(4) print 4
			visited[4] [O O O X O]
				visit(3) print 3
				visited[3] [O O O O O]
				
		2 0 1 4 3
*/

class Logic {
	public static void visit( int spot, boolean[] visited, int[][] map ) {
		visited[spot] = true;
		System.out.println( "visit : " + spot );
		/*
			{ 0, 1, 1, 0, 1 },	//	0
			{ 1, 0, 1, 0, 0 },	//	1
			{ 1, 1, 0, 1, 1 },	//	2
			{ 0, 0, 1, 0, 1 },	//	3
			{ 1, 0, 1, 1, 0 }	//	4
		*/
		for( int i = 0 ; i < map[spot].length ; i++ ) {
			if( map[spot][i] != 0 && visited[i] == false ) {
				visit( i, visited, map );
			}
		}
	}
}