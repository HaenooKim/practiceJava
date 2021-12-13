<%@page import="java.util.*, java.sql.*, bang01.Bang01VO"
	pageEncoding="euc-kr"%><%

List<Bang01VO> ls = new ArrayList<Bang01VO>();
try {
	Class.forName("org.mariadb.jdbc.Driver");
	Connection conn = DriverManager.getConnection(
		"jdbc:mariadb://183.111.242.21:3306/pukyung00",
		"pukyung00","pukyung00!!1");
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("SELECT * FROM bang01_T");

	while( rs.next() ) {
		Bang01VO vo = new Bang01VO();
		vo.setNo( rs.getInt("no") );
		vo.setContent( rs.getString("content") );
		vo.setTheTime( rs.getString("the_time") );
		vo.setAuthor( rs.getString("author") );
		ls.add( vo );
	}
	rs.close();
	stmt.close();
	conn.close();
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