class Bank {
	Object t = null;
	
}

class Bank2 {
	String t = null;
}


public class Test114 {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.t = "HelloWorld";
		//String b2 = b.t ->에러난다. 자손타입변수로 조상의 인스턴스를 가리키는 것은 불가능.
		String b2 = (String)b.t;//캐스팅을 해주면 가능함
		
		Bank2 c = new Bank2();
		c.t = "HelloWorld";
	}
}


/*
	Bank는 어떤 인스턴스든 멤버변수로 가리킬 수 있지만 원래대로 꺼낼 땐 반드시 원래타입으로 캐스팅해줘야함.
	
	Bank2는 String만 멤버변수를 이용하여 가리킬 수 있지만, 원래대로 꺼낼 때 캐스팅이 필요없다.
*/