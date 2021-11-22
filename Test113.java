class Temp {
	public void print(String... p) {
		System.out.println(p.length);
	}
	
	//정말 무식한 함수선언법임. 어떤 매개변수도 다 통과된다.
	public void print2(Object... p) {
		
	}
}


public class Test113 {
	public static void main(String[] args) {
		Temp t = new Temp();
		t.print();
		t.print("apple");
		t.print("apple", "banana");
		t.print("apple", "banana", "orange");
		
		t.print2(100, 3.14);
		
		t.print2(100, 3.14, "HelloWorld", null); //다 들어가짐 ㅋㅋ
	}
}

/*
String... p : 가변길이 파라메터라고 한다. 정체는 배열이다.
*/