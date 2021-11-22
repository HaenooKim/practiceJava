

public class Test162 {
	public static void main( String[] args ) {
		//	data -> setData , name->setName ....
		
		String l = "apple";
		
		StringBuffer sb = new StringBuffer();
		sb.append("set");
		sb.append( l );
		
		char ch = sb.charAt( 3 );
		sb.setCharAt( 3, (char)(ch-32) );
		
		String t = sb.toString();
		System.out.println( t );
	}
}
/*
	public char charAt(int index)
	public void setCharAt(int index,char ch)
*/	