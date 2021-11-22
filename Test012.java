public class Test012 {
	public static void main(String[] args) {
		int money = 100;
		int years = 100;
		double rate = 0.066;
		
		double bokri = 0;
		double sum= 0;
		double total = money;
		
	
		for (int i=1; i<=years; i++) {
			bokri = total * rate;
			sum = total + bokri;
			total = total + total*rate;
			System.out.println(sum);
		}
	}
	
	/*
		Q1. 100만원을 100년간 연 이자율 6.6% 복리로 굴렸다.
		100년뒤에 총 얼마나 찾을 수 있을까?
	
		* 복리는 원금에 이자가 붙은 금액에 또 이자가 붙는 것.
	*/
}