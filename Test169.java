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
	Canvas : 선을 긋고 그림을 그리고 이미지를 보여주는 등의 역할을 수행하는 클래스이다.
		paint 함수를 오버라이딩해서 그림등을 그려준다 ( 뻥 . 지금은 그리 생각하자 )
		
	HTML5 에서 쓰이는 Canvas 등에 많이 영향을 미쳤고 , 안드로이드 등에도 비슷하게 사용되는 것이 있다.
	-- 공부는 이걸로 하고 다른 GUI 관련 프로그래밍 시에는 거의 비슷하니 이해하기 편할 것임...
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
		btn.addActionListener(new Apple());
		
		TextField tf = new TextField(24);
		tf.setText("apple banana..");
		
		
		
		Panel p2 = new Panel();
		p2.add( new TextField( 24 ) );
		p2.add( btn );
		
		add( p1 , BorderLayout.CENTER );
		add( p2 , BorderLayout.SOUTH );
		
		setSize( 600, 360 );
		setVisible( true );
	}
}

class Apple implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("Apple::ActionPerformed");
	}
}

public class Test169 {
	public static void main( String[] args ) {
		new XFrame();
	}
}
/*
public void addActionListener(ActionListener l)

java.awt.event
Interface ActionListener
	void actionPerformed(ActionEvent e)
	
	앞서 배운 관찰자 패턴이 그대로 적용되는 케이스다.
	Button : 관찰대상
	Apple : 관찰자
	
	이 둘사이는 ActionListener라는 인터페이스로 느슨하게 연결되어 있고
	Button의 Action상황이 벌어지면 addActionListener로 등록된 관찰자가 오버라이딩하는
	actionPerformed가 호출되는 설계.
*/