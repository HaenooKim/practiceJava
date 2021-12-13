package banana;

import java.sql.*;
import bang01.Bang01VO;
import java.util.*;

public class Test294 {
	public static void main(String[] args) throws Exception{
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
		("jdbc:mariadb://183.111.242.21:3306/pukyung21", "pukyung21","pukyung00!!1");
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from bang01_T");
		
		List<Bang01VO> ls = new ArrayList<Bang01VO>();//인스턴스를 담을 리스트 선언
		
		while(rs.next()) {
			Bang01VO vo = new Bang01VO();
			
			vo.setNo(rs.getInt("no"));
			vo.setContent(rs.getString("content"));
			vo.setTheTime(rs.getString("the_time"));
			vo.setAuthor(rs.getString("author"));
			
			ls.add(vo);
			
		
		}
		
		rs.close();
		stmt.close();
		conn.close();
		
		for (Bang01VO vo : ls) {
			System.out.println(vo.getNo()+"," + vo.getContent());
		}

	}
}

/*
while(rs.next()) {
			Bang01VO vo = new Bang01VO();
			
			vo.setNo(rs.getInt("no"));
			vo.setContent(rs.getString("content"));
			vo.setTheTime(rs.getString("the_time"));
			vo.setAuthor(rs.getString("author"));
			
			ls.add(vo);
			
		
		}
		
		rs.close();
		stmt.close();
		conn.close();
		
		for (Bang01VO vo : ls) {
			System.out.println(vo.getNo()+"," + vo.getContent());
		}
	
	 

*/