package banana;

import static banana.Logic.print; //이렇게 적어놓으면 Logic.print()이렇게 안 쓰고 print()로 호출가능

class Logic {
	public static void print() {
		System.out.println("HelloWorld");
		try {
			Thread.sleep(800);
		}
		catch(Exception e) {
			
		}
		
		print();
	}
	
	/*
	print(100);
		System.out.println("HelloWorld" + 100);
			print(99);
				System.out.println("HelloWorld" + 99);
					print(98);
						System.out.println("HelloWorld" + 98);
							print(97);
								...
	
	적절한 종료시점을 만드는 법? 재귀 호출을 그만하는 시점을 만들어줘야 한다.
	
	print(5)
		System.out.println("HelloWorld " + 5);
			print(4);
				System.out.println("HelloWorld " + 4);
					print(3);
						System.out.println("HelloWorld " + 3);
							print(2);
								System.out.println("HelloWorld " + 2);
									print(1);
										System.out.println("HelloWorld " + 1);
											-조건문에 걸림-
									
	
	
	*/
	
	public static void print(int i) {
		System.out.println("HelloWorld " + i);
		
		if (i>0) {
			print(i-1);
		}
		
	}
}

public class Test237 {
	public static void main(String[] args) {
		
		print(5);
	}
}

/*
	위의 코드는 무한반복이다. 위와 같이 함수 안에서 자신을 다시 호출하는 경우를 가리켜
	재귀호출이라고 한다.
	
	마치 바이러스가 증식되는 것 처럼 굉장히 간단한 코드로 큰 일을 해내는데
	적절한 종료시점을 마련하지 않으면 무한반복하게 되어있다.
*/