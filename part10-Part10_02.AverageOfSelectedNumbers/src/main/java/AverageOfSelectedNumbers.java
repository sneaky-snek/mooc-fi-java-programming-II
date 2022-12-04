
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true){
            String inp = scan.nextLine();
            if(inp.equals("end")){
                break;
            }
            inputs.add(inp);
        }
        System.out.print("Print the average of the negative numbers or the positive numbers? (n/p)");
        String select= scan.nextLine();

        if(select.equals("p")){
            System.out.println("Average of the positive numbers: " + avgPos(inputs));
        }
        if(select.equals("n")){
            System.out.print("Average of the positive numbers: " + avgNegative(inputs));
        }
    }

    public static double avgPos(ArrayList<String> input){
        double output = input.stream()
                .mapToDouble(s -> Double.valueOf(s))
                .filter(i -> i > 0)
                .average()
                .getAsDouble();
        return output;
    }

    public static double avgNegative(ArrayList<String> input){
        double output = input.stream()
                .mapToDouble(s -> Double.valueOf(s))
                .filter(i -> i < 0)
                .average()
                .getAsDouble();
        return output;
    }
}
