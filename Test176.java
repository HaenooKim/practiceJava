class ��°�� extends RuntimeException {}

class ����� extends RuntimeException {}

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
		
		System.out.println("�������ϴ�."); //���ܹ߻��� �����������
	}
}

public class Test176 {
	public static void main(String[] args) {
		���� kim = new ����();
		
		/*
			- ����ο� ���ܹ߻� ���ɼ��� ��õ� �Լ��� ȣ��� �ݵ�� try~catch���� �ȿ��� ȣ���ؾ���
			- ��, ���� �ڵ� public void �� (int �ð���) throws ��°��, ����� �̷��� ����� ��� 
				kim.��(3)�� try�� ������ ������ �ȵȴٴ� ����
		*/
		try { 
			kim.��(3);
			System.out.println("�����߽��ϴ�."); //kim.��(..)���� �����߻��ϸ� �����������
		} catch(��°�� e) {
			System.out.println("��Ǵ�");
		}catch (����� e) {
			System.out.println("119��");
		}
		
		System.out.println("���þ�����.");
		
		
	}
}

