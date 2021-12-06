package banana;

import static banana.Logic.*;
import java.util.*;

/*	�������� ������ ǥ���ϱ� ���� Ŭ����. �ֹ��� ������ ������ ���� ( �׸����� )
	Vertex �� �޸� ����Ʈ��� �����ϸ� spot �� ��������, distance �� ����ġ�� ������ �� �ִ�
*/
class Edge {
	int spot = 0;		//  ������ ��������
	int distance = 1;	//	���������� �Ÿ�
	
	public Edge( int i ) { spot = i; }
	public Edge( int i, int d ) { spot = i; distance = d; }
}

class Vertex {
	int spot = 0;	//	���� �Ϸù�ȣ
	List<Edge> list = null;		// �ϳ��� Vertex ���� ����ϴ� Edge �� ������ �� �� �ִ�.
	
	public Vertex( int i ) {
		this.spot = i;
		list = new ArrayList<Edge>();
	}
}

/*
	ArrayList : ������ ���Ծ��� �ӵ� ������. �߰��߰��� ���� ������ �Ϳ� ���ϴ�. ( ����� �а� )
	LinkedList : �ӵ� ������ ������ ���� ����. �߰��߰��� ���� ������ �Ϳ� ���ϴ�.
*/
class RelatedList {
	private List<Vertex> list = null;
	
	public RelatedList() {
		list = new ArrayList<Vertex>();	 // �ӵ�����!!
	}
	
	//	return this; �� ����� ȿ�� : rList.add( 0 ).add( 1 ).add( 2 ).add( 3 ).add( 4 );
	public RelatedList add( int spot ) {
		list.add( new Vertex( spot ) );
		return this;
	}
	
	//	Vertex vx = rl.find( spot );
	public Vertex find( int spot ) {
		Vertex found = null;
		for( Vertex v : list ) {
			if( v.spot == spot ) {
				found = v;
				break;
			}
		}
		return found;
	}
	
	//	rList.connect( 0, 1 );
	public void connect( int from, int to ) {
		Vertex found = find( from );
		
		/*	�� Vertex �� edge �� list �� ������ �ִ�
			�ű⿡ edge �� �űԵ���� �ָ�
			������ ǥ���� �ȴ� ( �׸����� )
		*/
		if( found != null ) {
			found.list.add( new Edge( to ) );	
		}
	}

	public void print( boolean distNot ) {
		StringBuffer sb = new StringBuffer();
		
		for( Vertex v : list ) {
			sb.append("[").append( v.spot ).append("] ");
			
			for( Edge e : v.list ) {
				sb.append("[").append(e.spot);
				if( distNot == false ){
					sb.append(".").append(e.distance);
				}
				sb.append("]");
				
			}
			sb.append("\r\n");
		}
		
		System.out.println( sb.toString() );
	}
	
	public RelatedList connect2( int a, int b ) {
		connect( a, b );
		connect( b, a );
		return this;
	}
	
	public boolean[] newVisited() {
		return new boolean[ list.size() ];
	}
}

public class Test278 {
	public static void main( String[] args ) {
		RelatedList rList = new RelatedList();
		
		rList.add( 0 ).add( 1 ).add( 2 ).add( 3 ).add( 4 );
		
		rList.connect2( 0, 1 ).connect2( 0, 2 ).connect2( 0, 4 )
			.connect2( 1, 2 )
			.connect2( 2, 3 ).connect2( 2, 4 )
			.connect2( 3, 4 );
		
		rList.print( true );
		
		boolean[] visited = rList.newVisited();
		bfs( 3, visited, rList );
	}
}

class Logic {
	
	//	���ȣ�� �� ���� + ������ �ִ� �͵� �켱���� �湮�Ѵ� : ģ�� - ģģ�� ... �̷� ������ 
	public static void bfs( int spot, boolean[] visited, RelatedList rl ) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[spot] = true;
		queue.add( spot );
		
		while( queue.size() > 0 ) {
			int v = queue.remove(0);
			System.out.println( "visited : " + v );
			
			//	���� ��� 3�� �湮������ 3�� ���� ����� �͵��� ��� ť�� �־������.
			for( Edge e : rl.find( v ).list ) {
				if( visited[e.spot] == false ) {
					visited[e.spot] = true;
					queue.add( e.spot );
				}
				//	System.out.println( e.spot );
			}
		}
	}

	public static void dfs( int spot, boolean[] visited, RelatedList rl ) {
		visited[spot] = true;
		System.out.println( "visited : " + spot );
		
		Vertex vx = rl.find( spot );
		for( Edge e : vx.list ) {
			if( visited[e.spot] == false ) {
				dfs( e.spot , visited, rl );
			}
		}
	}
}
