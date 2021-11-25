import java.awt.*;
import java.awt.Button;
import java.awt.event.*;
import java.io.*;
import javax.imageio.ImageIO;

class TCanvas extends Canvas implements Runnable {
	
	//버튼을 눌렸을 때 아래의 run()이 ui쓰레드가 아닌 생성된 스레드로 돌아가게 하려면?
	public void run() {
		boolean alive = true;
		
		
		while(alive) {
			increase();
			repaint();
			
			try {
				Thread.sleep(250);
			}
			catch(InterruptedException e2) {}
		}
	}
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
	
		g2.dispose(); //close개념이다. 다썼으면 호출
	}
	
	private int count = 0;
	public void increase() {
		count++;
	}
}

public class Test222 extends Frame 
{
	public Test222() {
		Button btn = new Button("Click");
		Button btnWait = new Button("wait");
		Button btnNotify = new Button("Notify");
		
		final TCanvas canvas = new TCanvas();
		setLayout( new FlowLayout() );
		add( btn );
		add(btnWait);
		add(btnNotify);
		add( canvas );
	
		
		btn.addActionListener( new ActionListener(){
			public void actionPerformed( ActionEvent e ){
				Thread t = new Thread(canvas);
				t.start();
			}
		});
		
		setBackground( Color.yellow );
		pack();
	}

	public static void main( String[] args ) {
		new Test222().setVisible( true );
	}
}