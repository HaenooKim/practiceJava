import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class Test131 {
	public static void main(String[] args) throws Exception{
		List<String> lst = new LinkedList<String>();
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String str = bin.readLine();
			
			if(str.equals("quit")) {
				break;
			} else if (str.substring(0, 2).equals("AD")) {
				String fruit = str.substring(3);
				//System.out.println(str.substring(3));
				lst.add(fruit);
			} else if (str.equals("PA")) {
				Iterator<String> it = lst.iterator();
				
				while (it.hasNext()) {
					String fruit = it.next();
					System.out.println(fruit);
				}
			} else if (str.substring(0, 2).equals("PR")) {
				String word = str.substring(3);
				for (int i=0; i<lst.size(); i++) {
					if (lst.get(i).indexOf(word)!=-1) {
						System.out.println(lst.get(i));
					}
				}
				
			} else if(str.substring(0, 2).equals("DL")) {
				String word = str.substring(3);
				Iterator<String> it = lst.iterator();
				
				while(it.hasNext()) {
					String t = it.next();
					if (t.indexOf(word)!=-1) {
						it.remove();
					}
				}
				
			}
		}
		bin.close();
	}
}