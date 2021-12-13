package banana;

import java.sql.*;
import bang01.Bang01VO;
import java.util.*;

public class Test295 {
	public static void main( String[] args ) {
		
		try {
			List<Bang01VO> ls = new ArrayList<Bang01VO>();
			
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
			try {
				while( rs.next() ) {
					Class.forName("org.mariadb.jdbc.Driver");
					conn = DriverManager.getConnection
					("jdbc:mariadb://183.111.242.21:3306/pukyung21","pukyung21","pukyung00!!1");
					
					stmt = conn.createStatement();
					
					rs = stmt.executeQuery("SELECT * FROM bang01_T");

					Bang01VO vo = new Bang01VO();
					vo.setNo( rs.getInt("no") );
					vo.setContent( rs.getString("content") );
					vo.setTheTime( rs.getString("the_time") );
					vo.setAuthor( rs.getString("author") );
					ls.add( vo );
				}
			}
			catch(Exception e) {
				
			}
			finally {
				if (rs!=null) rs.close();
				if (stmt!=null) stmt.close();
				if (conn!=null) conn.close();
				
				for( Bang01VO vo : ls ) {
				System.out.println( vo.getNo() + "," + vo.getContent() );
				}
				
	
			}
			
		
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
		
}
/*
try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
				"jdbc:mariadb://183.111.242.21:3306/pukyung21",
				"pukyung21","pukyung00!!1");
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
			System.out.println( e.toString() );
		}


*/