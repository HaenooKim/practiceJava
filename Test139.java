class Temp {
	private static Temp uniq = null;
	//Ŭ������ �� �ѹ��� ȣ��ǹǷ� uniq��� ������ jvm�ȿ� �����ϰ� ��.
	
	
	//static initializer �ȿ��� uniq�� �ν��Ͻ��� ����Ű�� �϶�.
	/*
	static {
		uniq = new Temp();
	}
	*/
	
	// public static synchronized �ϰ� uniq�� �����ϴ� getInstance�Լ��� �����Ѵ�.
	public static synchronized Temp getInstance() {
		if (uniq == null) {
			uniq = new Temp();
		}
		return uniq;
	} 
	
	//TempŬ���� �ۿ����� �����ڸ� ȣ���� �� ����. �� �ν��Ͻ��� �� �����. 
	private Temp() {
		
	}
} //�̷��� �����ϴ� ���������� �̱��� �����̶�� �Ѵ�.

public class Test139 {
	public static void main(String[] args) {
		//new Temp(); //������
		Temp a = Temp.getInstance();
		Temp b = Temp.getInstance();
		System.out.println(a==b); //true (�����ͳ����� ���� ����� ����ų�� true�� ��)
	}
}

/*
c����� �Լ��� ���α׷��� �����ϴ� ���� �����ϰ� �����Ѵ�.
�̰�ó�� java�� �ν��Ͻ��� �� �ϳ��� jvm�󿡼� �����ϰ� ����� �� static�� �̿��ϸ� ����.
*/