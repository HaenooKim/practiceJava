
class TempVO {
	public int data = 100;
	
	public int getData() {
		return data;
	}
}

class Temp2VO extends TempVO{
	public int data = 200;
	
	public int getData() {
		return data;
	}
}

public class Test292 {
	public static void main(String[] args) {
		TempVO t = new Temp2VO();
		System.out.println(t.data);
		System.out.println(t.getData());
		//변수는 조상? 함수는 자손? 에반데...
		
		Temp2VO t2 = (Temp2VO) t;
		System.out.println(t2.data);
		//거기에 캐스팅 하고나니 값이 변하네?? 에반데...
		
		/*
			-> 멤버변수는 절대로 public하게 접근하도록 하지 않는다 라는 불문율이 있음.
			해서 멤버변수는 private/protected하게 선언해서 직접 접근하지 못하도록 한다.
			
			그럼 어떻게 값을 읽고쓰냐? getter함수를 써서 읽고, setter함수를 써서 쓴다.
			
			privaet int data = 0;
			public int getData(){return this.data;} //getter
			public void setData(int i){this.data = i;} //setter
			
			getter는 get+멤버변수명(첫글자는 대문자로) + 변수와 같은 자료형의 리턴타입 + 매개변수 없음
			setter는 set+멤버변수명(첫글자는 대문자로) + void 리턴타입 + 매개변수는 변수와 같은 자료형의 타입
			
			DTO : Data Transfer Object
			VO : Value Object
			- 두 용어 다 데이터를 담는 용도로 사용한다는 의미를 담고 있다.
			- VO에서는 int말고 Integer를 사용한다. 
			그 이유는 db에 int형 필드에도 null값이 들어갈 수 있는데 이것을 받으려면 Int는 불가능!
			ex) int r = null; 불가능
			    Integer r = null; 가능
				
			따라서 db와 연동되는 VO에는 int, double 안쓰고 , Integer, Double을 사용하는 것을 기본으로 한다.
			
		*/
	}
}

/*
*/