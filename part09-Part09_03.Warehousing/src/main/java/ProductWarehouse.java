public class ProductWarehouse extends Warehouse {
    private String name;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.name = productName;
    }

    public String getName() {
        return this.name;
    }


    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    /*  Returns the state of the object represented as a string like this Juice: balance = 64.5, space left 123.5 */
    public String toString(){
        return this.name + ": " + super.toString();

    }


}
