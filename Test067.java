
class Temp {
	int data = 100;
	int add(int i) {
		return i*10 + this.data;
	}
}

public class Test067 {
	public static void main(String[] args) {
		Temp t = new Temp();
		t.data = t.add(20);
		System.out.println(t.data);
	}
}

//66번 코드를 자바로 옮기는 꼴
/*
	t.add(20); 이것과 같이 호출했을 때,
	함수 안에서는 this라는 포인터를 쓸 수 있다.
	
	this는 현재 호출되는 함수가 소속된 인스턴스
	(t를 통해서 함수가 호출된다면 t가 가리키는 대상)를 가리키게 된다.\
	
	this를 통해서 data와 add함수에 접근할 수 있다.
*/