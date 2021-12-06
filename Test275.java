
//-----------------�� �ڵ� �ణ ��������. �ʱ⸸ �����ϰ� ������ 276���� �Ұ�0-----------------------

package banana;

import static banana.RelatedList.*;
import java.util.*;

/*
	Edge�� �������� ������ ǥ���ϱ� ���� Ŭ����. �ֹ��� ������ �����غ���
	Vertex�� ���� ����Ʈ��� �����ϸ� spot�� ��������, distance�� ����ġ
*/

class Edge {
	int spot = 0; //������ ��������
	int distance = 1; //���������� �Ÿ� (����ġ)
	
	public Edge(int i) {spot = i;}
	public Edge(int i, int d){spot = i; distance=d;}
}

class Vertex {
	int spot = 0; //������ ��ȣ
	List<Edge> list = null; //�ϳ��� Vertex���� ����ϴ� Edge�� �������� �� �����Ƿ� List�� ��´�.
	
	public Vertex(int i) {
		this.spot = i;
		list = new ArrayList<Edge>();
	}
}

/*
	ArrayList : ���������Ծ��� �ӵ��鿡�� �����ϴ�. ������ ���߿� �߰��ǰ� �����Ǵ� �Ϳ� ���ϴ�.
	LinkedList : ������ ���̾��� �ӵ��� ������. 
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
			�� Vertex�� edge�� list�� �������ִ�.
			�ű⿡ edge�� �űԵ�����ָ�
			�������� ǥ���ȴ�(�׸�����)
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
			sb.append("\r\n"); //\r\n�� �ٹٲ� ǥ��
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
		
		rList.connect(0, 1); //0�� 1�� ���� 
		rList.connect(0, 2);
		rList.connect(0, 4);
	
		rList.print();
	}
}

/*
	1000�� �������� ���ؼ� ���̽��� ������ �Խ����� �����.
	�׵��� �ΰ����踦 �׷����� ������� 1000*1000�迭�� �ʿ���
	ģ���� 30���̶�� �����ϸ� 1�� 30�� 0�� 970���� �ʿ���
	->�̷� ���̸� �����Ұ� ����ȴٴ� ������ �ִ�.
	->���������� ������ ������ ������ �迭��� ��������Ʈ�� �ʿ�

	-���� �ڵ� ��� ����-
	�� ���� : Vertex
	���� ������ : spot
	�� ���� : Edge(from, to, distance) ->��������, ������ ����ġ�� �ʿ�, �ϳ��� Vertex�� ������ ������
	
*/