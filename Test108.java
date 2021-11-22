//사장이 이걸 정해서 각 팀에게 나눠준다. - 분석을 깊이 할 필요없이 자율적으로 알아서 할 여지가 많음.
/*
	인터페이스를 활용하는 코드에서 벌어지는 단점
	- 여기에 빠진 기능은 다른 시스템에서도 빠지게됨.
	- 한 번 정해지면 고치기 난감하다 - 상속받은 모든 자동차를 다 고쳐야함.
	- 많은 사람들이 동시에 개발하는 경우? 인터페이스를 활용하여 일을 분배하는 경우가 많다.
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

인터페이스는 호환성을 만드는 용도임.

Spark <-> Colorado 간 호환성이 생긴다!!
*/