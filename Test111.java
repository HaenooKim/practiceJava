public class Test111 {
	public static void main(String[] args) {
		Object t = 100; //t는 인스턴스를 가리키기 위한 용도의 참조형 변수.
		
		System.out.println(t.getClass().getName()); //t가 가리키는 인스턴스를 생성한 클래스명
		//Object t = 100이런 코드가 보여지면 컴파일러는 Object t = new Integer(100); 이렇게 바꿔준다.
		
		Integer t2 = new Integer(200);
		Integer t3 = t2; // 이처럼 Integer 형 변수를 int 변수에 대입할 때
						// 컴파일러는 자동으로 t3.intValue()를 호출하게 된다. 이런 것을 unboxing이라고 함.
		
		int j = t3;
		System.out.println(j);
		
		int k = t; //(Integer 형 참조형 변수는 Unboxing되지만 Object형 변수는 Unboixing 안 된다.)
	}
}

/*
	java는 int*, double*같은 거 없다. - 자료형변수의 기억공간에 대한 포인터 개념이 아예없다.
	그 대안으로 제시한 것이 Wrapper class이다. 
	
	Wrapper Class는 포인터를 대신할 수 있을 정더로 가볍고 메모리소비가 적은 형태로 구현되어 있다.
	Object t = 100; 이러한 코드에서 자동으로 new Integer(100)을 씌워주는 것을 Auto Boxing이라고 한다.
	
	int - Integer
	double - Double
	float - Float
	char - Character
	boolean - Boolean
*/