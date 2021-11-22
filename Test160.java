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
				1. ���·� ��ȯ�ϴ� �ڵ带 StringBuffer �� �̿��Ͽ� ���� ��
				   ( �ٸ��̸��̶� �ϴ��� ���ư� �� �ְ� , ���� ��� apple �� setApple 
				     �ʿ��ϸ� �����е��� API �������鼭 ���� )
				
				2. ������ setXXX �Լ��� Method �� �̿��Ͽ� vo �� ����Ű�� �ν��Ͻ��� ������ ������
				   �� String "100" �� int 100 ���� �ٲܶ��� Integer.parseInt("100") �� �̿��Ѵ�.
				   �Ű������� ������ String �� int �ΰ����� �����Ѵ�.
			*/
			
			if( l.equals("quit") ) {
				alive = false;
			}
		}
		System.out.println( vo );
	}
}