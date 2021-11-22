interface IGreet {
	public String greet();
}

class HelloGreet implements IGreet {
	public String greet() {return "Hello";}
}

class MerciGreet implements IGreet {
	public String greet(){return "Merci";}
}

class SharpDeco implements IGreet {
	private IGreet ig = null;
	public SharpDeco(IGreet i) {
		this.ig = i;
	}
	
	public String greet() {
		return "#" + ig.greet() + "#";
	}
}

class StarDeco implements IGreet {
	private IGreet ig = null;
	
	public StarDeco(IGreet i) {
		this.ig = i;
	}
	
	public String greet() {
		return "*" + ig.greet() + "";
	}
}

public class Test110 {
	public static void main(String[] args) {
		//이러한 설계기법을 Decorator Pattern이라고 한다.
		IGreet ig = new SharpDeco( new StarDeco(new MerciGreet()));
		System.out.println(ig.greet());
	}
	
}