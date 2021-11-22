import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

class XCanvas extends Canvas {
	public XCanvas() {
		setSize( 500, 400 );
	}
	
	public void paint( Graphics g ) {
		update( g );
	}
	
	public void update( Graphics g ) {
		Graphics2D g2 = (Graphics2D)g;
		setBackground( Color.YELLOW );

		g2.setColor(Color.black);
		g2.drawLine(100, 100, 200, 200); //시작지점 - 도착지점
		
		g2.fillOval(200, 200, 10, 10);
		
		//왼쪽 꼭지점, 너비높이 형태
		g2.fillOval(100, 100, 100, 100);
		g2.fillOval(98, 98, 4, 4); //반지름이 4 
	}
}

class XFrame extends Frame {
	public XFrame() {
		Panel p1 = new Panel();
		final XCanvas xc = new XCanvas();
		p1.add( xc );
		
		Button btn = new Button("Click");

		final TextField tf = new TextField( 24 );
		btn.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String data = tf.getText();
				xc.repaint();
			}
		} );
		
		Panel p2 = new Panel();
		p2.add( tf );
		p2.add( btn );
		
		add( p1 , BorderLayout.CENTER );
		add( p2 , BorderLayout.SOUTH );
		
		setSize( 600, 360 );
		setVisible( true );
	}
}

public class Test181 {
	public static void main( String[] args ) {
		new XFrame();
	}
}

/*

*/