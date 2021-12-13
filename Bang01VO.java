package bang01;

public class Bang01VO 
{
	private Integer no = null;
	public Integer getNo(){ return this.no; }
	public void setNo( Integer i ){ this.no = i; }
	
	private String content = null;
	public String getContent(){ return this.content; }
	public void setContent( String i ){ this.content = i; }
	
	private String theTime = null;
	public String getTheTime(){ return this.theTime; }
	public void setTheTime( String i ){ this.theTime = i; }
	
	private String author = null;
	public String getAuthor(){ return this.author; }
	public void setAuthor( String i ){ this.author = i; }
}

/*
MariaDB [pukyung00]> select * from bang01_T;
+----+----------------------+---------------------+--------+
| no | content              | the_time            | author |
+----+----------------------+---------------------+--------+
|  1 | 방명록1              | 2021-12-13 13:36:21 | Apple  |
|  2 | 방명록2              | 2021-12-13 13:36:21 | Banana |
|  3 | 잘 보고 갑니다       | 2021-12-13 13:36:21 | Orange |
+----+----------------------+---------------------+--------+
3 rows in set (0.00 sec)

bang01_T > Bang01VO
*/