package banana;

import java.lang.reflect.Method;

class Temp {
	public void print(int i, int j) {
		System.out.println("Apple");
	}
}


public class Test150 {
	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("banana.Temp");
		Object obj = cls.newInstance();
		
		Method[] mtds = cls.getMethods();
		
		//향상된 for문, 배열과 List Set의 경우에 사용할 수 있다.
		for(Method mtd : mtds) {
			System.out.println(mtd.getName());
			

			if("print".equals(mtd.getName())) {
				Class<?>[] temp = mtd.getParameterTypes();
				for(Class<?> t : temp) {
					System.out.println(t);
				}
			}

		}
	}
}