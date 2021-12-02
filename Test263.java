/*
	Graph : ������ ������ ���� �ִ� ������ Ǯ��� �ڷᱸ����
	�迭�� �̿��Ͽ� �����ϴ� �����
	List�� �̿��Ͽ� �����ϴ� ��� �ΰ����� �ִ�.
	
	spot : ����
	4���� spot�� ���踦 ǥ���ϱ� ���ؼ��� 4*4ũ���� �迭�� �ʿ�� �Ѵ�.
	int 4���� ��ҤǤ� ���� �迭�� ������ �ִ� �迭
*/


public class Test263 {
	public static void main(String[] args) {
		
		int[][] map = {
			{0, 1, 0, 1},
			{1, 0, 0, 0},
			{0, 0 ,0 ,1},
			{1, 0, 1, 0}
		};
		
		/*
			0-1
			0-3
			2-3
		*/
		
		
		//int[][] map = new int[4][4]; //�迭�� �����ϸ� �� ���δ� 0���� �ʱ�ȭ. (�����Ⱚ ���� �� �ƴ�)
		int[][] map2 = new int[4][4];
		map2[0][1] = map2[1][0] = 1;
		map2[0][3] = map2[3][0] = 1;
		map2[2][3] = map2[3][2] = 1;
		
		/*
		for (int i=0; i<map2.length; i++) {
			StringBuffer sb = new StringBuffer();
			sb.append(map2[i][0]).append(' ');
			sb.append(map2[i][1]).append(' ');
			sb.append(map2[i][2]).append(' ');
			sb.append(map2[i][3]).append(' ');
			System.out.println(sb.toString());
		}
		*/
		
		/*
			a=b ? c:d
			b�� ���̸� a=c, b�� �����̸� a=d�� ���Եȴ�.
		*/
		
		for (int i=0; i<map2.length; i++) {
			StringBuffer sb = null;
			for (int j=0; j<map2[i].length; j++) {
				sb =(sb ==null ? new StringBuffer() : sb.append(' '));
				sb.append(map2[i][j]);
			}
			System.out.println(sb.toString());
		}
		
	}
}