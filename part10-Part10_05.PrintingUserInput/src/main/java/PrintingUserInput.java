
import java.util.ArrayList;
import java.util.Scanner;

/* Write a program that reads the user's input as strings. When the user inputs an empty string (only presses enter),
the input reading will be stopped and the program will print all the user inputs. */
public class PrintingUserInput {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while(true){
            String input = scan.nextLine();
            if(input.equals("")){
                break;
            }
            inputs.add(input);
        }

        inputs.stream()
                .forEach(string -> System.out.println(string));

    }
}
