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
		Q1. 100������ 100�Ⱓ �� ������ 6.6% ������ ���ȴ�.
		100��ڿ� �� �󸶳� ã�� �� ������?
	
		* ������ ���ݿ� ���ڰ� ���� �ݾ׿� �� ���ڰ� �ٴ� ��.
	*/
}