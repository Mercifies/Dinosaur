import java.util.ArrayList;

public class Grid {


    private int fore[][]; //foreground layer grid
    private int back[][]; //background layer grid
    ArrayList<Terrain> objs = new ArrayList<Terrain>(); //list of all Terrain blocks in play
    ArrayList<Enemy> enems = new ArrayList<Enemy>(); //list of all enemies in play
    public Grid(){
        fore=new int[GameEngine.DEFAULT_WINDOWSIZEY/10+40][GameEngine.DEFAULT_WINDOWSIZEX/10+100];
        back=new int[GameEngine.DEFAULT_WINDOWSIZEY/10+40][GameEngine.DEFAULT_WINDOWSIZEX/10+100];
    }
    public int[][] getBack(){
        return back;
    }
    public int[][] getFore(){
        return fore;
    }
    public void clear(int a[][]){
        for(int y=0;y<a.length;y++)
            for(int x=0;x<a[y].length;x++)
                a[y][x]=0;
    }
}
