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
	'����'�� ����� ������ �ϰڽ��ϴ�.!!
	- ����, ���� �� ������ ȸ�����Ե� �ʿ���� '�� ���� ���ϴ�' ����� ����.
	
	create table bang01_T (
		no INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
		content VARCHAR(500) ,
		the_time DATETIME,
		author VARCHAR(30)
	);
	
	
	 insert into bang01_T values(default, '����1', NOW(), 'apple');
	 insert into bang01_T values(default, '����2', NOW(), 'banana');
	 insert into bang01_T values(default, '�ߺ��� ���ϴ�.', NOW(), 'orange');
	 

*/