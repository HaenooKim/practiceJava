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
	
		g2.dispose(); //close개념이다. 다썼으면 호출
	}
	
	private int count = 0;
	public void increase() {
		count++;
	}
}

public class Test221 extends Frame 
{
	public Test221() {
		Button btn = new Button("Click");
		final TCanvas canvas = new TCanvas();
		setLayout( new FlowLayout() );
		add( btn );
		add( canvas );
	
		/*
			이 프로그램은 지금 하나의 쓰레드에 의해서 동작하고 있다.
			그 유일한 쓰레드가 버튼 이벤트를 받아들이는 코드도 호출하고
			UI에 대한 업데이트도 처리하고 있다.
			UI 쓰레드라고 부른다. (버튼과 화면등을 동작하도록 해주는 쓰레드라고 해서 )
			아래 코드는 최소 50초 동안 반복문을 빠져나갈 수 없고 그 시간동안 버튼입력화면변경 등 할 수 가 없다.
			
			안드로이드 프로그래밍에서는 UI를 변경하는 작업은 반드시 UI Thread에서 하도록 해야하고
			그것을 위해서는 ui Thread 쪽에 '의뢰' 하는 형태로 UI를 벼경하도록 해야한다는 원칙이 있다.
			(별도의 생성된 Thread에서 직접 ui를 변경하지 않는다.-안드로이드 에선)
		*/
		
		btn.addActionListener( new ActionListener(){
			public void actionPerformed( ActionEvent e ){
				System.out.println("Click");
				
				/*
					흔히 GUI 응용프로그램을 만들면 UI를 최신반영하는 Thread를 UI쓰레드라고 한다.
					그리고 별도의 쓰레드를 만들지 않으면 프로그램은 UI Thread가 돌린다.
					
					그런데 아래 코드는 UI 쓰레드를 50초간 독점하고 있다.
					그 시간동안은 UI는 먹통이 되고 그림을 반영하지 않고 버튼입력을 처리하지도 못한다.
				*/
				
				for (itn i=0; i<200; i++) {
					canvas.increase();
					canvas.repaint();
					try {
						Thread.sleep(250);
					}
					catch(InterruptedException e2){}
				}
				
				
			}
		});
		
		setBackground( Color.yellow );
		pack();
	}

	public static void main( String[] args ) {
		new Test221().setVisible( true );
	}
}