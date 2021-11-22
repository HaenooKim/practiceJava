class ��°�� extends Exception {}

class ����� extends Exception {}

/*
	- RuntimeException : ���������� �γ��ϴ�. Exception : ���������� �����ϴ�.
	
	- Exception�� ��ӹ��� ���ܸ� �߻��� �� �ִ� �Լ��� ����ο� �ݵ�� �� ����� ����ؾ� �Ѵ�.
	(RuntimeException�� �ص��ǰ� �� �ص���) : throws ��°��, �����
*/


class ���� {
	
	public void �� (int �ð���) throws ��°��, �����{ //��°��� ����Ⱑ �Ͼ �� ������ ���
		System.out.println("�߳�");
		
		double rand = Math.random();
		
		if (rand < 0.3 && �ð��� < 7) {
			throw new ��°��();
		} 
		else if (rand < 0.5 && �ð��� < 5) {
			throw new �����();
		}
		
		System.out.println("�������ϴ�."); 
	}
}

public class Test177 {
	public static void main(String[] args) {
		���� kim = new ����();
	
		try { 
			kim.��(3);
			System.out.println("�����߽��ϴ�."); 
		} 
		
		/*
			�Ʒ��ڵ忡�� Exception���� �ٲپ� ������ ��°��� ����� ��ο� ���ؼ� �����ϰ� ��.
			
			Exception e = new ��°��(); �̰��� �����ϸ� ��´�.
			�� catch�� ����� �Ű������� throw�� ���� �ν��Ͻ��� ����ų �� ���� ��  ��´�.
		
			- Throwable e = new �����() or new ��°��();
			- Throwable�� Exception�� ����Ŭ������
			���ܻ�Ȳ�� �ƴ� ��쿡�� try catch�� �̿��� �ڵ带 ������ �� ���� �־ �׷���.
			���� ��� try catch�� ���� ���� Throwalbe�� ��ӹް� �� ���ܼ�Ȳ�� exception���� �޴´�.
			RuntimeException�� Exception�� ��ӹ޴´�.
			
			Throwable(������) - Exception(����) - RuntimeException(�ڽ�)
		*/
		
		
		catch (Throwable e) { //��°�Ⱑ �߻��ص� ����ο���, ����⸦ �ص� ����� �´�. (Exception e)
			/*���⿡ RuntimeException e�� ���´� . �ֳ��ϸ� ��°�Ⱑ Exception�� ��ӹ޾Ƽ�
			RuntimeException e = new ��°��(); �� �Ұ����ϱ� ����. 
			*/
		
			System.out.println("���մ�å" + e.getClass().getName());
		}
		
		System.out.println("���þ�����.");
		
		
	}
}

