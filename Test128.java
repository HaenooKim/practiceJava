
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class Test128 {
	public static void main(String[] args) {
		//제너릭이 여러개 들어가는 경우도 있음
		Map<String, String> mp  = new TreeMap<String, String>();
		mp.put("apple", "사과"); //이런 쌍을 key, value라고 이야기한다.
		mp.put("banana", "바나나");
		mp.put("orange", "오렌지");
		mp.put("kiwi", "키위");
		mp.put("apple", "사과2");//같은 key를 중복해서 입력하면 앞의 값은 밀어내고 없음.
		
		String val = mp.get("banana");
		System.out.println(val); //보통 키를 이용해서 value값을 얻어냄
		
		Map<Integer, String> mp2 = new HashMap<Integer, String> ();
		
		mp2.put(100, "apple");
		mp2.put(103, "banana");
		
		System.out.println(mp2.get(103));
	}
}

/*
	
	이러한 형태로 저장하는 것을 Map이라고한다.
	
	자바안에는 기본적으로 많이 사용하는 자료구조들이 제공된다.
	크게 3가지의 인터페이스를 상속받아 만들게 된다.
	1. List (ArrayList linkedList) : 순서개념이 있고 중복허용
	2. Set (HashSet TreeSet) : 순서개념이 없고 중복불허
	3. Map(HashMap, TreeMap) : key-value형태, 중복불허
	
	이것들을 자바컬렉션이라고 한다.
 
*/