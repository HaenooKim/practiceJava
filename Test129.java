import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test129 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		
		long time = System.currentTimeMillis();
		for (int i=0; i<100000; i++) {
			lst.add("apple"+i);
		}
		
		while(lst.isEmpty() == false) {
			lst.remove(0);
		}
		
		time = System.currentTimeMillis() - time;
		
		System.out.println(time);
		
	}
}


/*
	ArrayList : 저장에 배열을 이용한다. 그냥 쌓아놓기에 속도가 훨씬 빠르다.
	하지만 도중에 삭제가 일어났을 때 오버헤드가 크다.
	
	ListNode : 저장에 Node를 이용한다. 동작속도는 느린편이다. 중간 삭제가 일어났을 때
	부담이 없다.
	
	
	* 중간에 삭제가 빈번히 일어나면 LinkedList, 그런일이 적고 쭉 쌓았다가 풀어내면 arrayList
	
	System.currentTimeMillis() : 현재의 시간을 long형태의 정수로 밀리세컨드단위로 출력을 해주는 함수
	
	이걸로 시간을 재보니 arraylist가 더 빠른걸 알 수 있음.
	
	ArrayList : 배열을 이용한다. 모자라면 기존 공간의 2배를 마련하여 이사간다. 
	단순 쌓기는 배열이 제일 빠르지만 도중 삭제가 일어나면 비어있는 자리를 뒤에서 땡겨온다. 그래서
	도중삭제를 하면 시간이 오래걸린다.
	
	LinkedList 는 도중삭제가 일어나면 포인터 하나만 바꾸고 Node하나만 삭제하면 된다.
	
	
*/