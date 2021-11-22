import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.HashSet;

public class Test126 {
	public static void main(String[] args) {
		Set<String> l = new HashSet<String>();
		l.add("apple");
		l.add("banana");
		l.add("orange");
		l.add("kiwi");
		System.out.println(l.size());
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			String t = it.next();
			System.out.println(t);
		}
	}
}

/*
	import의 대상은? 클래스임. 패키지가 아님.
	
	Set 인터페이스에는 System.out.println(l.get(0))에서 에러가 남. (지원안하기 때문)
	
	Set은 순서개념이 없다. -> 그래서 get이 없음.
	하지만 리스트보다 더 빠른 검색과 효울적인 보관을 제공.
	
	TreeSet은 내부적으로 2진트리를 써서 보관한다. -이진트리는 중복을 허용하지 않음.
	
	HashSet과 TreeSet은 둘다 Set인터페이스를 상속하므로 호환성을 지닌다.
	
	HashSet은 내부적으로 해쉬 알고리즘을 써서 보관한다.
	
	보관방법은 TreeSet과 다르지만 사용함수는 같다.
*/