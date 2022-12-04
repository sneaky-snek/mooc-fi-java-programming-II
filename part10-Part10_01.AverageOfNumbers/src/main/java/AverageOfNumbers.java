
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();

        while(true){
            System.out.println("Add numbers, type \"end\" to stop ");
            System.out.print("> ");
            String input = scan.nextLine();
            if(input.equals("end")){
                break;
            }
            calc.add(Double.valueOf(input));
        }
        System.out.println("Average: " + calc.AverageOfNumbers());
    }
}
