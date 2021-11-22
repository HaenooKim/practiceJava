
import java.util.List; //다른 패키지에 있는 클래스를 가져다 쓸 때 import를 쓴다.
import java.util.LinkedList;
import java.util.Iterator;

import java.util.ArrayList;


/*
	List : 인터페이스
	LinkedList ; List를 상속받아 사용
	List를 상속받아 만들어진 클래스들의 특징
	- add (T t)를 이용하여 넣는다.
	- int size()로 갯수를 센다.
	- T get(int i)로 특정 순서 요소의 포인터를 얻는다.
	- Iterator로 순차탐색을 진행한다.
	- "넣은 순서를 유지하는 형태로 자료를 보관한다."
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
		
		// 위쪽이 이해하기는 좋지만 java에서 제공하는 하나씩 꺼내보는 표준방법은 아래다.
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			String t = it.next();
			System.out.println(t);
		}
	}
}


/*
기본적인 자료구조는 java에서 제공한다. (트리나 그래프는 제공안함)
그것들은 제너릭기반으로 되어있음.
*/