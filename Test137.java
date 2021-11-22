class Temp {
	
	
	/*
		static initializer라고 한다. 이영역은 인스턴스 생성이전에 딱 한번만 호출된다.
		->즉, 클래스가 메모리에 로딩되는 시점에 호출된다.
		
		C언어로 만든 .exe파일은 독자적으로 실행이 가능하지만 .class는 독자적으로 실행이 불가능함.
		.class 파일은 JRE(자바 실행환경  - JVM java virtual machin)이 있어야 실행가능.
		
		C언어로 만든 exe는 다른 OS에서 실행불가능하다.
		하지만 JAVA로 만든 class는 jvm이 깔려있다면 어느 환경에서도 곧바로 실행이 가능함!!
		
		그럼 JVM만 깔려있다면 굳이 컴퓨터가 아니더라도 동작이 가능할까?
		->가능하다. 원래 자바는 각종 전자기기에 탑재될 목적으로 만들었다.
		
		Q. 지금 이 파일을 컴파일하면 클래스 파일이 몇 개 생길까?
		->2개
		Q. 실행할 때는 java Test137 이렇게 한다. 처음 실행 시에 Temp.class도 쓸까?
		-> 안 쓴다. 처음에는 Test137.class만 쓴다. 실행하다 보니 new Temp();
		이 시점에서 Temp.class 파일이 필요해짐.
		
		new Temp()를 만나면 Temp.class가 필요해지고 이 때 Temp.class는 메모리에 로딩되어야 한다.
		이 시점에서 static initializer가 호출된다.
		만일 JVM이 한번 로딩된 CLASS는 별 문제 없다면 메모리에 유지하는 정책을 쓴다면?
		인스턴스를 아무리 많이 만들어도 클래스는 딱 한번만 인스턴스 생성이전에 로딩된다.
		인스턴스를 만들 때 멤버변수와 멤버함수를 가리키는 함수포인터는 메모리를 할당받게 된다.
		즉 클래스가 로딩되는 시점에는 멤버함수 멤버변수 호출이 불가능함.(존재하지 않기 때문)
	*/
	
	
	static { // 이건 코드를 실행할 수 있는 영역이라고 이해할 것.
		System.out.println("static");
	}
	
	Temp() {
		System.out.println("생성");
	}
}

public class Test137 {
	public static void main(String[] args) {
		new Temp();
		new Temp();
		new Temp();
	}
}