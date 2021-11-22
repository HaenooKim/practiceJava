import java.lang.reflect.Method;

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

public class Test163 {
	public static void main( String[] args ) throws Exception {
		DataVO vo = new DataVO();
		
		String fn = "setName";
		String data = "banana";
		
		Class<?> cls = vo.getClass();
		Method[] mtds = cls.getMethods();
		for( Method mtd : mtds ) {
			if( fn.equals( mtd.getName() ) ) {
				Class<?>[] ps = mtd.getParameterTypes();
				if( ps.length == 1 && ps[0] == String.class ) {
					mtd.invoke( vo, data );
				}
				else if( ps.length == 1 && ps[0] == int.class ) {
					mtd.invoke( vo, Integer.parseInt( data ) );
				}
			}
		}
		System.out.println( vo );
	}
}

/*

*/		