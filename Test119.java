interface ITemp<X> {
	public X getData();
}

public class Test119 {
	public static void main(String[] args) {
		int t = 200;
		
		ITemp<Integer> it = new ITemp<Integer>() {
			public Integer getData() {
				//t=t+1; -> ������ �� ���� �Ұ�.
				return t;
			}
		};
		
		int j = it.getData();
		System.out.println(j);
		
		
	}
}


/*
	���ú����� ���� anonymous class�� ����ϰ� �ִٸ�
	�ش� �ν��Ͻ��� ������ �÷����� ���� �ʴ� �ѿ����� ���ú����� �Լ�ȣ���� ������ �������� �ȵȴٴ� ���.
	 anonymous Ŭ������ ������� ���ú����� ���� �����ؼ��� �ȵȴ�.
*/