package banana;

import java.sql.*;

public class Test284 {
	public static void main(String[] args) throws Exception{
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://183.111.242.21:3306/pukyung21", "pukyung21", "pukyung00!!1");
		System.out.println(conn.toString());
		
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT NOW()");
		
		if (rs.next()) {
			String l = rs.getString(1);
			System.out.println(l);
		}
		
		rs.close();
		stmt.close();
		
		conn.close();
	}
}


/*
	javac -d c:\classes Test284.java
	java -classpath c:\classes;c:\jars\mariadb-java-client-2.5.1.jar banana.Test284
	->classpath���� ������ ���� �Ǵ� ������ ������ �� �ְ� ������ �����쿡���� ;(�����ݷ�), ���н��� :(�ݷ�) �̴�.
	
	*.jar : *.class������ ü�������� ������ ������
	�Ϲ������� ������ ����� *.jar���·� �����ϰ� �ȴ�.
	������ jar������ ����ϱ� ���ؼ��� -classpath���� �ش������� �����ϸ�ȴ�.(�����Ͻ� & �����)
	
	Class.forName("org.mariadb.jdbc.Driver");
	->���ڿ� �̸��� Ŭ������ ã�Ƽ� �޸𸮿� �ε���Ŵ (reflection�� ���)
	
	-----------------------------------------------------
	
	������ ��ɾ�� ��ġ����(.bat�� �̿��Ѵ�.)
	->cdb Test284�Է¸� �ϸ� ��
	
	cmdâ��
	ping pukyung21.cafe24.com �Է�
	->Ping pukyung21.cafe24.com [183.111.242.21] 32����Ʈ ������ ���
	�̶�� ���´�. �ش� ������ �ּҿ� ���� ���� ip�ּҸ� Ȯ���� �� �ִ�.
	
	
*/