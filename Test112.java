class A {
	private int value = 0;
	
	public A(int i) {value = i;}
	public int intValue() {return this.value;}
}


public class Test111 {
	public static void main(String[] args) {
		A t = new A(100);
		//int j = (int)t; 에러남. 왜? 자료형 변수끼리는 형변환이 되어도 참조형 변수는 형변환이 안됨.
	
		int j = t.intValue();
		Integer t2 = new Integer(100);
		
		int j = t2; //원래는 말이 안되는 코드지만 컴파일러가 t2.intValue로 코드를 바꾼 후에 컴파일한다.
		//이러한 경우 박스에서 내용물(intValue)만 꺼내쓴다고 하여 Unboxing이라고 한다.
		
		Object t3 = 200; // new Integer(200)으로 컴파일러가 알아서 바꿔준다.
		//int j3 = t3; ->에러남. Object타입형 변수는 언박싱이 안 된다. 
	}
}