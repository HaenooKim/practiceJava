package banana;

import static banana.Logic.*;
import java.util.*;

public class Test272 {
	public static void main( String[] args ) {
		int[][] map = {
		//    0  1  2  3  4  5
			{ 0, 2, 5, 1, 0, 0 }, // 0
			{ 2, 0, 3, 2, 0, 0 }, // 1
			{ 5, 3, 0, 3, 1, 5 }, // 2
			{ 1, 2, 3, 0, 1, 0 }, // 3
			{ 0, 0, 1, 1, 0, 2 }, // 4
			{ 0, 0, 5, 0, 2, 0 }  // 5
		};
		
		visit(0, map);
		
	}
}

/*
	다익스트라 알고리즘 : 시작점에서 부터 각 스폿까지의 최단거리를 구하는 알고리즘
*/

class Logic {
	public static void visit( int start, int[][] map ) {
		//start에서 spot 까지의 길이를 담는 기억공간
		int[] distance = new int[6];
		
		System.out.println("visited : " + start);
		
		for (int i=0; i<distance.length; i++) {
			if (i == start) {
				distance[i] = 0;
			}
			else if(map[start][i] ==0) {
				//직접 연결 안된 스폿과의 거리
				distance[i] = 100000;
			}
			else {
				//직접 연결된 스폿과의 거리는 그 거리를 그대로 입력한다.
				distance[i] = map[start][i];
			}
		}
		
		boolean[] visited = new boolean[6];
		visited[start] = true;
		
		if (true) {
			//아직 방문이 안된 spot중에서 최단 거리에 있는 spot을 구해야 한다.
			
			
			int min_dist = 100000;
			int min_idx = -1;
			for (int i=0; i<distance.length; i++) {
				if (distance[i]!=0) {
					if (min_dist > distance[i]) {
						min_dist = distance[i];
						min_idx = i;
					}
				}
			}
			visited[min_idx] = true;
			System.out.println("min-visited : " + min_idx); //가장 가까운 지점을 방문한다.
			/*
				0에서 4까지 거리는 x였는데 3에서 보니 0 - 3 - 4해서 2가되더라...
				그래서 4까지의 거리를 x에서 2로 바꾸면 되는데
				이작업을 계속 반복하면 된다.
				이것이 다익스트라 알고리즘의 핵심.
				
				기존에 알던 거리보다 방문지를 거쳐가는 거리가 더 가까우면 그 거리로 없뎃한다.
			*/
			
			/*
			      0  1  2  3  4  5
				{ 0, 2, 5, 1, 0, 0 },  0
				{ 2, 0, 3, 2, 0, 0 },  1
				{ 5, 3, 0, 3, 1, 5 },  2
				{ 1, 2, 3, 0, 1, 0 },  3
				{ 0, 0, 1, 1, 0, 2 },  4
				{ 0, 0, 5, 0, 2, 0 }   5
			*/
			
			
			//방문되지 않았꼬 연결되어있는 spot에 대해서..
			for (int i=0; i<distance.length; i++) {
				if (map[min_idx][i] != 0 && visited[i] ==false) {
					System.out.println(i);
					int dist2 = distance[min_idx] + map[min_idx][i];
					//위의 식을 설명하면 3번까지의 거리+ 3번에서 [1, 2, 4]까지의 거리
					
					//기존에 알려줬던 start부터 i까지의 거리와 비교해서 짧으면?
					if (distance[i] > dist2) {
						distance[i] = dist2;
					}
				}
			}
		}
		
		
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("distance : [");
		for (int d : distance) {
			if (d==100000) {
				sb.append("X ");
			}
			else {
				sb.append(d).append(" ");
			}
		}
		sb.append("] \r\n");
	
		
		sb.append("visited : [");
		for (boolean b : visited) {
			if (b) {
				sb.append("O ");
			} 
			else {
				sb.append("- ");
			}
		}
		
		sb.append("]");
		System.out.println(sb.toString());
	
	
	
	}
}	