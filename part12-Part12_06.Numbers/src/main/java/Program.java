
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rng = new Random();

        System.out.println("How many random numbers should be printed?");
        int target = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < target; i++){
            System.out.println(rng.nextInt(11));
        }
    }

}
