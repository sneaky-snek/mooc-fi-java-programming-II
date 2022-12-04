

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private final int capacity;
    private int current;
    private final ArrayList<Item>inside;


    public BoxWithMaxWeight(int capacity){
        inside = new ArrayList<>();
        this.capacity = capacity;
        this.current = 0;
    }

    public void add(Item item){
        if(item.getWeight() + current <= capacity){
            inside.add(item);
            current += item.getWeight();
        }
    }


    public boolean isInBox(Item item) {
        return (inside.contains(item));
    }
}
