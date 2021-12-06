package banana;


import static banana.Logic.*;

public class Practice001 {
	public static void main(String[] args) {
		int[][] map = {
			{ 0, 1, 1, 0, 1 },	//	0
			{ 1, 0, 1, 0, 0 },
			{ 1, 1, 0, 1, 1 },
			{ 0, 0, 1, 0, 1 },
			{ 1, 0, 1, 1, 0 }
		};
		
		
		boolean[] visited = new boolean[5];
		
		visit(2, visited, map);
		
		/*
				 0  1  2  3
			0 	{0, 1, 1, 1}
			1   {1, 0, 1, 0}
			2   {1, 1, 0, 0}
			3   {1, 0, 0, 0}
		*/
	
		
		
		
	}
}

class Logic {
	public static void visit(int start, boolean[] visited, int[][] map) {
		visited[start] = true;
		System.out.println(start);
		
		for (int i=0; i<map[start].length; i++) {
			if (visited[i]==false && map[start][i]==1) {
				visit(i, visited, map);
			}
		}
		
	}
	
}