
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Test132 {
	public static void main(String[] agrs) {
		List<String> lst = new ArrayList<String> ();
		lst.add("apple");
		lst.add("banana");
		lst.add("ornage");
		lst.add("kiwi");
		
		
		/*앞에서부터 지우면 다 지워지지 않는다.
		for (int i=0; i<lst.size(); i++) {
			lst.remove(i);
		} 
		*/
		
		Iterator<String> it = lst.iterator();
		
		while(it.hasNext()) {
			String t = it.next(); //끄집어냄
			
			if (t.indexOf("an")!=-1) {
				it.remove(); //it.next() 했을 때 튀어나올 그넘을 지워준다.
			}
			
		
		}
		
		for (int i=0; i<lst.size(); i++) {
			String t = lst.get(i);
			System.out.println(t);
		}
		
	}
	
}