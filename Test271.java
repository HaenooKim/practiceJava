package banana;

import static banana.Logic.*;
import java.util.*;

public class Test271 {
	public static void main( String[] args ) {
		int[][] map = {
			{ 0, 1, 1, 0, 1 },
			{ 1, 0, 1, 0, 0 },
			{ 1, 1, 0, 1, 1 },
			{ 0, 0, 1, 0, 1 },
			{ 1, 0, 1, 1, 0 }
		};
		
		visit( 3, map );
	}
}

class Logic {
	public static void visit( int spot, int[][] map ) 
	{
		boolean[] visited = new boolean[5];
		List<Integer> queue = new LinkedList<Integer>();
		
		visited[spot] = true;
		queue.add( spot );
		
			
		
		while( queue.size() != 0 )	//	queue �� ���� �ʴ� �� �ݺ��Ѵ�.
		{
			int v = queue.remove(0);
			System.out.println( "visited : " + v );
			
			/*
			
				[][X X X - X ] -> [2] [X X - - X] -> [2 4][X X - - - ]
				-> [4 0 1][- - - - -] -> [0 1][- - - - -] -> [1][- - - - - ] -> [][- - - - - ]
			
			
			*/  
			
			/*
				    0  1  2  3  4
				0 { 0, 1, 1, 0, 1 },
				1 { 1, 0, 1, 0, 0 },
				2 { 1, 1, 0, 1, 1 },
				3 { 0, 0, 1, 0, 1 },
				4 { 1, 0, 1, 1, 0 }
			*/
			
			for( int i = 0 ; i < map.length ; i++ ) // ���ι���
			{
				if( map[i][v] != 0 ) {
					if( visited[i] == false ) {
						visited[i] = true;
						queue.add( i );
					}
				}
			}
			
			/*
				for (int i : l) {���� for��
					
				}
				-- ���: �迭, Set, List
			*/
			
			
			StringBuffer sb = new StringBuffer();
			sb.append("[");
			for (int i :  queue) {
				sb.append(i).append(" "); //ť������ ���
			}
			sb.append("]");
	
			sb.append("[");
			for (boolean v2 :visited) {
				if (v2) {
					sb.append("-").append(" "); //�湮�� �� ������ ���
				}
				else {
					sb.append("X").append(" ");
				}
			}
			
			sb.append("]");
			System.out.println(sb.toString());
			
		}
	}
}

/*	

*/