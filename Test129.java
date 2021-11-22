import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test129 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		
		long time = System.currentTimeMillis();
		for (int i=0; i<100000; i++) {
			lst.add("apple"+i);
		}
		
		while(lst.isEmpty() == false) {
			lst.remove(0);
		}
		
		time = System.currentTimeMillis() - time;
		
		System.out.println(time);
		
	}
}


/*
	ArrayList : ���忡 �迭�� �̿��Ѵ�. �׳� �׾Ƴ��⿡ �ӵ��� �ξ� ������.
	������ ���߿� ������ �Ͼ�� �� ������尡 ũ��.
	
	ListNode : ���忡 Node�� �̿��Ѵ�. ���ۼӵ��� �������̴�. �߰� ������ �Ͼ�� ��
	�δ��� ����.
	
	
	* �߰��� ������ ����� �Ͼ�� LinkedList, �׷����� ���� �� �׾Ҵٰ� Ǯ��� arrayList
	
	System.currentTimeMillis() : ������ �ð��� long������ ������ �и������������ ����� ���ִ� �Լ�
	
	�̰ɷ� �ð��� �纸�� arraylist�� �� ������ �� �� ����.
	
	ArrayList : �迭�� �̿��Ѵ�. ���ڶ�� ���� ������ 2�踦 �����Ͽ� �̻簣��. 
	�ܼ� �ױ�� �迭�� ���� �������� ���� ������ �Ͼ�� ����ִ� �ڸ��� �ڿ��� ���ܿ´�. �׷���
	���߻����� �ϸ� �ð��� �����ɸ���.
	
	LinkedList �� ���߻����� �Ͼ�� ������ �ϳ��� �ٲٰ� Node�ϳ��� �����ϸ� �ȴ�.
	
	
*/