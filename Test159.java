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
�ڽ��� ���뿡 ���̴� ���·� �����ϱ� ������ �����α׷��� �ν��Ͻ� 1���� �����
���� ������ �ν��Ͻ��� 1���ۿ� ����. -> �޸𸮰� ����ȴ�.
*/