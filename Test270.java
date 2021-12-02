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
		
		while(queue.size()!=0) {//ť�� �������� ����
			int v = queue.remove(0); //�Ǿտ� �ִ� ���� ����(�� ���� �湮����)	
			System.out.println("visited : " + v);
			
			/*	  0  1  2  3  4
				{ 0, 1, 1, 0, 1 },
				{ 1, 0, 1, 0, 0 },
				{ 1, 1, 0, 1, 1 },
				{ 0, 0, 1, 0, 1 },
				{ 1, 0, 1, 1, 0 }
				
				WHILE 1ȸ : v=0 VISITED : [- - - X -] QUEUE : [1 2 4] 
				          
							--ť���� 1�� �����
				while 2ȸ : v=1 VISITED : [- - - X -] QUEUE : [2 4] --�ű� ����x
							
							--ť���� 2�� �������
				while 3ȸ :  v=2 VISITED : [- - - - -] QUEUE : [ 4 3] --2�� ���������� 3�� ����
							
							
							��� �湮 �Ϸ�!
							-- ť���� 4�� �������
				while 4ȸ : v=4 VISITED : [- - - - -] QUEUE : [3] --�ű�����x
				
							-- ť���� 3�� �����
				while 5ȸ : v=3 VISITED : [- - - - -] QUEUE : [] --�ű�����x ť�� ��� �����.
						   
			*/
			// VISITED : [- - - X -]
			// QUEUE : [1 2 4] 
			
			for (int i=0; i<map.length; i++) {//���ι������� �ȴ´�.
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
	������ ���ȣ���� �̿��� �湮 �˰����� "DFS = Depth first Search"�˰����̶�� �Ѵ�.
	�̵��ϰ� �̵��� �������� �ٽ� �̵��ϴ� ������ �˻��̶� ��θ� ������ ��쿡 ����ȴ�.
	
	�װͰ��� ���ǰ� '���� ����� �������� ���� ��� �湮�ϴ� ������ �湮 �˰����� �ִµ�
	�̸� BFS�˰����̶�� �Ѵ�.
	
	�湮 �˰����� ũ�� �� ���� �⺻�� �ȴ�.
	BFS�� �����ϱ⺸�� �ľ��ϰ� �ܿ�°� �ΰ� ������... ���ȣ���� �� ���� ����.
*/