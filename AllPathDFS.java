package banana;

import static banana.Logic.*;
import java.util.*;

public class AllPathDFS {
    public static void main( String[] args ) {
        int[][] map = {
            { 0, 2, 5, 1, 0, 0 },
            { 2, 0, 3, 2, 0, 0 },
            { 5, 3, 0, 3, 1, 5 },
            { 1, 2, 3, 0, 1, 0 },
            { 0, 0, 1, 1, 0, 2 },
            { 0, 0, 5, 0, 2, 0 }
        };
       
        boolean[] visited = new boolean[6];
        List<Integer> stack = new LinkedList<Integer>();
        dfs_AllPath( 0, 4, stack, visited, map );
    }
}

class Logic
{
    public static void dfs_AllPath( int v, int goal, List<Integer> stack,
        boolean[] visited, int[][] map )
    {
        visited[v] = true;
        stack.add( v );

        if( v == goal ) {
            StringBuffer sb = new StringBuffer();
            for( int p : stack ) {
                sb.append( p ).append(" ");
            }
            System.out.println( sb.toString() );
        }

        for( int i = 0 ; i < map[v].length ; i++ ) {
            if( map[v][i] != 0 && !visited[i] ) {
                dfs_AllPath( i, goal, stack, visited, map );
                visited[i] = false;
            }
        }
        stack.remove( stack.size()-1 );
    }

    public static void dfs( int v, boolean[] visited, int[][] map ) {
        visited[v] = true;
        System.out.println( "visited :" + v );

        for( int i = 0 ; i < map[v].length ; i++ ) {
            if( map[v][i] != 0 && !visited[i] ) {
                dfs( i, visited, map );
            }
        }
    }

    public static void printVisited( boolean[] visited ) {
        StringBuffer sb = new StringBuffer();
        sb.append("[ ");
        for( int i = 0 ; i < visited.length ; i++ ) {
            if( visited[i] ) {
                sb.append("O ");
            } else {
                sb.append("X ");
            }
        }
        sb.append("]");
        System.out.println( sb.toString() );
       
    }
}
