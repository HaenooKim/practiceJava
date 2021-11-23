public class Test008 {
	public static void main(String[] args) {
		System.out.println(10.0 + 10.0);
		System.out.println(10+10.0);
		
		System.out.println(10.0/3.0);
		System.out.println(10/3);
		
	}

}


/*
실수의 대표는 double이고 정수의 대표는 int이다.

double + double = double
int + int = int

실수형 변수는 정확한 값이 아니라 컴퓨터가 표현가능한 근사치를 넣은 것이다.
따라서 10 / 3의 값이 3.3333333333333335 라는 값이 나온다.

따라서 실수를 계산할 때는 정확하게 일치하는 값을 비교하는 것은 오동작을 유발할 가능성이 있따.

(10.0 / 3.0) == 3.33333는 오동작 가능성이 있다.

int / int = int ; 
컴퓨터는 기본적으로 같은 타입의 자료형끼리 연산한다.
int * int = int
int - int = int
double / double = double


*/