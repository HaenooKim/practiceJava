package banana;

public class Test264 {
	public static void main(String[] args) {
		//4��¥�� �迭�� ������µ� �� ��Ұ� int[]�̴�.
		
		/*
			java�� �迭�� ������ �� ������ �����̴�. null���� ������ ���� �ִ�.
			�迭�� ������ �� new�� ����. -- �迭 ����� �� �ν��Ͻ� �����ϵ� �ϰ��ִ�.
			
			->�ڹ��� �迭�� �ν��Ͻ��̴�. (�ٸ� ���ʹ� ���� �ٸ���.)
		*/
		int[][] map = new int[4][];
		map[0] = new int[]{1, 2};
		map[1] = new int[]{3, 4, 5};
		map[2] = new int[2]; //�������
		map[3] = new int[]{6};
		
		for (int i=0; i<map.length; i++) {
			for (int j=0; j<map[i].length; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		
		int[] t = null;
		int[] r = new int[4];
		
	}
}

/*
javac -d c:\classes Test264.java
java -classpath c:\classes banana.Test264
*/