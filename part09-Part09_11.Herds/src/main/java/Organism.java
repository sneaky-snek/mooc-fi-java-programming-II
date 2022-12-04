public class Organism implements Movable{
    private int y;
    private int x;

    public Organism(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }

    /* "x: 3; y: 6" */
    public String toString(){
        return "x: " + x + "; y: " + y;
    }
}
