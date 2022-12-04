package title;

import javafx.application.Application;
import title.UserTitle;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert desired title: ");
        String title = scan.nextLine();

        Application.launch(UserTitle.class,
                "--userTitle=" + title
                );
    }

}
