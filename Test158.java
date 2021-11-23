
public class Test158 {
	public static void main(String[] args) {
		
		String l = "*";
		
		for (int i=0; i<100000; i++) { //매우 비효율적이다. 별 하나를 더할때 마다 인스턴스를 ㅎ나씩 생성
			l = l+"*";
		}
		
		System.out.println(l);
	}
}


/*
	쓸데없는 String을 10만개 만들게 된다.(별을 한개 더할때 마다 새로운 인스턴스를 생성함.)
	String은 내용을 변경시키지 않는데 차라리 내용을 변경하면 인스턴스 1개로 끝난다.
	-> String과 비슷한데 철저히 자신의 내용을 변경시키는 형태로 동작하는 클래스 : stringbuffer
	
*/