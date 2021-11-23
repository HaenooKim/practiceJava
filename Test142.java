package banana;

import java.util.Scanner;

interface ICar {
	public void turnRight();
	public void turnLeft();
}

class Spark implements ICar {
	public void turnRight() {System.out.println("TR");}
	public void turnLeft() {System.out.println("TL");}
	
}

class Colorado implements ICar {
	public void turnRight() {System.out.println("turnR");}
	public void turnLeft() {System.out.println("turnL");}
}

public class Test142 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		boolean alive = true;
		while(alive) {
			String l = sc.nextLine();
			if (l.equals("quit")) {
				alive = false;
			}
			else {
				Class<?> cls = Class.forName(l);
				ICar car = (ICar)cls.newInstance();
				
				car.turnRight();
				car.turnLeft();
			}
		}
	}
}


/*
	Scanner : 콘솔에서 사용자의 입력을 받아들일 용도로 씀
	
	Temp t = new Temp();
	-- 이 코드는 Temp클래스가 먼저 선언되어야만 쓸 수 있다 하지만 아래의 경우
	
	Class<?> cls = Class.forName(l);
	ICar car = (ICar)cls.newInstance();
	이 코드는 현재 존재하지 않는 클래스들도 연동될 수 있는 형태.
	단 여리서 ICar라는 인터페이스를 상속받은 경우에 한하게 됨
				
*/