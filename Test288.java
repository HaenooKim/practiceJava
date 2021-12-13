package banana;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class Test288 {
	public static void main(String[] args) throws Exception{
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
		("jdbc:mariadb://183.111.242.21:3306/pukyung21", "pukyung21","pukyung00!!1");
		
		Statement stmt = conn.createStatement();
		/*
			conn.close()한 시점이 적절하지 않다.
			stmt는 conn을 타고 sql을 전달하고 그 결과를 받아오는 역할을 수행한다.
			conn.close()되어버리면 정상적으로 전달 할 수 없다.
			
			해서 반드시 이 순서대로 코드가 짜여져야 한다.
			conn 생성 -> stmt 생성 -> sql오고가고 -> stmt닫고 -> conn닫고
		*/
		
		
		//int r = stmt.executeUpdate("update test01_T set no = 1234, data = 'AppleWorld'");
		int r = stmt.executeUpdate("DELETE FROM test01_T");
		
		System.out.println(r); //r은 변경된 레코드의 개수를 받는다.
		
		stmt.close();
		conn.close();
	}
}

/*
	executeUpdate 함수의 리턴값은 변경된 레코드 갯수를 의미한다. (데이터 갯수가 아님)
	
	executeUpdate 함수는 INSERT DELETE UPDATE문장을 실행시킬 수 있다.
*/