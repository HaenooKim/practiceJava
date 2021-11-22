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
*/