package banana;

import static banana.Logic.*;

class Node
{
	//	balance factor
	public int bf = 0;
	
	/*    �� ���α׷������� ��/�쿡 null �ƴ� nill �� ����.
	 *     ���� ���̴� �⺻�� 1�� �ȴ�. 0 ���� �ϳ� �ö󼭰� �Ǵϱ�
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

	//    height ����� �������� ���� null ��� nill �� ����Ѵ�.		
	public synchronized static Node nill() {
		if( nill == null ) {
			///	nill = new Node( 0 );
			nill = new Node( null );
			nill.height = 0;    //    nill �� �׳� �ٿ��ִ� ��Ʈ. ���� ���̴� ����.
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
           
            //    �� �������� height / bf �� �ʿ��� ��� �����Ѵ�.
            update( visit );
            return rebalance( visit );
        }
    }
   
    /*    bf �� ���� -2, 2 �϶� ���뷱���� �ӿ��ϴ�.
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
            else    //    �� ���� ����. ���� ��� nill() �ƴҶ��� ó��
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

//    bf , height �� �����ϴ� update ����

public class AVLTest
{
    /*    3 2 1 �� �־����� -2 -1 0 �� bf �� ������� �Ѵ�.
     *     visit.bf = visit.left.height - visit.right.height; �ڵ��� ���� ������ �߿��� ����
     *
     */
    public static void main(String[] args)
    {
		/*
        //    remove �׽�Ʈ        
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

        //    LR ���̽� �׽�Ʈ��        
        AVLTree tree = new AVLTree();
        tree.insert( "3" );
        tree.insert( "1" );
        tree.insert( "2" );
        tree.printAll();

	/*
        //    LL ���̽� �׽�Ʈ��
        AVLTree tree2 = new AVLTree();
        tree2.insert( 3 );
        tree2.insert( 2 );
        tree2.insert( 1 );
        tree2.printAll();
		
        //    RR ���̽� �׽�Ʈ��		
        AVLTree tree3 = new AVLTree();
        tree3.insert( 1 );
        tree3.insert( 2 );
        tree3.insert( 3 );
        tree3.printAll();

		//    RL ���̽� �׽�Ʈ��		
        AVLTree tree4 = new AVLTree();
        tree4.insert( 1 );
        tree4.insert( 3 );
        tree4.insert( 2 );
        tree4.printAll();
	*/
    }
}
/*	Ʈ���� �����͸� �Է��ϴ� ���� ������ ���� / ū �� �������� ��Ģ�� �ǰ��ؼ�
    Ʈ���� �� �� ������ ������ �Ǵ� ���� ���� �߻��Ѵ�. 

	�̷� Ʈ���� �������� �����ϴ� ��� ? �װ��� �����̼��̾��� .
	'����� �Ǵ��Ͽ� �����̼��� ��Ű�� �� �ƴ϶� Ʈ���� �˾Ƽ� �����̼� ��Ű�� Ʈ��' > AVLTree �̴�.
	
	Ʈ���� � �����Ͱ� ���� �� �𸣴µ�, ũ�� �������� ȿ���� ��������.
	�׷��� �ڵ����� ������ ��� ����� Ʈ���� ���������� �� ����ϰ� ���δ�.
*/