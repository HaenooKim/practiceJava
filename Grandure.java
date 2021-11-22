package banana;

public class Grandure implements ICar {
	public void turnRight() {System.out.println("tRight");}
	public void turnLeft() {System.out.println("tLeft");}
}

/*
	특징 : Test142가 만들어진 다음에 만들어진 코드
	
	javac -classpath C:\classes -d C:\classes Grandure.java
*/