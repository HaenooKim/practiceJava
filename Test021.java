public class Test021 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println("Apple" + i);
			if (i == 3) {
				System.out.println("Kiwi");
				break;
			}
			System.out.println("Banana" + i);
			
		}
	}
}


/*
	���ڿ��� �ڿ� �̾���϶��� +��ȣ�� ����.
	= ���� : ������ ���� ���� ��
	== �� : �� ���� ���� ���� ��
	
	for ���� ���� ��� i<5 �� false�� �� ����������.
	�嵥 for �ȿ��� break�� ������ �̰Ͱ� ������� ����������.
	
	for( [1] ; [2] ; [3] ) {
		[4];		
	}
	
	[1] - [2] - [4] - [3] - [2] - [4] - [3] - [2] ...
	[4] ���� �ȿ��� continue �� ������ ��ٷ� [3] ���� ����. ( [4] ������ ���� �ڵ带 �ǳʼ� [3] )
	[4] �������� ������ �ڵ尡 �� �� �ִ� ( �翬 )

*/