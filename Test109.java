interface ICalc {
	public int execute(int i);
	
}

class Plus implements ICalc {
	
	int a;
	
	Plus (int i) {
		this.a = i;
	}
	
	public int execute(int i) {
		return a+i;
	}
}
class Minus implements ICalc {
	
	int a;
	
	Minus (int i) {
		this.a = i;
	}
	
	public int execute(int i) {
		return i-a;
	}
}

public class Test109 {
	public static void main(String[] args) {
		ICalc ic = new Plus(5);
		System.out.println(ic.execute(3));
		
		ICalc ic2 = new Minus(3);
		System.out.println(ic2.execute(2));
		
		
		
		/*
			동작 하나를 인스턴스로 만들어서 활용하는 기법을 Command Pattern이라고 한다.
		*/
		ICalc[] l = new ICalc[4];
		l[0] = new Plus(3);
		l[1] = new Minus(1);
		l[2] = new Plus(4);
		l[3] = new Minus(3);
		
		int start = 10;
		
		for (int i=0; i<l.length; i++) {
			start = l[i].execute(start);
		}
		
		System.out.println(": " + start);
		/*
		start = l[0].execute(start);
		System.out.println(": " + start);
		
		start = l[1].execute(start);
		System.out.println(": " + start);
		
		start = l[2].execute(start);
		System.out.println(": " + start);
		
		start = l[3].execute(start);
		System.out.println(": " + start);
		*/
		
		
	}
}