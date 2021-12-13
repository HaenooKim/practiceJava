package banana;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test285 {
	public static void main(String[] args) throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
		("jdbc:mariadb://183.111.242.21:3306/pukyung21", "pukyung21", "pukyung00!!1");
		//System.out.println(conn.toString());
		
		Statement stmt = conn.createStatement();
		stmt.executeUpdate("INSERT INTO test01_T values (10101, 'Apple')");
		
		
/*
	CREATE TABLE test01_T (
		no INT,
		data VARCHAR(10)
	);
*/
		stmt.close();
		conn.close();
	}
}


/*

	
	Statement도 인터페이스다. (Driver가 아래에서 알아서 다 해주고 잇따.)
	Statement는 connection에 달려있는 바구니라 생각하면된다.
	SQL문장을 실어 나르고 DB에 떨구고 동작 결과를 받아서 돌아온다.
	하나의 SQL문장은 하나의 Statement로 실행한다고 볼 수 있다.
	


	
--------------------------------------------

	Connection 생성시 소켓접속용 정보를 주는 걸 볼 수 있다.
	따라서 반드시 Connection은 사용후에 close()를 해줘야 한다.
	
	Connection은 굉장히 비싼 자원이다.
	
	Connection을 비교하길 11번가의 콜센터를 생각하면 된다.
	
	
	Class.forName("...") -해당 이름의 클래스를 메모리에 로딩
	org.mariadb.jdbc.Driver 클래스가 없어서 에러.
	
	javac -d c:\classes Test285.java
	java -classpath c:\classes;c:\jars\mariadb-java-client-2.5.1.jar banana.Test285

*/