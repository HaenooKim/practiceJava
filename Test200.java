interface IGreet {
	public String greet();
}

class HelloGreet implements IGreet {
	public String greet(){return "hello";}
}

class MerciGreet implements IGreet {
	public String greet(){return "Merci";}
}


class DoubleDeco implements IGreet {
	private IGreet ig = null;
	
	public DoubleDeco(IGreet i) {
		this.ig = i;
	}
	
	public String greet() {
		return ig.greet() + ": " + ig.greet();
	}
}

class StarDeco implements IGreet {
	private IGreet ig = null;
	public StarDeco(IGreet i) {
		this.ig = i;
	}
	public String greet() {
		return "*" + ig.greet() + "*";
	}
}

public class Test200 {
	public static void main(String[] args) {
		// 데코레이션 역할의 클래스는 여러번 겹쳐 적용이 되더라도 코드의 변경은 거의 없다.
		IGreet ig = new StarDeco(new DoubleDeco(new MerciGreet()));
		System.out.println(ig.greet());
	}
}


/*

	InputStream in = new FileInputStream(...)
	InputStream in = new ByteArrayInputStream(..) ->모바일 환경으 file대신 byte[]로 대신한다.
	
	IGreet- InputStream
	FileInputStream - HelloGreet
	ByteArrayInputStream - MerciGreet
	
	file을 생각하고 작성한 코드를 byte[]를 대상으로 한 코드로 변경시 인스턴스만 바꿔도 되어서 편리함.

	MerciGreet은 보여주어야 할 대상을 결정하고 있고
	DoubleDeco는 보여줄 형식을 결정하고 있다.
	두개가 결함한 형태로 결과를 만들고 잇음.
	
	InputStream in = new BufferedInputStream(new FileInputStream(...))
	
	DoubleDeco - Buffered InputStream (버퍼링을 이용하여 빠르게 읽는 기능을 제공)
	BufferedInputStream이 제공하는 장식을 거쳐서 읽는 대상은 FileInputStream에서 읽는 코드가 될것이다.
	
	ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream))
	
	FileInputStream에서 읽는데 BufferedInputStream을 이용하여 속도를 늘려주고
	ObjectInputStream에서 제공하는 readInt/ readDouble 등을 쓸수있는 코드가 된다.
	
	대상이 달라지고 데코레이션이 다양한 조합을 만들어 내어도 코드에 큰 변경이 가지 않는다.
*/