
/* 
	함수와 서브루틴에 대해서!
	함수는 입력에 대한 출력이 있어야 하고 서브루틴은 호출은 되는데 리턴되는 것이 없다.
	서브루틴을 선언하고 void를 뺀다.
	매개변수는 적당히.
	->"생성자"
	생성자 함수는 참조형 변수 선언시에는 호출되지 않는다. ->인스턴스가 생성되는 시점에 생성된다.
	생성자 함수는 참조형 변수로 호출불가능 ex) Temp t= new Temp(100); t.Temp(100); 불가능.
	
	클래스 안에서 변수를 선언할 수 있고 함수를 선언할 수 있다.
	클래스 안에서 선언된 변수: 멤버변수 또는 프러퍼티(property) 라고함.
	클래스 안에서 선언된 함수 : 멤버함수 또는 메서드
	
	생성자 함수를 호출할 수 있는 함수포인터는 인스턴스 안에 없다. 즉 생성자함수는 멤버함수가 아니다.
	생성자 안에서 this라는 포인터를 사용할 수 있고, 멤버변수를 초기화시키는 역할을 한다.
*/

class Temp {
	Temp(int i) { 
		System.out.println("Temp" + this.data);
		this.data = i;
	}
	
	int data = 100;
	
	int add( int i, int j) {
		return 300;
	}
}


public class Test071 {
	public static void main(String[] args) {
		Temp t = new Temp(100);
		//t.Temp(100); -> 불가능
		
		t.data = t.add(0, 0);
		System.out.println(t.data);
	}
}