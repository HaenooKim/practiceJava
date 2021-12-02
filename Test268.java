package banana;

import static banana.Logic.*;

public class Test268 {
	public static void main( String[] args ) {
		int[][] map = {
			{0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 1, 0},
			{0, 0, 1, 0, 0, 1},
			{0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0},
		
		};
		
		map[0][2] = 1;
		map[1][3] = 1;
		map[2][3] = map[3][2] = 1;
		map[2][4] = 1;
		map[3][5] = 1;
	
		
		boolean[] visited = new boolean[6];

		visit( 1, visited, map );
	}
}

/*
	[X X X X X X]
		visit(1) print 1
		visited[1] [X O X X X X]
			visit(3) print 3
			visited[3] [X O X O X X]
				visit(2) print 2
				visited[2] [X O O O X X]
					visit(4) print 4
					visited[4] [X O O O O X]
					���ȣ�� x -break�� ��������
*/

class Logic {
	public static void visit(int spot, boolean[] visited, int[][] map) {
		visited[spot] = true;
		System.out.println("�湮 : " +spot);
		
		/*
			{0, 0, 1, 0, 0, 0}, 0
			{0, 0, 0, 1, 0, 0}, 1
			{0, 0, 0, 1, 1, 0}, 2
			{0, 0, 1, 0, 0, 1}, 3
			{0, 0, 0, 0, 0, 0}, 4
			{0, 0, 0, 0, 0, 0}, 5
		*/
		for (int i=0; i<map[spot].length; i++) {
			if (map[spot][i] != 0) {
				if (visited[i] == false) {
					visit(i, visited, map);
					break; //��ٸ� Ÿ�� �̱⶧���� �׳� ���������� �ɷ� ��
					//break�� ���ȣ���� ������ �ߵ��ǰԵ�.
				}
			}
		}
	}
}