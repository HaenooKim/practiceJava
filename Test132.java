
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
		
		
		/*�տ������� ����� �� �������� �ʴ´�.
		for (int i=0; i<lst.size(); i++) {
			lst.remove(i);
		} 
		*/
		
		Iterator<String> it = lst.iterator();
		
		while(it.hasNext()) {
			String t = it.next(); //�����
			
			if (t.indexOf("an")!=-1) {
				it.remove(); //it.next() ���� �� Ƣ��� �׳��� �����ش�.
			}
			
		
		}
		
		for (int i=0; i<lst.size(); i++) {
			String t = lst.get(i);
			System.out.println(t);
		}
		
	}
	
}