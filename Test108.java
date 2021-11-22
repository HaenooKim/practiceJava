//������ �̰� ���ؼ� �� ������ �����ش�. - �м��� ���� �� �ʿ���� ���������� �˾Ƽ� �� ������ ����.
/*
	�������̽��� Ȱ���ϴ� �ڵ忡�� �������� ����
	- ���⿡ ���� ����� �ٸ� �ý��ۿ����� �����Ե�.
	- �� �� �������� ��ġ�� �����ϴ� - ��ӹ��� ��� �ڵ����� �� ���ľ���.
	- ���� ������� ���ÿ� �����ϴ� ���? �������̽��� Ȱ���Ͽ� ���� �й��ϴ� ��찡 ����.
*/


interface ICar {
	public void turnRight();
	public void turnLeft();
}

class Spark implements ICar {
	public void turnRight() {
		System.out.println("tR");
	}
	
	public void turnLeft() {
		System.out.println("tL");
	}
}

class Colorado implements ICar {
	public void turnRight() {
		System.out.println("turnR");
	}
	public void turnLeft() {
		System.out.println("turnL");
	}
}

public class Test108 {
	public static void main(String[] args) {
		ICar car = new Spark();
		car.turnRight();
		car.turnLeft();
	}
}

/*

�������̽��� ȣȯ���� ����� �뵵��.

Spark <-> Colorado �� ȣȯ���� �����!!
*/