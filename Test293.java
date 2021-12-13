package banana;

import java.sql.*;

public class Test293 {
	public static void main(String[] args) throws Exception{
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
		("jdbc:mariadb://183.111.242.21:3306/pukyung21", "pukyung21","pukyung00!!1");
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from bang01_T");
		
		while(rs.next()) {
			Integer no = rs.getInt("no");
			String content = rs.getString("content");
			String theTime = rs.getString("the_time");
			String author = rs.getString("author");
			
			System.out.println(no +", " + content);
		}
		
		rs.close();
		stmt.close();
		conn.close();
	}
}

/*
	'방명록'을 만들어 보도록 하겠습니다.!!
	- 제목, 내용 안 가르고 회원가입도 필요없고 '잘 보고 갑니다' 남기는 정도.
	
	create table bang01_T (
		no INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
		content VARCHAR(500) ,
		the_time DATETIME,
		author VARCHAR(30)
	);
	
	
	 insert into bang01_T values(default, '방명록1', NOW(), 'apple');
	 insert into bang01_T values(default, '방명록2', NOW(), 'banana');
	 insert into bang01_T values(default, '잘보고 갑니다.', NOW(), 'orange');
	 

*/