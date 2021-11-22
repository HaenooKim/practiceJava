public class Test159 {
	public static void main(String[] args) {
		StringBuffer l = new StringBuffer("*");
		for (int i=0; i<100000; i++) {
			l.append("*");
		}
		System.out.println(l.toString());
	}
}

/*
java -verboseg Test156
자신의 내용에 붙이는 형태로 동작하기 때문에 이프로그램은 인스턴스 1개만 생기고
따라서 잡혀갈 인스턴스는 1개밖에 없다. -> 메모리가 절약된다.
*/