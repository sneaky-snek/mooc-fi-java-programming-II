
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    }


    /* receives an ArrayList of integers, and returns the positive integers from the list. */
    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> output = numbers.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toList());
        return output;
    }


}
