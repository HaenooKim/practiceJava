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
}

class WashAI extends Thread {
	private Table tbl = null;
	public WashAI(Table t) {
		this.tbl = t;
	}

}

public class Test214 {
	public static void main(String[] args) {
		Table table = new Table();
		
		Thread s = new ShampooAI(table);
		Thread w = new WashAI(table);
		
		table.on("apple");
		table.on("banana");
		table.on("orange");
		
		for(int i=0; i<4; i++) {
			System.out.println(table.off());
		}
	}
}

/*
	����ȭ��? ���� �����尡 �ϳ��� �ν��Ͻ��� ����ϰ� �� �� �������� ���̴�.(ȭ���)
	�����帶��  �� �ϳ��� �ν��Ͻ� �����ָ� �������� �� �����ݾ�?
	������� �ݰ� �����ϰ�, ȭ��ǵ� �����ϰ�, ��ȣǥ�ý��۵� �����ϰ�..
	�Ϲ������� �� ���� ������ �����带 250�� ���� �����Ѵ�.
*/