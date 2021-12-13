<%@page import="java.util.*, java.sql.*, bang01.Bang01VO"
	pageEncoding="euc-kr"%><%

List<Bang01VO> ls = new ArrayList<Bang01VO>();
try {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	try {
		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection(
			"jdbc:mariadb://183.111.242.21:3306/pukyung00",
			"pukyung00","pukyung00!!1");
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT * FROM bang01_T");

		while( rs.next() ) {
			Bang01VO vo = new Bang01VO();
			vo.setNo( rs.getInt("no") );
			vo.setContent( rs.getString("content") );
			vo.setTheTime( rs.getString("the_time") );
			vo.setAuthor( rs.getString("author") );
			ls.add( vo );
		}
	}
	catch( Exception e ) { throw e; }
	finally {
		if( rs != null ) rs.close();
		if( stmt != null ) stmt.close();
		if( conn != null ) conn.close();
	}
}
catch( Exception e ) {
	out.println( e.toString() );
}

for( Bang01VO vo : ls ) {
	out.println( vo.getNo() + "\t" + vo.getContent() + "\t" + vo.getTheTime() + "\t" + vo.getAuthor() );
	out.println("<br/>");
}

%><%-- test_08.jsp 

--%>