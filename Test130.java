
import java.io.BufferedReader;
import java.io.InputStreamReader; 

public class Test130{
	public static void main(String[] args) throws Exception {
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		String l = null;
		
		while ( (l = bin.readLine()) != null ) {
			if(l.equals("quit")) {
				break;
			} else {
				System.out.println(": " + l);
			}
		}
		
		/*
		while(true) {
			String l = bin.readLine();
			
			if (l.equals("quit")) {
				break;
			}
			System.out.println(l);
		}
		
		*/
		
		
		bin.close();
	}
}

/*
	readLine : �ܼ�â���� �Է��ϰ� ���ʹ����� �Ǹ� ������ ���ڿ��� �����Ѵ�.
*/