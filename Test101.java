import apple.패키지;

public class Test101{
	public static void main(String[] args) {
		패키지 t = new 패키지();
		// System.out.println(t.rivate); 접근 불가
		//System.out.println(t.rotoected); 접근 불가
		System.out.println(t.ublic);
		// System.out.println(t.riendly); 접근 불가
		
		
	}
}

/*
	다른 패키지에 있는 클래스를 사용할 때 import.패키지명.클래스명
	가져다 쓸 클래스가 다른데 있으면 그 위치를 -classpath로 지정한다.
	컴파일 : javac -classpath c:\classes Test101.java
	실행 : java -classpath .;c:\classes Test101
	*Test101.class는 JavaWork에서 찾아야 하니 .을 경로에 추가한다.
*/