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
	���ͽ�Ʈ�� �˰��� : ���������� ���� �� ���������� �ִܰŸ��� ���ϴ� �˰���
*/

class Logic {
	public static void visit( int start, int[][] map ) {
		//start���� spot ������ ���̸� ��� ������
		int[] distance = new int[6];
		
		System.out.println("visited : " + start);
		
		for (int i=0; i<distance.length; i++) {
			if (i == start) {
				distance[i] = 0;
			}
			else if(map[start][i] ==0) {
				//���� ���� �ȵ� �������� �Ÿ�
				distance[i] = 100000;
			}
			else {
				//���� ����� �������� �Ÿ��� �� �Ÿ��� �״�� �Է��Ѵ�.
				distance[i] = map[start][i];
			}
		}
		
		boolean[] visited = new boolean[6];
		visited[start] = true;
		
		if (true) {
			//���� �湮�� �ȵ� spot�߿��� �ִ� �Ÿ��� �ִ� spot�� ���ؾ� �Ѵ�.
			
			
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
			System.out.println("min-visited : " + min_idx); //���� ����� ������ �湮�Ѵ�.
			/*
				0���� 4���� �Ÿ��� x���µ� 3���� ���� 0 - 3 - 4�ؼ� 2���Ǵ���...
				�׷��� 4������ �Ÿ��� x���� 2�� �ٲٸ� �Ǵµ�
				���۾��� ��� �ݺ��ϸ� �ȴ�.
				�̰��� ���ͽ�Ʈ�� �˰����� �ٽ�.
				
				������ �˴� �Ÿ����� �湮���� ���İ��� �Ÿ��� �� ������ �� �Ÿ��� �����Ѵ�.
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
			
			
			//�湮���� �ʾҲ� ����Ǿ��ִ� spot�� ���ؼ�..
			for (int i=0; i<distance.length; i++) {
				if (map[min_idx][i] != 0 && visited[i] ==false) {
					System.out.println(i);
					int dist2 = distance[min_idx] + map[min_idx][i];
					//���� ���� �����ϸ� 3�������� �Ÿ�+ 3������ [1, 2, 4]������ �Ÿ�
					
					//������ �˷���� start���� i������ �Ÿ��� ���ؼ� ª����?
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