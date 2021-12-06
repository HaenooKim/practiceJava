
//-----------------이 코드 약간 오류있음. 필기만 참고하고 실행은 276에서 할것0-----------------------

package banana;

import static banana.RelatedList.*;
import java.util.*;

/*
	Edge는 지점과의 연결을 표현하기 위한 클래스. 쌍방향 연결을 생각해보면
	Vertex에 달한 리스트라고 생각하면 spot은 도착지점, distance는 가중치
*/

class Edge {
	int spot = 0; //연결의 도착지점
	int distance = 1; //지점까지의 거리 (가중치)
	
	public Edge(int i) {spot = i;}
	public Edge(int i, int d){spot = i; distance=d;}
}

class Vertex {
	int spot = 0; //지점의 번호
	List<Edge> list = null; //하나의 Vertex에서 출발하는 Edge는 여러개일 수 있으므로 List에 담는다.
	
	public Vertex(int i) {
		this.spot = i;
		list = new ArrayList<Edge>();
	}
}

/*
	ArrayList : 기억공간적게쓰고 속도면에서 유리하다. 하지만 도중에 추가되고 삭제되는 것에 약하다.
	LinkedList : 기억공간 많이쓰고 속도가 느리다. 
*/


class RelatedList {
	private List<Vertex> list = null;
	
	public RelatedList() {
		list = new ArrayList<Vertex>();
	}
	
	public void add(int spot) {
		list.add(new Vertex(spot));
	}
	
	public void connect(int from, int to) {
		Vertex found = null;
		for (Vertex v : list) {
			if (v.spot == from) {
				found = v;
				break;
			}
		}
		/*
			각 Vertex는 edge의 list를 가지고있다.
			거기에 edge를 신규등록해주면
			연ㄹ결이 표현된다(그림참조)
		*/
		if (found!=null) {
			found.list.add(new Edge(to));
		}
		
	}
	
	public void print() {
		StringBuffer sb = new StringBuffer();
		
		for (Vertex v:list) {
			sb.append("[").append(v.spot).append("]");
			
			for(Edge e : v.list) {
				sb.append("[")
				.append(e.spot)
				.append(".")
				.append(e.distance)
				.append("]");
			}
			sb.append("\r\n"); //\r\n은 줄바꿈 표시
		}
		System.out.println(sb.toString());
	}
}

public class Test275 {
	public static void main (String[] args) {
		RelatedList rList = new RelatedList();
		rList.add(0);
		rList.add(1);
		rList.add(2);
		rList.add(3);
		rList.add(4);
		
		rList.connect(0, 1); //0과 1을 연결 
		rList.connect(0, 2);
		rList.connect(0, 4);
	
		rList.print();
	}
}

/*
	1000명 전교생에 대해서 페이스북 스러운 게시판을 만든다.
	그들의 인간관계를 그래프로 만드려면 1000*1000배열이 필요함
	친구가 30명이라고 가정하면 1이 30개 0이 970개가 필요함
	->이런 식이면 기억장소가 낭비된다는 느낌이 있다.
	->실전에서는 데이터 갯수가 많으면 배열대신 연관리스트가 필요

	-위의 코드 용어 정리-
	각 지점 : Vertex
	지점 고유명 : spot
	각 연결 : Edge(from, to, distance) ->시작지점, 끝지점 가중치가 필요, 하나의 Vertex에 여러개 존재함
	
*/