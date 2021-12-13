package banana;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Test289 {
	public static void main(String[] args) throws Exception{
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
		("jdbc:mariadb://183.111.242.21:3306/pukyung21", "pukyung21","pukyung00!!1");
		
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from test01_T");
		
		while(rs.next()) { //rs.next()의 리턴형태는 boolean!
			int no = rs.getInt("no");
			String data = rs.getString("data");
			
			System.out.println(no + ", " + data);
		}
	
		rs.close();
		stmt.close();
		conn.close();
	}
}

/*

		int no = rs.getInt(1);
		String data = rs.getString(2);
		
		--1 부터 순서를 줄 수도 있고 위의 코드처럼 필드명을 줄 수도 잇다.
		
		select : executeQuery를 쓰고 insert update delete 는 executeUpdate를 쓴다.
		executeUpdate의 리턴타입은 int이다. 이것은 변경된 레코드 개수를 리턴한다.
		executeQuery의 리턴타입은 ResultSet이다.
		
		+------+--------+
		| no   | data   | <- flag (여기서 부터 시작)
		+------+--------+
		|  100 | apple  | <- flag (이동) return true
		|  101 | banana | <- flag (이동) return true
		|  102 | orange | <- flag (이동) return false
		+------+--------+

		
		
		ResultSet은 위와 같은 결과를 담고이다.
		내부적으로 가로 방향을 가로지는 flag 변수를 가지고 있다.
		
		flag를 뒤로 이동시키는 함수가 next(), 성공시 true/ 실패시 false를 리턴타입은
		
		rs.getInt("no") : 현재 flag가 가리키는 가로, no에 해당하는 세로, 교차점의 값을 int형태로 리턴한다.
		rs.getString("data") : 교차점의 값을 String형태로 리턴한다.
		
		더이상 이동할 곳이 없으면 false를 리턴
	
	
*/