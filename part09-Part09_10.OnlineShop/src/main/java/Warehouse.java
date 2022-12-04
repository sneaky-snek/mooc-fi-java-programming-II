import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> products;
    private Map<String, Integer> stock;

    public Warehouse(){
        products = new HashMap<>();
        stock = new HashMap<>();
    }

    /* adds a product to the warehouse with the price and stock balance given as parameter */
    public void addProduct(String product, int price, int stock){
        products.put(product, price);
        this.stock.put(product, stock);
    }

    /* returns the price of the product. If the product hasn't been added to the warehouse, the method must return -99.*/
    public int price(String product){
        int output = -99;
        if(products.containsKey(product)){
            output = products.get(product);
        }
        return output;
    }

    /*returns the remaining stock of the product. If the product hasn't been added yet, the method must return 0.*/
    public int stock(String product){
        int output = 0;
        if(products.containsKey(product)){
            output = stock.get(product);
        }
        return output;
    }

    /*reduces the stock remaining for the product it received as a parameter by one, and returns true if there was stock
    remaining. If the product was not available in the warehouse the method returns false. A products stock can't go
    below zero. */
    public boolean take(String product){
        boolean output = false;
        if(products.containsKey(product)){
            int currentStock = stock.get(product);
            if(currentStock > 0){
                currentStock--;
                stock.put(product, currentStock);
                output = true;
            }
        }

        return output;
    }

    /* returns the names of the products in the warehouse as a Set */
    public Set<String> products(){
        Set<String> output = products.keySet();
        return output;
    }
}
