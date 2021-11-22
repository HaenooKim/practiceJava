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
		
		//���� for��, �迭�� List Set�� ��쿡 ����� �� �ִ�.
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