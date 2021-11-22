public class Test005 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		i = 100;
		j = i;
		i = i+1;
		
		System.out.println(i);
		System.out.println(j);
		
	}

}

/*
	java는 초기값 없는 변수는 사용 자체가 불가능해서 초기값을 0으로 준다.
	
	int i; i라는 이름으로 int값을 넣을 수 있는 기억공간을 확보한 것임.
	i = j; =은 대입연산이다. 따라서 오른쪽 값을 왼쪽에 넣는 것이다. 
	
	i와 j는 각각 별도의 기억공간에 100이라는 값을 가지게 된다.
	i = i+1; i이름의 기억공간에 있는 값만 증가시킨다.
	
*/