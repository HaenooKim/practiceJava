package banana;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

/*
	test01_T�� Test01DTO�� ���� : Data Transfer Object - �����͸� ��� ������ �뵵�θ� ����.
	no�ʵ�� getNo + setNo�� no�� property�� ����
	
*/

class Test01DTO {
	// no �ʵ�� ���εǴ� property
	private Integer no = null;
	public Integer getNo(){return no;} //getter
	public void setNo(Integer i) {this.no = i;} //setter
	
	//data �ʵ�� ���εǴ� property
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
		
		List<Test01DTO> ls = new ArrayList<Test01DTO>();//�ν��Ͻ��� ���� ����Ʈ ����
		
		while(rs.next()) {
			// ���ڵ� �ϳ��� ���ε� �� �ֵ��� �ν��Ͻ��� ����(���ڵ�� �ν��Ͻ��� ����)
			Test01DTO dto = new Test01DTO();
			
			dto.setNo(rs.getInt("no")); 
			dto.setData(rs.getString("data"));
			
			ls.add(dto);
		}
		rs.close();
		stmt.close();
		conn.close();
		
		/*
			close ������ �����͸� �̸� ArrayList�� �Ű� ��������
			������ �����ϰ� �ᵵ�ȴ�.
		*/
		
		for (Test01DTO dto : ls) {
			System.out.println(dto.getNo() + "," + dto.getData());
		}
	}
}

/*
	O-R Mapping�̶�� ������ �ִ�.
	�����ͺ��̽��� ������ Programming�� �������� �����ϴ� ��Ģ?
	
	Table�� class�� �����Ѵ�. (VO, DTO)
	Record�� instance�� �����Ѵ�.
	Field�� property�� �����Ѵ�.(property = ������� + getter & setter)
	
	�� �̷� ������ ���� �ؾ� ��?
	- connection�� ����ڿ��̱� ������ ���� ���� �������(conn.close()) �Ѵ�.
	- select ����� ������ ���� ���忡���� �����ϰ� ����ʹ�(�� ������ ���� �͵� ���� �ٿ���)
	- �� !! select ����� ��򰡿� �Ǳ�� connection�� ������ ���ݾ�?
	- �Ź� �޶����� ����ϴϱ� �ƿ� ��Ģ�� �����ڰ� �ؼ� ���� ���� O-R�����̴�.
	
	>> �ֱ� ���߿� ���� ���̴� �����ӿ�ũ�鵵 �� O-R���� ������� �Ǿ��ִ�.
	
*/