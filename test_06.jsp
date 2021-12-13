<%@page pageEncoding="euc-kr" import = "java.util.*" import="java.sql.*"%><%

try {
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
			
		out.println(no +"\t" + content + "\t" + theTime + "\t" + author);
		out.println("<br/>");
	}
		
	rs.close();
	stmt.close();
	conn.close();
	
	
}
catch (Exception e) {
	out.println(e.toString());
}

%>

<%-- test_05.jsp
이 파일은 서버에서 동작한다.
ROOT/WEB-INF/lib 폴더를 만들어서 jars파일에 있는 mariadb-java-client-2.5.1.jar를 넣어준다.
넣은 다음에는 tomcat을 재 가동시킨다.

putty에서 
cd tomcat -> cd bin -> sh shutdown.tomcat -> sh startup.sh
--%>
