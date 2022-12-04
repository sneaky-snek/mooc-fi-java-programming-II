import java.util.ArrayList;

public class Herd implements Movable{

    private final ArrayList<Movable> herd;

    public Herd(){
        herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable){
        herd.add(movable);
    }
    public void move(int dx, int dy) {
        for(Movable thing: herd){
            thing.move(dx,dy);
        }
    }
    public String toString(){
        String output = "";
        for(Movable thing: herd){
            output += thing +"\n";
        }
        return output;
    }
}
