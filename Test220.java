import java.awt.*;
import java.awt.Button;
import java.awt.event.*;
import java.io.*;
import javax.imageio.ImageIO;

class TCanvas extends Canvas {
	private Image img = null;
	private Image[] man = null;
	
	public TCanvas() {
		try {
			man = new Image[2];
			man[0] = ImageIO.read(new File("C:\\JavaWork\\man1.png"));
			man[1] = ImageIO.read(new File("C:\\JavaWork\\man2.png"));
			img = ImageIO.read(new File("C:\\JavaWork\\back.gif"));
		}
		catch (IOException e){}
		
		setSize( 320, 480 );
	}

	public void paint(Graphics g) {
		update(g);
	}

	public void update(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.drawImage(img, 0, 0, this);
		g2.drawImage(man[count%2], 50, 180, this);
	
		g2.dispose(); //close∞≥≥‰¿Ã¥Ÿ. ¥ŸΩË¿∏∏È »£√‚
	}
	
	private int count = 0;
	public void increase() {
		count++;
	}
}

public class Test220 extends Frame 
{
	public Test220() {
		Button btn = new Button("Click");
		final TCanvas canvas = new TCanvas();
		setLayout( new FlowLayout() );
		add( btn );
		add( canvas );

		btn.addActionListener( new ActionListener(){
			public void actionPerformed( ActionEvent e ){
				canvas.increase();
				canvas.repaint();
			}
		});
		
		setBackground( Color.yellow );
		pack();
	}

	public static void main( String[] args ) {
		new Test220().setVisible( true );
	}
}