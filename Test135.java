import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Test135 {
	public static void main(String[] args) throws Exception{
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		List<String> lst = new LinkedList<String> ();
		
		while (true) {
			String l = bin.readLine();
			
			if (l.equals("quit")) {
				break;
			}
			
			else if (l.startsWith("AD")) {
				String fruit = l.substring(3);
				lst.add(fruit);
			}
			
			else if (l.equals("PA")) {
				Iterator<String> it = lst.iterator();
				
				while(it.hasNext()) {
					String fruit = it.next();
					System.out.println(fruit);
				}
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
	}
}