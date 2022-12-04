import java.sql.SQLOutput;

public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        history = new ChangeHistory();
        this.addToWarehouse(initialBalance);

    }

    public String history(){
        return history.toString();
    }

    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());

    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount){
        double output = super.takeFromWarehouse(amount);
        history.add(super.getBalance());
        return output;
    }
}
