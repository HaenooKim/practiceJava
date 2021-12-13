package banana;

import java.sql.*;

public class Test284 {
	public static void main(String[] args) throws Exception{
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://183.111.242.21:3306/pukyung21", "pukyung21", "pukyung00!!1");
		System.out.println(conn.toString());
		
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT NOW()");
		
		if (rs.next()) {
			String l = rs.getString(1);
			System.out.println(l);
		}
		
		rs.close();
		stmt.close();
		
		conn.close();
	}
}


/*
	javac -d c:\classes Test284.java
	java -classpath c:\classes;c:\jars\mariadb-java-client-2.5.1.jar banana.Test284
	->classpath에는 복수의 폴더 또는 파일을 지정할 수 있고 구분은 윈도우에서는 ;(세미콜론), 유닉스는 :(콜론) 이다.
	
	*.jar : *.class파일을 체계적으로 압축한 파일임
	일반적으로 개발한 결과는 *.jar형태로 배포하게 된다.
	배포된 jar파일을 사용하기 위해서는 -classpath에서 해당파일을 지정하면된다.(컴파일시 & 실행시)
	
	Class.forName("org.mariadb.jdbc.Driver");
	->문자열 이름의 클래스를 찾아서 메모리에 로딩시킴 (reflection때 사용)
	
	-----------------------------------------------------
	
	복잡한 명령어는 배치파일(.bat을 이용한다.)
	->cdb Test284입력만 하면 됨
	
	cmd창에
	ping pukyung21.cafe24.com 입력
	->Ping pukyung21.cafe24.com [183.111.242.21] 32바이트 데이터 사용
	이라고 나온다. 해당 도메인 주소에 대한 실제 ip주소를 확인할 수 있다.
	
	
*/