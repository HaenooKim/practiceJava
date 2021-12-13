package banana;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Test290 {
	public static void main(String[] args) throws Exception{
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
		("jdbc:mariadb://183.111.242.21:3306/pukyung21", "pukyung21","pukyung00!!1");
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from test01_T");
		stmt.close();
		conn.close();
		
		while(rs.next()) {
			int no = rs.getInt("no");
			String data = rs.getString("data");
			
			System.out.println(no + ", " + data);
		}
		rs.close();
	}
}

/*
	지금 돌아가고 있지만 실은 이전버전 같은 경우는 절대 돌아가지 않는다.
	jdbc는 기본적으로 server-side-cursor 기반으로 돌아간다.
	
	select 문이 실행되면 그 결과물을 담고 있는 구조를 cursor라고 한다.
	그 cursor는 기본적으로 db서버에서 관리한다.
	statement는 해당 cursor에 접속할 수 있는 접속정보만을 담고서 돌아와서 ResultSet 형태로 리턴한다.
	
	conn.close()가 일어나게 되면? ResultSet은 사용할 수 없다.
	따라서 ResultSet은 conn이 열려있는 동안만 사용해야 하고 그 다음에는 conn은 빨리 끊어줘야 한다.
	
*/