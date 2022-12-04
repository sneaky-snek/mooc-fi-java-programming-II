import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> inside;

    public ShoppingCart(){
        inside = new HashMap<>();
    }

    public void add(String product, int price){
      if(inside.containsKey(product)){
          Item buffer = inside.get(product);
          buffer.increaseQuantity();
          inside.put(product, buffer);
      }else{
          Item toAdd = new Item(product, 1, price);
          inside.put(product, toAdd);
      }
    }

    public int price(){
        int output = 0;
        for(Item i: inside.values()){
            output += i.price();
        }
        return output;
    }

    public void print(){
        for(Item i: inside.values()){
            System.out.println(i);
        }
    }
}
