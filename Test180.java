/*	
	178 �ڵ忡 ���� ��! ( �ڵ�� ������ �� �Բ� �ܿ쵵�� �ϼ���. �װ� �� �ΰ� �����ϴ� )
*/

class FuelException extends Exception {}
class BreakException extends Exception {}

class Car {
	private int fuel = 5;
	public void drive( boolean stopper ) throws FuelException, BreakException {
		fuel--;
		if( fuel == 1 ) {
			throw new FuelException();
		}
		if( stopper == false ) {
			throw new BreakException();
		}
		System.out.println("���� 1���� �Ҹ� : GOGO");
	}
}

public class Test180 {
	public static void main( String[] args ) {
		Car car =  new Car();
		//������
		try {
			//���
			try { 
				//����
				car.drive( true );
				car.drive( true );
				car.drive( false ); //1. ������ ��� ��.
			}
			catch (Exception e) {
				System.out.println("ó��" + e.toString());
				throw e; //2. ����� ó���� �ϰ� �ٽ� ������.(�����ڿ��� ������)
			} //3. �׷� �̰��� ����� ���ģ�� ��
			
			//System.out.println(",..."); //������ ��� ���� ���� �� �ڵ�� ������� �ʴ´�
			//�ٵ� �����Ű�� �ʹٸ�? -> ���ܰ� �߻��ص� ������ �����ϰ� �ϴ�finally�� ��
			
			finally { //���ܰ� �߻��ص� ������ �����ϰ� ��
				System.out.println("finally");
			}
			
		}
		catch( Exception e ) {
			System.out.println("������ " + e.toString());
		} //4. �����ڰ� ���������� ó��
	}
}

/*
	- ���������� ���� �ڵ�ó�� 2�� 3������ try�� ��ġ�ؼ� �� ���ҿ� �´� �ڵ带 ��ġ�Ѵ�.
	- try���� ���ܰ� �߻��ϰ� �߻����� �ʰ� ������ �����ϴ� ������ finally�� ��ġ�Ѵ�.
*/