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
	���� ���ư��� ������ ���� �������� ���� ���� ���� ���ư��� �ʴ´�.
	jdbc�� �⺻������ server-side-cursor ������� ���ư���.
	
	select ���� ����Ǹ� �� ������� ��� �ִ� ������ cursor��� �Ѵ�.
	�� cursor�� �⺻������ db�������� �����Ѵ�.
	statement�� �ش� cursor�� ������ �� �ִ� ������������ ����� ���ƿͼ� ResultSet ���·� �����Ѵ�.
	
	conn.close()�� �Ͼ�� �Ǹ�? ResultSet�� ����� �� ����.
	���� ResultSet�� conn�� �����ִ� ���ȸ� ����ؾ� �ϰ� �� �������� conn�� ���� ������� �Ѵ�.
	
*/