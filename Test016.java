public class Test016 {
	public static void main(String[] args) {
		boolean i = true;
		int j = 100;
		
		if (j > 10) {
			System.out.println("Apple");
			
		} else {
			System.out.println("Banana");
		}
		
		if (i) {
			System.out.println("Orange");
		}
		
		j = 6;
		
		if (j>10) {
			System.out.println("Apple2");
		} else if {
			System.out.println("Kiwi");
		} else {
			System.out.println("Banna2");
		}
		
		
		
	}
}


/*
	boolean 값은 다른 자료형의 값으로 형변환이 불가능하다.
	
	if( .. ) 의 ..안에는 반드시 boolean 값만 와야한다.
	
	if (j)는 에러가 나지만 if(j>10)은 안 난다.
*/