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
		
		while(rs.next()) { //rs.next()�� �������´� boolean!
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
		
		--1 ���� ������ �� ���� �ְ� ���� �ڵ�ó�� �ʵ���� �� ���� �մ�.
		
		select : executeQuery�� ���� insert update delete �� executeUpdate�� ����.
		executeUpdate�� ����Ÿ���� int�̴�. �̰��� ����� ���ڵ� ������ �����Ѵ�.
		executeQuery�� ����Ÿ���� ResultSet�̴�.
		
		+------+--------+
		| no   | data   | <- flag (���⼭ ���� ����)
		+------+--------+
		|  100 | apple  | <- flag (�̵�) return true
		|  101 | banana | <- flag (�̵�) return true
		|  102 | orange | <- flag (�̵�) return false
		+------+--------+

		
		
		ResultSet�� ���� ���� ����� ����̴�.
		���������� ���� ������ �������� flag ������ ������ �ִ�.
		
		flag�� �ڷ� �̵���Ű�� �Լ��� next(), ������ true/ ���н� false�� ����Ÿ����
		
		rs.getInt("no") : ���� flag�� ����Ű�� ����, no�� �ش��ϴ� ����, �������� ���� int���·� �����Ѵ�.
		rs.getString("data") : �������� ���� String���·� �����Ѵ�.
		
		���̻� �̵��� ���� ������ false�� ����
	
	
*/