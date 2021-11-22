public class Test014 {
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		int money = 100;
		int years = 100;
		double rate = 0.066;
		double total = money;
		
		for (int i=0; i<years; i++) {
			total = total + total*rate;
		}
		System.out.println(total);
	}
}