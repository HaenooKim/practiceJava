class A {
	private int drug = 0;
	protected int vijaguem = 1;
	public int budongsan = 2;
	
	private void picnic() {
		System.out.println(this.drug); // 가능
		System.out.println(this.vijaguem); // 가능
		System.out.println(this.budongsan); // 가능
		//접근 지정자(public , private, proteted)와 상관없이 내 재산은 얼마든지 접근가능.
	}
}

class B extends A {
	void print() {
		// 에러 : 접근불가 System.out.println(this.drug);
		System.out.println(this.vijaguem); // 접근 가능
		System.out.println(this.budongsan); // 접근 가능
	}
}


public class Test100 {
	public static void main(String[] args) {
		
		A t = new A();
		System.out.println(t.budongsan);
		// 에러 : System.out.println(t.drug);
		
		//proteted는 c++ 등에서는 접근안됨. 하지만 java에서 패키지 개념때문에 가능할 수 닝ㅆ다.
		// 같은 패키지에 속한 클래스는 proteted 멤버에 접근가능.
		// 다른 패키지에 속한 클래스는 proteted 멤버에 접근할 수 없다.
		System.out.println(t.vijaguem);
	}
}


/*

	private protected public : 멤버 (함수, 변수) 앞에 붙는다.
	'클래스의 재산은 멤버함수와 멤버변수다.'
	은닉성과 관련된 키워드들임.
	
	재산 정리 3가지
	1. 무덤까지 가져갈 거(공개x 상속x) - Private
	2. 물려주기만 할 거(공개x, 상속o) - protected
	3. 공개하고 물려주기도 할 거(공개O, 상속O) - public
	"멤버 변수 함수 앞에 붙어서 위에 언급한 것과 같은 접근성을 가진다."
	
*/