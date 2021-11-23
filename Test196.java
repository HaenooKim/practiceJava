/*
	00001010 : 10
	00010100 : 10 << 1 -> 20 (16+4)
	00101000 : 10 << 2 -> 40 (32+8)
	
	한 번 왼쪽으로 밀때마다 *2효과가 나온다.

*/



public class Test196 {
	public static void main(String[] args) {
		int i=10; 
		System.out.println(i<<2);
		System.out.println(i>>2);
	}
}


/*
 >> << >>> : 쉬프트 오퍼레이터 (이진수의 비트정보를 밀어주는 식으로 동작한다.)
  0000 1010
*/