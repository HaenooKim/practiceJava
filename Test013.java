public class Test013 {
	public static void main(String[] args) {
		
		int total  = 100000;
		int in = 0;
		
		
		for (int i=0; i<total; i++) {
			double a = Math.random();
			double b = Math.random();
			double c2 = a*a + b*b;
			
			if (c2>1.0) {
				//System.out.println("out");
			} else {
				//System.out.println("in');
				in++;
			}
		}	

		System.out.println((in * 1.0)/total *4.0);
		
		
		
		
		
	}
}