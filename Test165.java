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
	��Ӱ� �����ڸ� �̿��ؼ� ���� ������ �ڵ嵵 ����� ���� ...
	
		Frame f = new Frame();
		f.setSize( 600, 360 );
		f.setVisible( true );	
	
	�� �ڵ�� ���� �ڵ�� ���� ������ �Ѵ�.
*/