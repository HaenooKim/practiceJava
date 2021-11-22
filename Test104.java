
interface ITemp {
	public abstract void print();
	public void print(int i);
}

class Temp implements ITemp {
	public void print() {System.out.println("print1");}
	public void print(int i) {System.out.println("print2");}
}


public class Test104 {
	public static void main(String[] args) {
		ITemp t = new Temp();
		t.print();
	}
}



/*
	- inerface : 좀 이상한 클래스...
	- public abstract 한 메소드만 멤버로 가진다. (public abstract나 abstract public이나 코드순서는 상관없음)
	- 메소드에 abstract를 안 붙여도 자동으로 붙는다.
	- 당연히 인스턴스 못 만든다.
	- 상속해서 클래스를 선언할 때 implements를 사용. 모든 메소드를 다 오버라이딩 해야함(안해주면 abstract class가 됨)
	- A t = new B()개념은 동일하게 적용
*/