class A{}
class B{}


//대를 거쳐가며 상속받는 것은 다중상속이 아니다.
class D extends A{}
class E extends D{}

interface IA {}
interface IB {}

interface IC extends IA, IB {} // 다중상속 가능
class F implements IA, IB{}
class G extends B implements IA, IB{}


public class Test107 {
	public static void main(String[] args) {
		
	}
}




/*
인터페이스는 다중상속을 지원한다.
class C extends A, B{} : 2개 이상의 클래스로 부터 상속받는것은 자바에서 블가능하다.
하지만 인터페이스는 가능.
인터페이스는 다중상속 가능해도 선언되었지 정의되어있지 않기에 함수포인터가
동시에 두개의 함수선언을 가르키는 일은 발생하지 않는다.

인터페이스의 용도는 abstract class와 많이 다르다. 인터페이스는 클래스간의 호환성을 만드는 용도이다.
*/