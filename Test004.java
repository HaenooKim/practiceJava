public class Test004 {
	public static void main(String[] args) {
		int i, j;
		
		i = 100;
		j = 100;

		i = i+1;
		System.out.println(i);
		System.out.println(j);
		
	}
}

/* 
	int i, j;
	- Q. 이 코드는 하나의 기억공간에 두개의 이름이 있는 것일까,
	아니면 각각의 이름의 별개의 기억공간이 있는 것일까?
	- A. 다른 기억공간이다.
	
	"하나의 이름에 두 개의 이름이 주어지는 경우는 모든 언어가 지원하지 않는다."
	- C++의 레퍼런스 개념이 유사하지만 실은 그거 안 써도 된다.
	
	"의문이 있으면 그걸 해결할 수 있는 코드 정도는 짤 수 있어야 한다."
*/