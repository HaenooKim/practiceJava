/*
	java는 명시하지 않으면 extends Object를 자동으로 붙인다.
	Object는 모든 클래스의 조상이 된다.
	
	그럼 Object 타입의 변수는 모든 인스턴스를 가리킬 수 있다? 맞는 얘기.
	void *랑 같은 개념인가? 그건 아님.
	
	toString()은 뭐다? Object에서 상속받았다.
	인스턴스에 관련된 걸 간단한 문자열로 정보를 보고 싶을 때 toString을 애용한다.
*/



class Temp {
	public String toString() {
		return "Hello World";
	}
}


public class Test097 {
	public static void main(String[] args) {
		Object t = new Temp();
		System.out.println(t.toString());
	}
}