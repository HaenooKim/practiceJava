class ��°�� extends RuntimeException {
	
}

class ����� extends RuntimeException {
	
}



class ���� {
	public void �� (int �ð���) { //�̰� RuntimeException�̸� throws ��°��, ����⸦ �����൵������ Exception�� ����� ��� �ݵ�� ����ؾ���.(������ �����̱� ����)
		System.out.println("�߳�");
		
		double rand = Math.random();
		
		if (rand < 0.3 && �ð��� < 7) {
			throw new ��°��(); //�ش� �ν��Ͻ��� ����� throw�� �Ѵ�.
		} 
		else if (rand < 0.5 && �ð��� < 5) {
			throw new �����();
		}
		
		System.out.println("�������ϴ�."); //���ܹ߻��� �����������
	}
}

public class Test175 {
	public static void main(String[] args) {
		���� kim = new ����();
	
		
		kim.��(4);
		
		System.out.println("�����߽��ϴ�.."); //���ܹ߻��� ������������
		
	}
}

/*
	- try~ catch��� �������� ��. �ٸ� �����ϴٰ� �������� ���α׷��� �����
	- ���ܰ� �߻��ϸ� �� ������ �ڵ�� �������� �ʴ´�. (�Լ� ���̵� ���̵� �������� ����) 
	
*/