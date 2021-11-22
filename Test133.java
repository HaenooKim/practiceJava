import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class CodeVO {
	String code = null;
	String name = null;
	
	CodeVO(String c, String n) {
		code = c;
		name = n;
	}
	
	public String toString() {
		return "[" + code + "]" + name;
	}
	
}


public class Test133 {
	public static void main(String[] args) {
		
		
		String l = "KR ���ѹα�";
		String c = l.substring(0,2);
		String n = l.substring(3);
		System.out.println(c);
		System.out.println(n);
		
		List<CodeVO> lst = new ArrayList<CodeVO> ();
		lst.add(new CodeVO("KR", "���ѹα�"));
		lst.add(new CodeVO("US", "�����߱�"));
		
		Iterator<CodeVO> it = lst.iterator();
		
		while(it.hasNext()) {
			CodeVO t= it.next();
			System.out.println(t.toString());
		}
		
		
	}
}