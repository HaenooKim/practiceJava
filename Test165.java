import java.awt.Frame;

class XFrame extends Frame {
	public XFrame() {
		setSize( 600, 360 );
		setVisible( true );
	}
}

public class Test165 {
	public static void main( String[] args ) {
		new XFrame();
	}
}
/*
	상속과 생성자를 이용해서 같은 동작의 코드도 만들어 보고 ...
	
		Frame f = new Frame();
		f.setSize( 600, 360 );
		f.setVisible( true );	
	
	이 코드와 위의 코드는 같은 동작을 한다.
*/