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
	동기화는? 여러 쓰레드가 하나의 인스턴스를 사용하게 될 때 벌어지는 일이다.(화장실)
	쓰레드마다  다 하나씩 인스턴스 나눠주면 저런일이 안 생기잖아?
	은행원은 금고도 공유하고, 화장실도 공유하고, 번호표시스템도 공유하고..
	일반적으로 웹 서버 돌릴때 쓰레드를 250개 정도 세팅한다.
*/