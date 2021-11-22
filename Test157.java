public class Test157 {
	public static void main(String[] args) {
		String t = "HelloWorld";
		String r = "HelloWorld";
		
		System.out.println(r==t); //true
		
		String l = t.substring(2, 5);
		System.out.println(l); //llo
		
		System.out.println(r); //helloWorld  (llo아님)
		
	}
}

/*
포인터의 비교는 같은 인스턴스를 가리킬때 true가 나온다. (내용이 같을때가 아님. 그땐 equals를 써야한다.)

substring이 가리키는 문자열의 내용을 변경하는 형태면 llo ->이런일이 벌어지면 안됨.
substringd이 새로운 문자열을 만들어내는 형태면 helloWorld출력

재사용되는 인스턴스는 함부로 내용을 바꾸면 지금 누가 쓰고 있는데 갑자기 내용이 변할 수 있기에
함부로 변경하면 안 된다.
-> String의 모든 멤버함수는 내용을 바꾸지않고 새로운 문자열을 만드는 형태로 동작한다.
*/