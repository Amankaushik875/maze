import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main extends JFrame {
            



       private int[][] maze = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1, 1, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 9, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };



        // tostore the coordenates to finsh
        ArrayList<Integer> al  = new ArrayList<>();
    public Main(){
        setTitle("Maze solver");
        setSize(640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dfs.searchPath(maze , 1, 1, al);
        System.out.println(al);
    }


        @Override
        public void paint(Graphics g) {
            g.translate(50,50);
            for(int i = 0; i < maze.length; i++){
                for(int j = 0; j < maze[0].length; j++){
                    Color color;
                    switch (maze[i][j]){
                        case 1: color = Color.BLACK;
                        break;
                        case 9 : color = Color.RED;
                        break;
                        default: color = Color.WHITE;
                    }
                   g.setColor(color);
                    g.fillRect(30*j , 30*i   , 30, 40);
                    g.setColor(Color.yellow);
                    g.drawRect(30*j,30*i,30,30);
                }
            }
            for(int i = 2; i < al.size(); i +=2){
                int alx = al.get(i);
                int aly = al.get(i+1);
                System.out.println("X coordenates "+alx);
                System.out.println("Y coordenates "+aly);

                g.setColor(Color.CYAN);
                g.fillRect(30*alx , 30*aly , 27 , 27        );
            }
        }

    public static void main(String[] args) {
        Main view = new Main();
        view.setVisible(true);
    }
    }
