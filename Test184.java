
package banana;

import static banana.Temp.print; //이걸 적어주면 전역함수 쓰듯이 메인에서 print()만 적어주면 실행됨

class Temp {
	public static void print() {
		System.out.println("print");
	}
}

public class Test184 {
	public static void main(String[] args) {
		print();
	}
}

/*
static import는 대상이 class가 아니라 class안에 선언된 static함수이고
마치 c에서 함수호출 하듯이 static한 함수를 함수명만으로 호출할 수 있다. 
(jdk1.5부터 지원했음.) 
*/


/*
	복잡한 콘솔상의 명령어를 파일로 만들어놓고 수행하는 것
	윈도우에서는 배치파일(*.bat) 유닉스에서는 쉘프로그래밍(*.sh)
	
	
---------------c.bat-----------------

	@ECHO OFF 
	REM c.bat
	SET CPATH = c:/classes

	@ECHO ON
	javac -d %CPATH% %1.java
	java -classpath %CPATH% banana.%1
	
------------------------------------
	@ECHO OFF : 명령어를 복창하는 것 끄기
	@ECHO ON : 명령어 복창하도록 하기
	SET CPAHT=... : CPATH라는 변수에 문자열을 저장
	%CPATH% : 변수에 지정된 값을 여기에 붙여넣기
	1% : 배치파일 실행 시 외부에서 전달되는 첫번째 인자값
	-> ex) c Test184 를 입력하면 %1이 Tes184가 됨

*/