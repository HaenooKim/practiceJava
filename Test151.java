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
		String l = "setCode:Banana";	// 함수명과 값은 바뀔수도 있다고 생각하고 짜세요
		
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
/*	위에 적힌 문장대로 함수를 호출하여 값를 넣은다음 그 실행 결과를 확인하는 코드를 짜세요
	vo.setCode("Banana") 이렇게 호출말고 Method 의 invoke 를 써서 하되. 매개변수의 형식을 확인후에 .


		이렇게 해 보려고 했는데 없는 함수를 찾으려니 에러가 나와서 다른 방법을 찾아야겠다 ...
		Method mtd = cls.getMethod( "setCode" , int.class );
		if( mtd == null ) {
			mtd = cls.getMethod( "setCode" , String.class );
		}
		
		if( mtd != null ) 
		{
			System.out.println( mtd );			
		}
	
*/