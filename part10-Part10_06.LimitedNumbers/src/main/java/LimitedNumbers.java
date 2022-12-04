
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while(true){
            String input = scan.nextLine();
            if(Integer.valueOf(input) < 0){
                break;
            }
            inputs.add(input);
        }

        inputs.stream()
                .mapToInt(Integer::valueOf)
                .filter(i -> i < 6)
                .forEach(value -> System.out.println(value));
    }
}
