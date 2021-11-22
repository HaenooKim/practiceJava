import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

class XCanvas extends Canvas {
	public XCanvas() {
		setSize( 500, 200 );
		setBackground( Color.YELLOW );
	}
	
	public void paint( Graphics g ) {
		Graphics2D g2 = (Graphics2D)g;
		
		for( int i = 0 ; i < 10 ; i++ ) {
			for( int j = 0 ; j < 4 ; j++ ) {
				if( ( i + j ) % 2 == 0 ) {
					g2.setColor( Color.BLACK );
				} else {
					g2.setColor( Color.WHITE );
				}
				g2.fillRect( i*50, j*50, 50, 50 );
			}
		}
	}
}

class XFrame extends Frame {
	public XFrame() {
		Panel p1 = new Panel();
		p1.add( new XCanvas() );
		
		Panel p2 = new Panel();
		p2.add( new TextField( 24 ) );
		p2.add( new Button("Click") );
		
		add( p1 , BorderLayout.CENTER );
		add( p2 , BorderLayout.SOUTH );
		
		setSize( 600, 360 );
		setVisible( true );
	}
}

public class Test167 {
	public static void main( String[] args ) {
		new XFrame();
	}
}
/*
	( 10 / 3 ) = 3 , 3.33333
	  10 % 3 = 1 나머지를 구하는 연산이 %
*/