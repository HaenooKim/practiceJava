public class Test156 {
	public static void main(String[] args) {
		for (int i=0; i<1000000; i++) {
			String t = "HelloWorld" + i; //메모리소모가 큼
			//String t = "HelloWorld"; 메모리소모가 적음
			t = null;
		}
	}
}

/*
	가베지 콜렉션을 생각하면 위의 코드는 엄청나게 많은 메모리소모를 만들것임.
	"HelloWorld"인스턴스가 100만개 개장수에게  잡혀갈거다.
	
	java -verboseg Test156 : 메모리가 모자라서 개장수가 잡아간 인스턴스를 소멸시킬 때 한 줄 출력해줌.
	-> 많이 출력될수록 메모리 소모가 많은 프로그램임
	
	매우중요한 개념 !!!!!!!!!!!!
	String은 "..." 생성한 인스턴스의 경우에 한해서 한 번 생성한 인스턴스를 재활용한다.
	그래서 HelloWorld만 백만번 출력할땐 메모리소모가 크지 않으나 +i를 붙이면 커진다.
	
	->String t = "HelloWorld"; 는 메모리소모가 거의 없다시피한 코드이다. 재활용되기 때문.
*/