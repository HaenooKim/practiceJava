import java.net.*;

public class Test209C {
	public static void main(String[] args) throws Exception{
		Socket skt = new Socket("127.0.0.1", 7890);
		skt.close();
	}
}


/*
	통신을 마무리하고 서버는 다시 대기상태로 돌아가야 한다.
*/