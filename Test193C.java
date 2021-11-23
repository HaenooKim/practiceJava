import java.net.Socket;

public class Test193C { //클라이언트는 찾아가는 쪽
	public static void main(String[] args) {
		try {
			Socket skt = new Socket("121.146.118.88", 7890); //찾아가서 접속시도->기다리던 서버와 만나면 소켓을 생성후 리턴
			skt.close();
		}
		catch(Throwable e) {}
	}
} 
/*실제로 내가 쓰는 IP주소를 확인하는 법 : 구글에 whatismyip 를 검색해서 사이트에 접속.

	클라이언트와 서버에서 Socekt skt가 가리키는 대상은 별개의 인스턴스일 수 밖에 없다.
	왜냐하면 개별적으로 동작하는 프로그램은 메모리를 공유할 수 없다.
	하지만 두개의 소켓이 연결되어 있다면 두개의 소켓은 서로 정보를 주고받을 수 있다.
*/
