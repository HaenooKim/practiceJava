interface ITemp<X> {
	public X getData();
}

public class Test119 {
	public static void main(String[] args) {
		int t = 200;
		
		ITemp<Integer> it = new ITemp<Integer>() {
			public Integer getData() {
				//t=t+1; -> 에러남 값 변경 불가.
				return t;
			}
		};
		
		int j = it.getData();
		System.out.println(j);
		
		
	}
}


/*
	로컬변수를 만일 anonymous class가 사용하고 있다면
	해당 인스턴스가 가비지 컬렉션이 되지 않는 한에서는 로컬변수는 함수호출이 끝나도 없어지면 안된다는 얘기.
	 anonymous 클래스가 사용중인 로컬변수는 값을 변경해서는 안된다.
*/