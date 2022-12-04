
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
        int[] numbers = {8, -2, 3, 1, 1};
        System.out.println(sum(numbers, 0, numbers.length, 0, 999));

    }

    /*calculate the sum of the elements in the array between the lower and the upper limits. Only numbers smaller or
     equal to the int largest and larger or equal to the int smallest are added to the sum.*/
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest){
        int sum = 0;
        if(fromWhere < 0){
            fromWhere = 0;
        }
        if(toWhere > array.length){
            toWhere = array[array.length -1];
        }
        for(int i = fromWhere; i < toWhere; i++){
         if(array[i] >= smallest && array[i] <= largest){
             sum += array[i];
         }
        }
        return  sum;
    }

}
