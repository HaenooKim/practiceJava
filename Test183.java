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

		
		g2.drawLine(10, 200, 490, 200);//가로줄
		g2.drawLine(20, 10, 20, 390); //세로줄
		
		g2.drawOval(15, 195, 10, 10);
		
		for (double i = 0.0; i<361.0; i++) {
			double r = Math.sin(Math.toRadians(i));
			
			int x = (int)(i+20);
			int y = (int)(-r*180) + 200;
			
			g2.drawOval(x-2, y-2, 4, 4);
			System.out.println(i + " " + r);
		}
		
		/*
		for (double x=0; x<360; x++) {
			double y = 200+ 50 * Math.sin(x *3.1416/180);
			
			
			
			int X = (int)x;
			int Y = (int)y;
			
			System.out.println(X+ " " + Y);
			g2.fillOval(X, Y, 1, 1);
		}
		*/
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

public class Test183 {
	public static void main( String[] args ) {
		new XFrame();
	}
}

/*

*/