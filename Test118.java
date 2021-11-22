class A {
}

interface ITemp<X> {
	public X getData();
}

public class Test118 {
	public static void main(String[] args) {
	
		/*
			A t = new B();
			new ITemp<Integer>(){...} : ITemp<Integer>를 상속받으며 만든 무명의 클래스의 인스턴스 생성
			ITemp<Integer>를 상속받았으니 조성에서 선언된 메소드를 오버라이딩 해 줘야하고 제너릭엔 Integer public X getData();
			X에는 Integer가 들어가야한다.
			오토박싱 고려하면 return 100을 해도 문법에는 이상이 없다.
		*/
		
		ITemp<Integer> it = new ITemp<Integer>() {
			public Integer getData(){return 100;}
		};
		
		int j = it.getData();
		System.out.println(j);
		
	}
}


/*
	new A() {}
		{}안에는 변수선언과 함수선언이 가능하다. 그럼 클래스인가? 맞다. 클래스다.
		인스턴스를 만들고 있는 상황인가? 맞다.
		
		A클래스를 상속받는 이름없는 클래스를 선언하면서 동시에 인스턴스를 생성하고 있음.
		- 조상으로부터 상속받으면서 클래스를 선언하는데 이름이 없다-> 이름이 없으니 재사용 불가
		한번만 써먹고 말거니까 이름필요없다. -> anonymous class
*/