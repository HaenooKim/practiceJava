import java.io.*;

public class Test199 {
	public static void main(String[] args) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("e.dat"));
			out.writeInt(233232);
			out.writeDouble(3.141692);
			out.writeUTF("김수한무와 거북이");
			out.close();
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("e.dat"));
			int r = in.readInt();
			double d = in.readDouble();
			String t = in.readUTF();
			
			/*
				더 이상 읽을 것이 없을 때 in.read()는 에러를 발생하지 않고 -1을 리턴한다.
				하지만 in.readInt()를 하게 될경우 EOFException 이라는 에러를 발생시킨다.
			*/
			int j = in.readInt();
			System.out.println(j);
			
			in.close();
			
			System.out.println(r);
			System.out.println(d);
			System.out.println(t);
			//순서대로 주고받기 때문에 무조건 순서를 지켜서 받을것!
		}
		
		catch(IOException e) {
			e.printStackTrace(); //발생한 에러의 스택정보를 추적
		}
	}
}

/*
 public ObjectOutputStream(OutputStream out) throws IOException
 
 --매개변수 out은 FileOutputStream의 인스턴스를 가리킬 수 있기에 위의 코드가 가능하다.
 
 writeInt / readInt - int를 깨지않고 주고받을 수 있는 멤버함수
 ObjectInputStream / ObjectOutputStream 은 다양한 자료형과 문자열까지 주고받을 수 있는 함수를 제공

java에서 모든 데이터 통신의 기반이 되는 클래스가 ObjectInputStream / ObjectOutputStream이된다.
이걸 소켓에서도 쓸 수 있나요? 맞습니다. 이것은 Decorator Pattern이라는 설계패턴으로 설계되어서 처음부터
그걸 염두에 두고 만들었음
*/

