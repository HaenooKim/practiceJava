class Temp {
	int data = 0;
	
	Temp(int i) {
		data = i;
	}
	
	public boolean equals(Object b) {
		if (b == null || b instanceof Temp == false) {
			return false;
		}
		
		
		Temp t = (Temp)b;
		if (this.data == t.data)
			//b.data는 왜 안되지? this.data는 왜 되는지?
			return true;
		else
			return false;
	}
}


public class Test098 {
	public static void main(String[] args) {
		Temp t = new Temp(100);
		Temp l = new Temp(100);
		System.out.println(t==l); //false가 나옴.
		//왜냐? 포인터의 비교는 같은 대상을 가리킬 때 true가 나온다.
		//Temp t = new Temp(100); Temp l = t; 를 하면 true가 나온다.
		//내용물은 보지 않음. 같은 대상을 가리켜야 함!
		
		
	
		System.out.println(t.data == l.data); //되긴 되는데 객체지향적이진 않음.
		
		
		Object t2 = new Temp(200);
		Object l2 = new Temp(200);
		System.out.println(t2 == l2); 
		//System.out.println(t2.data == l2.data) 에러닌다: data는 자손클래스에서 추가된 변수이므로 접근이 안됨.
		
		
		//equals 의 정체는?
		boolean b = t2.equals(l2);
		System.out.println(b);
	}
}

/*

*/