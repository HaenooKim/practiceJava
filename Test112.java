class A {
	private int value = 0;
	
	public A(int i) {value = i;}
	public int intValue() {return this.value;}
}


public class Test111 {
	public static void main(String[] args) {
		A t = new A(100);
		//int j = (int)t; ������. ��? �ڷ��� ���������� ����ȯ�� �Ǿ ������ ������ ����ȯ�� �ȵ�.
	
		int j = t.intValue();
		Integer t2 = new Integer(100);
		
		int j = t2; //������ ���� �ȵǴ� �ڵ����� �����Ϸ��� t2.intValue�� �ڵ带 �ٲ� �Ŀ� �������Ѵ�.
		//�̷��� ��� �ڽ����� ���빰(intValue)�� �������ٰ� �Ͽ� Unboxing�̶�� �Ѵ�.
		
		Object t3 = 200; // new Integer(200)���� �����Ϸ��� �˾Ƽ� �ٲ��ش�.
		//int j3 = t3; ->������. ObjectŸ���� ������ ��ڽ��� �� �ȴ�. 
	}
}