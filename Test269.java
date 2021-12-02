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
			�� �˰����� �� �� �ִ� �� �� ���� ����ġ�� ���� ������ �湮�ϰ� �Ǿ��ִ�.
			
			������ �� �˰����� �������ִ�. ���̻� �����湮�� �Ұ����ϰ� �Ǹ� ���󰡼� �湮�ϴ� ������ ����.
			
			���δ� ��� ������ �湮�ϴ� �ִܰŸ��� ���� ���� ������ �׷��� ���� ���� ���� �ִ�.
			(�׷��ٰ� �� �˰����� �ǹ̰� ���°��� �ƴϴ�.) �׷��� �ִܰŸ� �˰����� ������ �����Ѵ�.
			
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
			visit(minIdx, visited, map); //��� ��带 �湮���� ����. �ֳ�? ���� �ڵ�� �޸� �ݺ����� ��� �ǵ��ư��� �ٽ� �湮���� �ʱ⶧��!
		}
		
		//System.out.println(min+" "+minIdx);
		
	
			/*
			{0, 3, 2, 0, 5},
			0�� �ƴ� �� �� �ּҰ��� ã�� �� ��ġ�� �ִ� ������ �湮�ϰ� �Ϸ���?
			
			ó������ ���� ª�� �����θ� ���� �� �� �˾����� �غ��ϱ� �ƴ�.
			->���ͽ�Ʈ�� �˰����� �ʿ���!
			*/
			
			
			
			
			
			
		
	}
}