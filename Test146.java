import java.util.Map;
import java.util.HashMap;

class Spark{
	
}

public class Test146 {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object> ();
		
		Object val = map.get("Spark");
		if(val == null) {
			val = new Spark();
			map.put("Spark", val);
		}
		
		System.out.println(val);
		
		Object val2 = map.get("Spark");
		if (val2 = null) {
			val2 = new Spark();
			map.put("Spark", val2);
		}
		System.out.println(val2);
	}
}