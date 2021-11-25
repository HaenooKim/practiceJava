import java.util.*;

class Table {
	private List<String> dishes = null;
	
	public Table() {
		dishes = new LinkedList<String>();
	}
	
	public void on(String dish) {
		dishes.add(dish);
	}
	
	public String off() {
		int sz = dishes.size();
		if (sz>0) {
			return dishes.remove(sz-1);
		} else {
			return null;
		}
	
	}
}

class ShampooAI extends Thread {
	private Table tbl = null;
	ShampooAI(Table t) {
		this.tbl = t;
	}
	
	public void run() {
		for (int i=0; i<300; i++) {
			String d = "dish" + i;
			
			synchronized(tbl) {
				System.out.println(d+" : on the table");
				tbl.on(d);
			}
		
		}
	}
}

class WashAI extends Thread {
	private Table tbl = null;
	public WashAI(Table t) {
		this.tbl = t;
	}
	
	public void run() {
		for (int i=0; i<300; i++) {
			
			synchronized(tbl) {
				String d = tbl.off();
				System.out.println(d + "off the table");
			}
			
		}
	}

}

public class Test215 {
	public static void main(String[] args) {
		Table table = new Table();
		
		Thread s = new ShampooAI(table);
		Thread w = new WashAI(table);
		
		s.start();
		w.start();
	}
}

/*
	����ȭ��? ���� �����尡 �ϳ��� �ν��Ͻ��� ����ϰ� �� �� �������� ���̴�.(ȭ���)
	�����帶��  �� �ϳ��� �ν��Ͻ� �����ָ� �������� �� �����ݾ�?
	������� �ݰ� �����ϰ�, ȭ��ǵ� �����ϰ�, ��ȣǥ�ý��۵� �����ϰ�..
	�Ϲ������� �� ���� ������ �����带 250�� ���� �����Ѵ�.
*/