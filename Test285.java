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

	
	Statement�� �������̽���. (Driver�� �Ʒ����� �˾Ƽ� �� ���ְ� �յ�.)
	Statement�� connection�� �޷��ִ� �ٱ��϶� �����ϸ�ȴ�.
	SQL������ �Ǿ� ������ DB�� ������ ���� ����� �޾Ƽ� ���ƿ´�.
	�ϳ��� SQL������ �ϳ��� Statement�� �����Ѵٰ� �� �� �ִ�.
	


	
--------------------------------------------

	Connection ������ �������ӿ� ������ �ִ� �� �� �� �ִ�.
	���� �ݵ�� Connection�� ����Ŀ� close()�� ����� �Ѵ�.
	
	Connection�� ������ ��� �ڿ��̴�.
	
	Connection�� ���ϱ� 11������ �ݼ��͸� �����ϸ� �ȴ�.
	
	
	Class.forName("...") -�ش� �̸��� Ŭ������ �޸𸮿� �ε�
	org.mariadb.jdbc.Driver Ŭ������ ��� ����.
	
	javac -d c:\classes Test285.java
	java -classpath c:\classes;c:\jars\mariadb-java-client-2.5.1.jar banana.Test285

*/