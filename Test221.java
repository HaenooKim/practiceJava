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
	
		g2.dispose(); //close�����̴�. �ٽ����� ȣ��
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
			�� ���α׷��� ���� �ϳ��� �����忡 ���ؼ� �����ϰ� �ִ�.
			�� ������ �����尡 ��ư �̺�Ʈ�� �޾Ƶ��̴� �ڵ嵵 ȣ���ϰ�
			UI�� ���� ������Ʈ�� ó���ϰ� �ִ�.
			UI �������� �θ���. (��ư�� ȭ����� �����ϵ��� ���ִ� �������� �ؼ� )
			�Ʒ� �ڵ�� �ּ� 50�� ���� �ݺ����� �������� �� ���� �� �ð����� ��ư�Է�ȭ�麯�� �� �� �� �� ����.
			
			�ȵ���̵� ���α׷��ֿ����� UI�� �����ϴ� �۾��� �ݵ�� UI Thread���� �ϵ��� �ؾ��ϰ�
			�װ��� ���ؼ��� ui Thread �ʿ� '�Ƿ�' �ϴ� ���·� UI�� �����ϵ��� �ؾ��Ѵٴ� ��Ģ�� �ִ�.
			(������ ������ Thread���� ���� ui�� �������� �ʴ´�.-�ȵ���̵� ����)
		*/
		
		btn.addActionListener( new ActionListener(){
			public void actionPerformed( ActionEvent e ){
				System.out.println("Click");
				
				/*
					���� GUI �������α׷��� ����� UI�� �ֽŹݿ��ϴ� Thread�� UI�������� �Ѵ�.
					�׸��� ������ �����带 ������ ������ ���α׷��� UI Thread�� ������.
					
					�׷��� �Ʒ� �ڵ�� UI �����带 50�ʰ� �����ϰ� �ִ�.
					�� �ð������� UI�� ������ �ǰ� �׸��� �ݿ����� �ʰ� ��ư�Է��� ó�������� ���Ѵ�.
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