public class Test021 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println("Apple" + i);
			if (i == 3) {
				System.out.println("Kiwi");
				break;
			}
			System.out.println("Banana" + i);
			
		}
	}
}


/*
	문자열의 뒤에 이어붙일때는 +기호를 쓴다.
	= 대입 : 변수에 값을 넣을 때
	== 비교 : 두 개의 값을 비교할 때
	
	for 문은 위의 경우 i<5 가 false일 때 빠져나간다.
	헌데 for 안에서 break를 만나면 이것과 상관없이 빠져나간다.
	
	for( [1] ; [2] ; [3] ) {
		[4];		
	}
	
	[1] - [2] - [4] - [3] - [2] - [4] - [3] - [2] ...
	[4] 영역 안에서 continue 를 만나면 곧바로 [3] 으로 간다. ( [4] 영역의 이하 코드를 건너서 [3] )
	[4] 영역에는 여러줄 코드가 올 수 있다 ( 당연 )

*/