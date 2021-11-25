import java.util.*;

/*
	wait(), notify()�� Thread�� ������ �Լ����� Object�� ����� �Լ��̴�.
	����� this.wait()�ε� this�� �����Ȱ� wait�� �������� �ʾƵ� ���� �ִ� ���� �������� ���� �����޾Ƽ� �׷��ǵ�
	table�� ������ object�̱� ����
	
	object���忡�� �غ� �ȵǾ����� �ڽ��� �̿��Ϸ��� �ϴ� �����带 ���缼��� (wait())
	
	���̺����忡�� ���ð� 5�� �Ѱ� �׿����� shampoo�� ��� ���缼���� �ϰ�
	���ð� ������ wash�� ��� ���� ������ �ϴ� ��Ȳ�̴�.
	
	���� ���̺��� ���缼�� �����尡 ������ �� ���� ����°� notify()��.
*/

class ShampooAI extends Thread {
	private Table tbl = null;
	public ShampooAI( Table t ) {
		this.tbl = t;
	}
	
	public void run() {
		for( int i = 0 ; i < 300 ; i++ ) {
			String d = "dish " + i;
			tbl.on( d );
		}
	}
}

class WashAI extends Thread {
	private Table tbl = null;
	public WashAI( Table t ) {
		this.tbl = t;
	}
	
	public void run() {
		for( int i = 0 ; i < 300 ; i++ ) {
			String d = tbl.off();
		}
	}
}

class Table {
	private List<String> dishes = null;
	public Table() {
		dishes = new LinkedList<String>();
	}
	
	public synchronized void on( String dish ) {
		while(dishes.size()==5) {
			try {
				wait(); //�� �Լ� ȣ���ϴ� ������� �� �l��
			}
			catch (InterruptedException e){}
			
		}
		System.out.println( dish + " : on the table" );
		dishes.add( dish );

		notify(); //���ð� �ö���� wash ����
	}
	
	/*
	���� ���鰳�� �����尡 ���ÿ� �۾��ϰ� �Ǹ� wait�Ǿ��ٰ� ����µ�
	�ٽ� �ֺ�� �ְԵǸ� �ٽ� wait�Ǿ�� �Ѵ�. ���� �� ��� if��� while�� �����
	
	wait()�� notify()�� �̿��Ͽ� ��ü�� �غ�� ��Ȳ������ �����尡 ��ü�� �Լ��� ȣ��� �� �ֵ���
	��Ʈ�� �ϴµ� �̸� ����ͱ���̶�� �Ѵ�.
	*/
	
	public synchronized String off() {
		while (dishes.size() ==0) {
			try {
				wait();
			}
			catch(InterruptedException e){}
		}
		
		int sz = dishes.size();
		
		String d = dishes.remove( sz - 1 );
		System.out.println( d + " : off the table" );
			
		notify(); //�ڽ��� ���� �����带 �ٽ� ���ϵ��� �ϴ� �ڵ�
		
		return d;
	}
}

public class Test219 {
	public static void main( String[] args ) {
		Table table = new Table();

		Thread s = new ShampooAI( table );
		Thread w = new WashAI( table );
		s.start();
		w.start();
	}
}