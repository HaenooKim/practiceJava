public class Test003 {
	public static void main(String[] agrs) {
		int i = 100;
		i = i+1;
		System.out.println(i);
	}
}

/*
	프로그래밍에서 기억공간을 확보하는 방법?
	1. 변수 선언
	- 변수는 하나의 기억공간이며 변수를 만드는 것을 변수선언이라고 한다. 변수선언을 할 때는
	이름을 이용하고 변수의 자료형으로는 여러가지가 있는데 대표적으로 정수형인 int와
	실수형인 double이 존재한다. 이퀄은 대입연산자라고 불리며 오른쪽의 값을 왼쪽 변수에 넣는
	형태로 동작한다.
	
	- 이름을 이용하게 된다. 
	- 위의 코드에서 i가 이름이다. int는 자료형이다. 
	- 대부분 프로그래밍 언어에는 자료형이 존재한다. (자바스크립트는 아님)
	- int 자료형은 이걸로 선언된 변수는 정수값만을 저장할 수 있는 기억공간으로 확보된다.
	- 이퀄은 '대입연산자'라고 불린다.
	- "오른쪽의 값을 왼쪽의 변수에 넣는 형태로 동작한다."
	- i라는 이름으로 새로이 확보된 int 형 기억공간의 내부에 100을 넣는 형태로 동작.
	
	- 변수가 가진 값을 사용하고자 할 때는 이름을 이용한다.
		System.out.prinln(i) ; 
		- i 라는 이름으로 선언된 변수가 가지고 있는 값을 출력한다.
	
	i = i + 1
	쉽게 얘기하면 =의 오른쪽이 먼저 동작한다.
	i라는 이름의 변수가 가진 값과 1이 덧셈연산된다.
	i = 101; 이렇게 됨.
	i 라는 이름의 기억공간에 101이라는 int값이 대입된다.
	
	변수는 모든 역사를 담고 있을까? 아니면 최종값만? =>최종값만 담고있다.
	
	
	2. malloc (C) 또는 new (C++, java)
	- 이름을 이용하지 않는다. 다만 포인터를 이용할 수 있다. 
	
	
*/