import java.util.Scanner;

class DataVO {
	private int data = 0;
	private String name = null;
	
	public void setData( int i ){
		data = i;
	}
	public void setName( String i ){
		name = i;
	}
	
	public String toString() {
		return "{data:"+data+",name:"+name+"}";
	}
}

public class Test160 {
	public static void main( String[] args ) {
		char c = 'n';
		char c2 = (char)(c-32);
		System.out.println( c2 );
		
		DataVO vo = new DataVO();
		
		Scanner sc = new Scanner( System.in );
		boolean alive = true;
		String l = null;
		while( alive ) {
			//	data 100
			//	name apple
			l = sc.nextLine();
			
			/*
				data -> setData
				name -> setName 
				1. 형태로 변환하는 코드를 StringBuffer 를 이용하여 만들 것
				   ( 다른이름이라 하더라도 돌아갈 수 있게 , 예를 들어 apple 은 setApple 
				     필요하면 여러분들이 API 뒤져가면서 구현 )
				
				2. 구해진 setXXX 함수를 Method 를 이용하여 vo 가 가리키는 인스턴스에 내용을 넣을것
				   단 String "100" 을 int 100 으로 바꿀때는 Integer.parseInt("100") 을 이용한다.
				   매개변수의 유형은 String 과 int 두가지로 한정한다.
			*/
			
			if( l.equals("quit") ) {
				alive = false;
			}
		}
		System.out.println( vo );
	}
}