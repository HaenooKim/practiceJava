interface ICalc {
	public int execute (int i, int j);
}

class Add implements ICalc, NoPrint {
	public int execute(int i, int j) {
		return i+j;
	}
}

class Minus implements ICalc {
	public int execute(int i, int j) {
		return i-j;
	}
}

interface NoPrint {
	
}


public class Test153 {
	public static void main(String[] args) {
		ICalc ic = new Minus();
		int r = ic.execute(10, 20);
	
		if (ic instanceof NoPrint) {
			
		} else {
			System.out.println(r);
		}
		
		
		
	}
}


/*
	하나의 동작을 하나의 인스턴화하는 설계패턴을 커맨드패턴이라고 한다.
	과거에는 Commander Pattern을 굉장히 많이 씀.
	annotation을 쓰려면 그 패턴으로 써야했음
	
	클래스는 만든사람과 쓰는사람이 다를 가능성이 크다.
	-> 만든사람이 클래스에다가 이걸 쓸 때는 이렇게 썼으면 좋겠다 라는 정보를 심어주고 싶다.
	
	그럼 어떻게 하느냐? -> 비어있는 인터페이스를 이용한다.
	
	해당 인터페이스를 상속받은 커맨드를 실행할 때 instatnceof를 이용해서
	해당 인터페이스로 상속받은지를 살펴보고
	거기에 맞게 지정한 사람의 의도를 헤아린코드를 만들어 넣을 수 있게 된다.

	::이런 개념을 체계화 해서 언어에 넣은것이 annotation이다. -annotation은 인터페이스로 만들어진다.
	최근 프레임워크등에서 annotation지정만으로 많은 코드를 대신하는 경향이 많다.
	짜는 입장에서는 힘들지만 사용자입장에서는 사용하기 편함.
	
	NoPrint지정만 하면 안 찍을거니까 사용이 편리함!!
	if (ic instanceof NoPrint) {
			
		} else {
			System.out.println(r);
		}

*/