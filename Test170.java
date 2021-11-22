import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;

/*
	Canvas : ���� �߰� �׸��� �׸��� �̹����� �����ִ� ���� ������ �����ϴ� Ŭ�����̴�.
		paint �Լ��� �������̵��ؼ� �׸����� �׷��ش� ( �� . ������ �׸� �������� )
		
	HTML5 ���� ���̴� Canvas � ���� ������ ���ư� , �ȵ���̵� ��� ����ϰ� ���Ǵ� ���� �ִ�.
	-- ���δ� �̰ɷ� �ϰ� �ٸ� GUI ���� ���α׷��� �ÿ��� ���� ����ϴ� �����ϱ� ���� ����...
*/
class XCanvas extends Canvas {
	public XCanvas() {
		setSize( 500, 200 );
		setBackground( Color.YELLOW );
	}
}

class XFrame extends Frame {
	public XFrame() {
		Panel p1 = new Panel();
		p1.add( new XCanvas() );
		
		Button btn = new Button("Click");
		
		
		TextField tf = new TextField(24);
		tf.setText("apple banana..");
		btn.addActionListener(new Apple(tf));
		
		Panel p2 = new Panel();
		p2.add( tf);
		p2.add( btn );
		
		add( p1 , BorderLayout.CENTER );
		add( p2 , BorderLayout.SOUTH );
		
		setSize( 600, 360 );
		setVisible( true );
	}
}

class Apple implements ActionListener {
	private TextField tf2 = null;
	public Apple(TextField t) {
		this.tf2 = t;
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println(tf2.getText());
	}
}

public class Test170 {
	public static void main( String[] args ) {
		new XFrame();
	}
}
/*
public void addActionListener(ActionListener l)

java.awt.event
Interface ActionListener
	void actionPerformed(ActionEvent e)
	
	�ռ� ��� ������ ������ �״�� ����Ǵ� ���̽���.
	Button : �������
	Apple : ������
	
	�� �ѻ��̴� ActionListener��� �������̽��� �����ϰ� ����Ǿ� �ְ�
	Button�� Action��Ȳ�� �������� addActionListener�� ��ϵ� �����ڰ� �������̵��ϴ�
	actionPerformed�� ȣ��Ǵ� ����.
*/