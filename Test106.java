interface ITemp {
	public void print();
	public void print2();
}


class Temp implements ITemp {
	public void print() {
		System.out.println("print");
	}
	
	public void print2() {
		System.out.println("print2");
	}
}

public class Test106 {
	public static void main(String[] args) {
		ITemp t = new Temp();
		t.print();
		t.print2();
	}
}

/*
	인터페이스
	- 상속받은 모든 메소드를 오버라이딩 한다.
	- public abstarct method
	- implements를 사용해서 상속
	
	abstract class와 다른 것이 뭘까?
	- interface는 반드시 abstarct로만 구성되어있어야함(메소드가 선언만 되어있어야 함)
*/	