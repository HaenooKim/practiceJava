package banana;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

/*
	test01_T은 Test01DTO로 매핑 : Data Transfer Object - 데이터를 담아 나르는 용도로만 쓴다.
	no필드는 getNo + setNo의 no의 property로 매핑
	
*/

class Test01DTO {
	// no 필드와 매핑되는 property
	private Integer no = null;
	public Integer getNo(){return no;} //getter
	public void setNo(Integer i) {this.no = i;} //setter
	
	//data 필드와 매핑되는 property
	private String data = null;
	public String getData(){return data;}
	public void setData(String i) {this.data=i;}
}


public class Test291 {
	public static void main(String[] args) throws Exception{
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
		("jdbc:mariadb://183.111.242.21:3306/pukyung21", "pukyung21","pukyung00!!1");
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from test01_T");
		
		List<Test01DTO> ls = new ArrayList<Test01DTO>();//인스턴스를 담을 리스트 선언
		
		while(rs.next()) {
			// 레코드 하나와 매핑될 수 있도록 인스턴스를 생성(레코드는 인스턴스에 매핑)
			Test01DTO dto = new Test01DTO();
			
			dto.setNo(rs.getInt("no")); 
			dto.setData(rs.getString("data"));
			
			ls.add(dto);
		}
		rs.close();
		stmt.close();
		conn.close();
		
		/*
			close 이전에 데이터를 미리 ArrayList에 옮겨 놓았으니
			이제는 느긋하게 써도된다.
		*/
		
		for (Test01DTO dto : ls) {
			System.out.println(dto.getNo() + "," + dto.getData());
		}
	}
}

/*
	O-R Mapping이라는 개념이 있다.
	데이터베이스의 개념을 Programming의 개념으로 매핑하는 규칙?
	
	Table은 class로 매핑한다. (VO, DTO)
	Record는 instance로 매핑한다.
	Field는 property로 매핑한다.(property = 멤버변수 + getter & setter)
	
	왜 이런 복잡한 일을 해야 됨?
	- connection은 비싼자원이기 때문에 빨리 쓰고 끊어줘야(conn.close()) 한다.
	- select 결과를 가져다 쓰는 입장에서는 느긋하게 쓰고싶다(웹 디자인 같은 것도 팍팍 붙여서)
	- 즉 !! select 결과를 어딘가에 옳기고 connection을 끊으면 되잖아?
	- 매번 달라지면 곤란하니까 아예 규칙을 정하자고 해서 나온 것이 O-R매핑이다.
	
	>> 최근 개발에 많이 쓰이는 프레임워크들도 다 O-R매핑 기반으로 되어있다.
	
*/