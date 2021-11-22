
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
	- inerface : �� �̻��� Ŭ����...
	- public abstract �� �޼ҵ常 ����� ������. (public abstract�� abstract public�̳� �ڵ������ �������)
	- �޼ҵ忡 abstract�� �� �ٿ��� �ڵ����� �ٴ´�.
	- �翬�� �ν��Ͻ� �� �����.
	- ����ؼ� Ŭ������ ������ �� implements�� ���. ��� �޼ҵ带 �� �������̵� �ؾ���(�����ָ� abstract class�� ��)
	- A t = new B()������ �����ϰ� ����
*/