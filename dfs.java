import java.util.ArrayList;

public class dfs {
    public static boolean searchPath(int [][]maze , int x, int y , ArrayList<Integer> al){
    if(maze[y][x] == 9){
        al.add(x);
        al.add(y);
        return true;
    }
    if(maze[y][x] == 0){
        maze[y][x] = 2;
        int dx = -1;
        int dy = 0;
        if(searchPath(maze , x+dx , y+dy , al)){
            al.add(x);
            al.add(y);
            return true;
        }
        dx = 1;
        dy = 0;
        if(searchPath(maze , x+dx , y+dy , al)){
            al.add(x);
            al.add(y);
            return true;
        }
        dx = 0;
        dy = -1;
        if(searchPath(maze , x+dx, y+dy, al)){
            al.add(x);
            al.add(y);
            return true;
        }
        dx = 0;
        dy = 1;
        if(searchPath(maze , x+dx , y+dy , al)){
            al.add(x);
            al.add(y);
            return true;
        }
    }
    return false;



    }
}
