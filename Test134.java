import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class CodeVO {
	String code = null;
	String country = null;
	
	CodeVO(String code, String country) {
		this.code = code;
		this.country = country;
	}
	
	public String toString() {
		return "코드 : " + this.code + " 나라명 : " + this.country;
	}
}

public class Test134 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader bin = new BufferedReader( new InputStreamReader( System.in ) );
		
		List<CodeVO> lst  = new LinkedList<CodeVO> ();
		
		while(true) {
			String l = bin.readLine();
			if (l.equals("quit")) {
				break;
			} 
			
			else if(l.startsWith("AD")) { //추가
				String c = l.substring(3, 5);
				String n = l.substring(6);
				lst.add(new CodeVO(c, n));
			} 
			
			else if (l.equals("PA")) { //출력
				Iterator<CodeVO> it = lst.iterator();
				while (it.hasNext()) {
					CodeVO t = it.next();
					System.out.println(t.toString());
				}
			} 
			
			else if (l.startsWith("DL")) { // 삭제
				String word = l.substring(3);
				Iterator<CodeVO> it = lst.iterator();
				while(it.hasNext()) {
					CodeVO t = it.next();
					if (t.code.indexOf(word) != -1) {
						it.remove();
					}
				}
				
			}
 					
		}
	}
}