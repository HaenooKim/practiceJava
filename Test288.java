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
			conn.close()�� ������ �������� �ʴ�.
			stmt�� conn�� Ÿ�� sql�� �����ϰ� �� ����� �޾ƿ��� ������ �����Ѵ�.
			conn.close()�Ǿ������ ���������� ���� �� �� ����.
			
			�ؼ� �ݵ�� �� ������� �ڵ尡 ¥������ �Ѵ�.
			conn ���� -> stmt ���� -> sql������ -> stmt�ݰ� -> conn�ݰ�
		*/
		
		
		//int r = stmt.executeUpdate("update test01_T set no = 1234, data = 'AppleWorld'");
		int r = stmt.executeUpdate("DELETE FROM test01_T");
		
		System.out.println(r); //r�� ����� ���ڵ��� ������ �޴´�.
		
		stmt.close();
		conn.close();
	}
}

/*
	executeUpdate �Լ��� ���ϰ��� ����� ���ڵ� ������ �ǹ��Ѵ�. (������ ������ �ƴ�)
	
	executeUpdate �Լ��� INSERT DELETE UPDATE������ �����ų �� �ִ�.
*/