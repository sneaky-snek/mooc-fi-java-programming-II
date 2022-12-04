import java.util.ArrayList;

public class MisplacingBox extends Box{

    private ArrayList<Item> inside;

    public MisplacingBox(){
        inside = new ArrayList<>();
    }

    public void add(Item item) {
        inside.add(item);
    }


    public boolean isInBox(Item item) {
        return false;
    }
}
