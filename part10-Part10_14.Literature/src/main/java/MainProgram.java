
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      List<Book> bookList = new ArrayList<>();

        while(true){
            String[] bookBuffer = new String[2];

            System.out.print("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            bookBuffer[0] = input;

            System.out.print("Input the age recommendation: ");
            bookBuffer[1] = scanner.nextLine();

            bookList.add(new Book(bookBuffer));
        }
        System.out.println(bookList.size() + " books in total.");

        Comparator<Book> comparator = Comparator
                .comparing(Book::getRecomendedAge)
                .thenComparing(Book::getName);

        Collections.sort(bookList, comparator);


        System.out.println("Books: ");
        bookList.forEach(System.out::println);
    }

}
