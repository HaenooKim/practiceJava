/*
	FuelException, BreakException �ΰ��� ���ܸ� ������ �������� ����
	FuelException : ���ᰡ 1l������ �� �߻�, BreakException�� stopper�� false�� �� �߻�
	�̰��� ���ܹ߻��� ���� ó���� �ϳ��� catch���� �ϵ��� �ڵ带 ¥����.
	
	* ���ܴ� �Լ��� ȣ��ɶ� �߻�, ���ܻ�Ȳ�� Ŭ������ ����
	* ������ ������ Exception�� ��� -> �ݵ�� �Լ� ����� ��ø� ������� ex) public void �Լ���(�Ű�����) throws Ŭ������, Ŭ������ ---
	
*/


class FuelException extends Exception{}
class BreakException extends Exception{}

class Car {
	private int fuel = 5;
	public void drive(boolean stopper) throws FuelException, BreakException {
		
		fuel--;
		
		if (fuel ==1) {
			throw new FuelException();
		}
		
		if (stopper == false) {
			throw new BreakException();
		}
		
		
		System.out.println("���� 1���� �Ҹ� : GOGO");
		
		
		
	}
}


public class Test178 {
	public static void main(String[] args) {
		Car car = new Car();
		try {
			car.drive(true);
			car.drive(true);
			car.drive(true);
			car.drive(true);
			car.drive(true);
			car.drive(true);
		} 
		catch (Exception e) {
			System.out.println(e.toString());
		}
	
	}
}