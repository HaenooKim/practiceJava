package banana;

import java.lang.reflect.Method;

class CodeVO {
	String code = null;
	public void setCode( String i ) {
		this.code = i;
	}
}

public class Test151 {
	public static void main( String[] args ) throws Exception {
		String l = "setCode:Banana";	// �Լ���� ���� �ٲ���� �ִٰ� �����ϰ� ¥����
		
		CodeVO vo = new CodeVO();
		
		Class<?> cls = vo.getClass();
		Method[] mtds = cls.getMethods();
		for( Method mtd : mtds ) {
			if( "setCode".equals( mtd.getName() ) ) {
				Class<?>[] ps = mtd.getParameterTypes();
				if( ps.length == 1 && ps[0] == String.class ) {
					mtd.invoke( vo, "Banana" );
				}
				else if( ps.length == 1 && ps[0] == int.class ) {
					mtd.invoke( vo, 10101 );
				}
			}
		}
		
		System.out.println( vo.code );
	}
}
/*	���� ���� ������ �Լ��� ȣ���Ͽ� ���� �������� �� ���� ����� Ȯ���ϴ� �ڵ带 ¥����
	vo.setCode("Banana") �̷��� ȣ�⸻�� Method �� invoke �� �Ἥ �ϵ�. �Ű������� ������ Ȯ���Ŀ� .


		�̷��� �� ������ �ߴµ� ���� �Լ��� ã������ ������ ���ͼ� �ٸ� ����� ã�ƾ߰ڴ� ...
		Method mtd = cls.getMethod( "setCode" , int.class );
		if( mtd == null ) {
			mtd = cls.getMethod( "setCode" , String.class );
		}
		
		if( mtd != null ) 
		{
			System.out.println( mtd );			
		}
	
*/