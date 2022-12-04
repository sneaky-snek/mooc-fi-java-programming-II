
import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> inside;

    public OneItemBox(){
        inside = new ArrayList<>();
    }

    public void add(Item item) {
        if(inside.size() == 0){
            inside.add(item);
        }
    }
    public boolean isInBox(Item item) {
       return(inside.contains(item));
    }
}
