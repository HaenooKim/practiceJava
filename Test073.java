
class 시고르자브 {
	int 위장;
}



public class Test073 {
	public static void main(String[] args) {
		시고르자브 mary = new 시고르자브(); //밥줄 하나
		시고르자브 zzong = mary; //밥줄 둘
		시고르자브 happy = mary; //밥줄 셋
		
		mary.위장 = mary.위장 + 200;
		zzong.위장 += 200;
		happy.위장 += 200;
		
		System.out.println(mary.위장);
		
		mary = null; //밥줄하나 끊김 : 2개 남음
		zzong = null; //밥줄 하나 더 끊김 : 1개 남음
		happy = null; //밥줄 다 끊김 : 유기견 됨 -> 자신을 가리키는 포인터가 0개가 되는 순간.
		//그 시점에서 Garbage Collector(개장수) 가 메모리를 회수한다.
		//C는 free 호출시 곧바로 메모리를 회수하는데 여기는 메모리가 부족할 때 한꺼번에 회수한다.
		
		//C에서는 free해야 할 때 안 해서 숱하게 에러를 만들어서 아예 없애버리고 대체수단을 만듦.
		//-> 이것을 Garbage Collection이라고 한다.
		//java에선 free해줄 필요가 없다. 다만 회수하게 만들 수는 있다. ->밥줄을 끊으면 됨(null)
		//위 코드에서 null을 대입 안 해줘도 로컬변수는 자동으로 없어지고 밥줄은 끊긴다.
	}
}


/*
	가비지 콜렉션 : C에서 free()를 대신하는 역할
	모든 참조형변수(포인터)에는 null 값을 대입할 수 있다. -> 아무것도 가리키지 않는다.
*/