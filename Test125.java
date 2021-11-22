
import java.util.List; //�ٸ� ��Ű���� �ִ� Ŭ������ ������ �� �� import�� ����.
import java.util.LinkedList;
import java.util.Iterator;

import java.util.ArrayList;


/*
	List : �������̽�
	LinkedList ; List�� ��ӹ޾� ���
	List�� ��ӹ޾� ������� Ŭ�������� Ư¡
	- add (T t)�� �̿��Ͽ� �ִ´�.
	- int size()�� ������ ����.
	- T get(int i)�� Ư�� ���� ����� �����͸� ��´�.
	- Iterator�� ����Ž���� �����Ѵ�.
	- "���� ������ �����ϴ� ���·� �ڷḦ �����Ѵ�."
*/


public class Test125 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("apple");
		l.add("bananan");
		l.add("orange");
		l.add("kiwi");
		
		System.out.println(l.size());
		
		for(int i= 0; i< l.size(); i++) {
			String t = l.get(i);
			System.out.println(t);
		}
		
		// ������ �����ϱ�� ������ java���� �����ϴ� �ϳ��� �������� ǥ�ع���� �Ʒ���.
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			String t = it.next();
			System.out.println(t);
		}
	}
}


/*
�⺻���� �ڷᱸ���� java���� �����Ѵ�. (Ʈ���� �׷����� ��������)
�װ͵��� ���ʸ�������� �Ǿ�����.
*/