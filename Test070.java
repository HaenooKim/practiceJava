
class Temp {
	
	//리턴 타입이 없고 클래스 이름과 같은 함수: Constructor(생성자함수)라고 한다.
	// 주 역할은 클래스 안에서 선언된 변수의 초기화
	Temp(int i) { //이건 new Temp()할 때 호출됨
		this.data=i;
	}
	
	int data = 100;
	int add(int i) {
		return this.data + i;
	}
}


public class Test070 {
	public static void main(String[] args) {
		Temp t = new Temp(0);
		t.data = t.add(20);
		System.out.println(t.data);
	}
} 