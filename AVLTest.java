package banana;

import static banana.Logic.*;

class Node
{
	//	balance factor
	public int bf = 0;
	
	/*    이 프로그램에서는 좌/우에 null 아닌 nill 을 쓴다.
	 *     따라서 높이는 기본이 1이 된다. 0 위에 하나 올라서게 되니깐
	 */
	public int height = 1;
   
	/// public int banana = 0;
	public String banana = null;
	
	public Node left  = null;
	public Node right = null;
   
	///	public Node( int id ) { banana = id; }
	public Node( String id ) { banana = id; }
   
	public String toString() {
		return "{"+banana+"}[h:"+height+"](bf:"+bf+")";
	}
}

class Logic {
    public static boolean isValid( int i ) {
        return i >= 0 ;
    }
	
    public static int compareTo( int one, int two ) {
        return ( one - two );
    }
	
    public static int compareTo( String one, String two ) {
        return ( one.compareTo(two) );
    }
	
    public static boolean isValid( String i ) {
        return i != null ;
    }    
    
	private static Node nill = null;

	//    height 계산의 용이함을 위해 null 대신 nill 을 사용한다.		
	public synchronized static Node nill() {
		if( nill == null ) {
			///	nill = new Node( 0 );
			nill = new Node( null );
			nill.height = 0;    //    nill 은 그냥 붙여주는 노트. 따라서 높이는 없다.
		}
		return nill;
	}
}

class AVLTree
{
    public Node root = null;

    private int count = 0;
    public int size() {
        return count;
    }
   
    public AVLTree () {
        root = nill();
    }

    ///	public boolean insert( int banana ) {
    public boolean insert( String banana ) {
        if( !isValid( banana ) ) {
            return false;
        }
   
        if( !contains( banana ) ) {
            root = _insert( root, banana );    
            count++;
            return true;
        }
        return false;
    }
   
    ///	private Node _insert( Node visit, int banana ) {
    private Node _insert( Node visit, String banana ) {
        if( visit == nill() )
        {
            Node t = new Node( banana );
            t.left  = nill();
            t.right = nill();
            return t;    
        }
        else
        {
            int cmp = compareTo( banana, visit.banana );
            if( cmp < 0 ) {
                visit.left = _insert( visit.left, banana );
            } else if( cmp > 0 ) {
                visit.right = _insert( visit.right, banana );
            } else {
				throw new RuntimeException("Data Duplicated");
			}
           
            //    이 시점에서 height / bf 를 필요한 경우 수정한다.
            update( visit );
            return rebalance( visit );
        }
    }
   
    /*    bf 가 각각 -2, 2 일때 리밸런싱이 팰요하다.
     */
    public Node rebalance( Node visit )
    {
        if( visit.bf == -2 ) {
            if( visit.left.bf < 0 ) {
                return caseLL( visit );
            }
            else {
                return caseLR( visit );
            }
        }
        else if ( visit.bf == 2 ) {
            if( visit.right.bf > 0 ) {
                return caseRR( visit );
            }
            else {
                return caseRL( visit );
            }
        }
        return visit;
    }
   
    private Node caseLL( Node visit ) {
        return rotationR( visit );
    }

    private Node caseRR( Node visit ) {
        return rotationL( visit );
    }
   
    private Node caseLR( Node visit ) {
        visit.left = rotationL( visit.left );
        return caseLL( visit );
    }    
   
    private Node caseRL( Node visit ) {
        visit.right = rotationR( visit.right );
        return caseRR( visit );
    }    

    private Node rotationL( Node visit )
    {
        Node root = visit.right;
        visit.right = root.left;
        root.left = visit;

        update( visit );
        update( root );
        return root;
    }
       
    private Node rotationR( Node visit )
    {
        Node root = visit.left;
        visit.left = root.right;
        root.right = visit;

        update( visit );
        update( root );
        return root;
    }
   
    private void update( Node visit )
    {
        visit.height = Math.max( visit.left.height, visit.right.height ) + 1;
        visit.bf = visit.right.height - visit.left.height;
    }
   
    public void printAll() {
		System.out.println( "" );
        _printAll( root, 0 );
    }
   
    private void _printAll( Node visit, int d ) {
        if( visit != nill() )
        {
			StringBuffer sb = new StringBuffer();
			for( int i = 0 ; i < d ; i++ ) {
				sb.append("  ");
			}
			sb.append( visit.toString() );
			
			if( visit.left != nill() ) {
				sb.append( " L{"+visit.left.banana+"}" );
			}
			if( visit.right != nill() ) {
				sb.append( " R{"+visit.right.banana+"}" );
			}
            System.out.println( sb.toString() );
            
			_printAll( visit.left, d+1 );
            _printAll( visit.right, d+1 );    
        }
    }
   
    ///	public boolean contains( int banana ) {
    public boolean contains( String banana ) {
        return _contains( root, banana );
    }
   
    ///	private boolean _contains( Node visit, int banana ) {
    private boolean _contains( Node visit, String banana ) {
        if( visit != nill() )
        {
            int cmp = compareTo( banana, visit.banana );
            if( cmp == 0 ) {
                return true;
            }
            else if( cmp < 0 ) {
                return _contains( visit.left, banana );
            }
            else {    
                return _contains( visit.right, banana );
            }
        }
        return false;
    }
   
    ///	public Node remove( int banana ) {
    public Node remove( String banana ) {
        if( !isValid( banana ) ) {
            return null;
        }
       
        if( contains( banana ) ) {
            Node found = _remove( root, banana );
            count--;
            return found;
        }
        return null;
    }
   
    ///	private Node _remove( Node visit, int banana ) {
    private Node _remove( Node visit, String banana ) {
        if( visit == nill() ) {
            return null;            
        }
       
        int cmp = compareTo( banana, visit.banana );
        if( cmp < 0 ) {
            visit.left  = _remove( visit.left , banana );
        }
        else if( cmp > 0 ) {
            visit.right = _remove( visit.right , banana );
        }
        else
        {
            if( visit.left == nill() ) {
                return visit.right;
            }
            else if( visit.right == nill() ) {
                return visit.left;
            }
            else    //    잘 돌아 간다. 양쪽 모두 nill() 아닐때의 처리
            {
                if( visit.left.height > visit.right.height ) 
				{
                    ///	int banana2 = find_max( visit.left );
                    String banana2 = find_max( visit.left );
                    visit.banana = banana2;
                    visit.left = _remove( visit.left, banana2 );
                }
                else 
				{
                    ///	int banana2 = find_min( visit.right );
                    String banana2 = find_min( visit.right );
                    visit.banana = banana2;
                    visit.right = _remove( visit.right, banana2 );
                }
            }
        }
        update( visit );
        return visit;
    }
   
    ///	private int find_min( Node visit ) {
    private String find_min( Node visit ) {
        while( visit.left != nill() ) {
            visit = visit.left;
        }
        return visit.banana;
    }
   
    ///	private int find_max( Node visit ) {
    private String find_max( Node visit ) {
        while( visit.right != nill() ) {
            visit = visit.right;
        }
        return visit.banana;
    }    
}

//    bf , height 재 구성하는 update 점검

public class AVLTest
{
    /*    3 2 1 로 넣었을때 -2 -1 0 의 bf 가 얻어져야 한다.
     *     visit.bf = visit.left.height - visit.right.height; 코드의 빼는 순서가 중요한 이유
     *
     */
    public static void main(String[] args)
    {
		/*
        //    remove 테스트        
        AVLTree tree = new AVLTree();
        tree.insert( "09" );
        tree.insert( "15" );
        tree.insert( "20" );
        tree.insert( "08" );
        tree.insert( "07" );
        tree.insert( "13" );
        tree.insert( "10" );
       
        tree.remove( "08" );
        tree.remove( "20" );
        tree.remove( "07" );
        tree.remove( "13" );
               
        tree.printAll();
		*/

        //    LR 케이스 테스트용        
        AVLTree tree = new AVLTree();
        tree.insert( "3" );
        tree.insert( "1" );
        tree.insert( "2" );
        tree.printAll();

	/*
        //    LL 케이스 테스트용
        AVLTree tree2 = new AVLTree();
        tree2.insert( 3 );
        tree2.insert( 2 );
        tree2.insert( 1 );
        tree2.printAll();
		
        //    RR 케이스 테스트용		
        AVLTree tree3 = new AVLTree();
        tree3.insert( 1 );
        tree3.insert( 2 );
        tree3.insert( 3 );
        tree3.printAll();

		//    RL 케이스 테스트용		
        AVLTree tree4 = new AVLTree();
        tree4.insert( 1 );
        tree4.insert( 3 );
        tree4.insert( 2 );
        tree4.printAll();
	*/
    }
}
/*	트리에 데이터를 입력하다 보면 작은값 왼쪽 / 큰 값 오른쪽의 원칙에 의거해서
    트리의 좌 우 균형이 깨지게 되는 일은 흔히 발생한다. 

	이런 트리의 기울어짐을 보정하는 방법 ? 그것이 로테이션이었다 .
	'사람이 판단하여 로테이션을 시키는 게 아니라 트리가 알아서 로테이션 시키는 트리' > AVLTree 이다.
	
	트리는 어떤 데이터가 들어올 지 모르는데, 크게 기울어지면 효율이 떨어진다.
	그래서 자동으로 균형을 잡게 만드는 트리가 실전에서는 꽤 쏠쏠하게 쓰인다.
*/