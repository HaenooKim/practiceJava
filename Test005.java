public class Test005 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		i = 100;
		j = i;
		i = i+1;
		
		System.out.println(i);
		System.out.println(j);
		
	}

}

/*
	java�� �ʱⰪ ���� ������ ��� ��ü�� �Ұ����ؼ� �ʱⰪ�� 0���� �ش�.
	
	int i; i��� �̸����� int���� ���� �� �ִ� �������� Ȯ���� ����.
	i = j; =�� ���Կ����̴�. ���� ������ ���� ���ʿ� �ִ� ���̴�. 
	
	i�� j�� ���� ������ �������� 100�̶�� ���� ������ �ȴ�.
	i = i+1; i�̸��� �������� �ִ� ���� ������Ų��.
	
*/