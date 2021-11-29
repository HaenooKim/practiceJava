package banana;

//	 보통은 import 대상은 클래스인데 import static 은 static 하게 선언된 함수를 대상으로 한다.
import static banana.Logic.print;

class Logic {
	public static void print() {}
}

public class Test236 {
	public static void main( String[] args ) {
		System.out.println("HelloWorld");
		print();
	}	
}

/*	javac -d c:\classes Test236.java
	java -classpath c:\classes banana.Test236
	
	글꼴의 폭이 다르면 특정 문자가 잘 안보일 수 있다.
	. i 같은 글자가 잘 안보인다.
	'코딩용 글꼴은 글자의 폭이 모두 같다'
	'오타를 잡아낼 때 스펠링을 보기 보다는 글자의 길이를 보고 잡아낸다. - 가변폭 글꼴은 그게 안됨'
	Courier New , Consolas 도 많이 쓰는데 D2Coding 이 좀 더 다닥다닥 ...
	( Consolas 는 MS 개발환경에서 디폴트로 쓴다. Mac 의 기본글꼴이 Monaco 임 ) 
	글꼴은 팀원들이 모두 맞추는게 예의 - 남들이 코드 봐주기 편해야 해서.
	Monaco 가 이쁘고 보기에도 여유로와 보이지만 한글 글꼴이 포함이 안되어서 ... 
	
	코딩용 글꼴은 한글 한 글자가 영문 두 글자 만큼의 폭을 일정하게 가지고 있는게 편하다
	
	'네이버에서 나눔고딕코딩 이라는 글꼴을 만들어 무료배포중 - 쓰신다면 1.65 버젼 추천 ( 2.0 보다 )'
*/