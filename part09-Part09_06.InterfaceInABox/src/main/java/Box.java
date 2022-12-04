import java.util.ArrayList;
public class Box implements Packable {
    private final double capacity;
    private final ArrayList<Packable> boxed;


    public Box(double capacity) {
        this.capacity = capacity;
        boxed = new ArrayList<>();
    }

    public void add(Packable item){
        if(item.weight() + weight() <= capacity){
            boxed.add(item);

        }
    }

    public double weight(){
        double output = 0;
        for(Packable i: boxed){
            output += i.weight();
        }
     return output;
    }

    // Box: 6 items, total weight 4.0 kg
    public String toString(){
        return "Box: " + boxed.size() + " items, total weight " + weight() + " kg";
    }
}
