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
			0���� �����ؼ� ��� �湮�ϰ������ Ʈ��ó�� �湮�Ϸ���?
		*/
		/*
			���ú����� �迭�� �����ϸ� ���δ� �ʱⰪ�� �ڵ����� ���µ�
			int�� ��� 0, boolean�� flase, �����ʹ� null�� ����.
		*/
		boolean[] visited = new boolean[5];
		//System.out.println(visited[0]);
		
		//0���� ���
		visit(0, visited, map);
	}
}

class Logic {
	/*
		[X X X X X] --�湮����� ���� �� ���� ����
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
		
		//�ְ� ����� �� ������ ���� �ɸ��� ���� ����.
		
		
		/*
			{0, 1, 1, 0, 1}, 0����
			{1, 0, 1, 0, 0}, 1����
			{1, 1, 0, 1, 1}, 2����
			{0, 0, 1, 0, 1}, 3����
			{1, 0, 1, 1, 0}, 4����
		
		0���忡�� ���� �湮���� && �湮�������� �� ���ȣ��
		
		*/
		
		for (int i=0; i<map[spot].length; i++) {
			if (map[spot][i] != 0 && visited[i] == false) {
				visit(i, visited, map);
			}
		}
	}
	
}