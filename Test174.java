class ��°�� extends RuntimeException {
	
}

class ����� extends RuntimeException {
	
}



class ���� {
	public void �� (int �ð���) {
		System.out.println("�߳�");
		
		double rand = Math.random();
		
		if (rand < 0.3 && �ð��� < 7) {
			throw new ��°��();
		} 
		else if (rand < 0.5 && �ð��� < 5) {
			throw new �����();
		}
	}
}

public class Test174 {
	public static void main(String[] args) {
		���� kim = new ����();
		
		/*
		������ �� ���ɼ��� �ִ� �Լ�ȣ���ϴ� ������ try{...}�� �����ش�.
		...�ȿ��� ��°�Ⱑ �������� �� ó���ϴ� �ڵ�� catch(��°�� e) {...}�� �д�.
		*/
		try {
			kim.��(3);
		} catch(��°�� e) {
			System.out.println("��Ǵ�");
		}catch {����� e} {
			System.out.println("119��");
		}
		
		
	}
}

/*
	����ó�� : ���α׷� ���۽� ������ ó���ϴ� �ٹ�
	
	1. �Լ��� ȣ��ɶ� �������� �߻��Ѵ�.
	2. ���� ���ܻ�Ȳ�� Ŭ������ ���ǵȴ�. (extends RuntimeException)
	3. ���ܻ�Ȳ�� �߻��Ǹ� �ش� ���ܻ�Ȳ�� �ش��ϴ� Ŭ������ �ν��Ͻ��� ����� �װ��� ������.
	4. ������ ���ܴ� catch���� ������ ���α׷��� ����ȴ�.
	(�������� �߻��ϸ� �׿� ���� ó���� ���� ������ ���α׷��� ����)
	5. ������ ó���� �������� ��ġ �����ٴ� ���� ���α׷��� ������ ����Ѵ�.
*/