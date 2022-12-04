import java.util.ArrayList;

public class Calculator {
    private final ArrayList<Double> inputs;

    public Calculator(){
        inputs = new ArrayList<>();
    }

    public void add(double boi){
        inputs.add(boi);
    }

    public double AverageOfNumbers(){
        double output = inputs.stream()
                .mapToDouble(num -> Double.valueOf(num))
                .average().getAsDouble();
        return output;
    }

}
