
class Sample {
	int i = 0;
	// i = 1000; -> 클래스 내에선 대입이나 연산이 불가능.
	
	int add(int i, int j) {
		return 100;
	}
}
// 클래스를 만들고 그 안에 변수와 함수를 선언하는 것만 가능.



public class Test061 {
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}



/*
public class? class인데 public 한 것.
과연 class가 뭐지?
class는 실은 구조체이다. 

- class는 이름이 붙는다.
- class는 변수를 선언할 수 있다. 하지만 대입이나 연산을 수행할 수 없다.
- class 안에서는 함수를 선언할 수 있다. 하지만 함수 호출은 불가능하다.
*/