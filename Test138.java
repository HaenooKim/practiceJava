class Temp {
	static void print2() {
		//print(); --> 에러남
		//외울것!! "static안에서는 non-static를 직접 못쓴다."
		Temp t = new Temp(); //이건 직접쓰는 게 아니라 가능함.
		t.print();
	}
	
	void print() {
		print2();
	}
}

interface ITemp {
	// public static void print(); ->에러남
	
	/*이건 오버라이딩을 전제로 하는 함수이어야 하고
	오버라이딩은 함수포언터 형태로 운용되어야 하고
	그러러면 인스턴스에 함수포인터가 있어야 하고
	그러면 non-static해야한다.
	
	인터페이스 안에서는 non-static한 메소드를 쓴다.!!
	*/
}

public class Test138 {
	public static void main(String[] args) {
		
	}
}


/*
non-static method print() cannot be referenced from a static context
--static이 언급된 멤버변수와 함수가 생성되는 시점은 class 로딩시.
이때는 non-static한 멤버는 존재하기 전이다.
*/