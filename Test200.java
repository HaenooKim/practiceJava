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
		// ���ڷ��̼� ������ Ŭ������ ������ ���� ������ �Ǵ��� �ڵ��� ������ ���� ����.
		IGreet ig = new StarDeco(new DoubleDeco(new MerciGreet()));
		System.out.println(ig.greet());
	}
}


/*

	InputStream in = new FileInputStream(...)
	InputStream in = new ByteArrayInputStream(..) ->����� ȯ���� file��� byte[]�� ����Ѵ�.
	
	IGreet- InputStream
	FileInputStream - HelloGreet
	ByteArrayInputStream - MerciGreet
	
	file�� �����ϰ� �ۼ��� �ڵ带 byte[]�� ������� �� �ڵ�� ����� �ν��Ͻ��� �ٲ㵵 �Ǿ ����.

	MerciGreet�� �����־�� �� ����� �����ϰ� �ְ�
	DoubleDeco�� ������ ������ �����ϰ� �ִ�.
	�ΰ��� ������ ���·� ����� ����� ����.
	
	InputStream in = new BufferedInputStream(new FileInputStream(...))
	
	DoubleDeco - Buffered InputStream (���۸��� �̿��Ͽ� ������ �д� ����� ����)
	BufferedInputStream�� �����ϴ� ����� ���ļ� �д� ����� FileInputStream���� �д� �ڵ尡 �ɰ��̴�.
	
	ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream))
	
	FileInputStream���� �дµ� BufferedInputStream�� �̿��Ͽ� �ӵ��� �÷��ְ�
	ObjectInputStream���� �����ϴ� readInt/ readDouble ���� �����ִ� �ڵ尡 �ȴ�.
	
	����� �޶����� ���ڷ��̼��� �پ��� ������ ����� ��� �ڵ忡 ū ������ ���� �ʴ´�.
*/