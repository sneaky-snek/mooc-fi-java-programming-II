import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here


//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//
//        MagicSquare square = new MagicSquare(matrix);
//
//        System.out.println(square.sumsOfRows());
//        System.out.println(square.sumsOfColumns());
//        System.out.println(square.sumsOfDiagonals());






        MagicSquareFactory magicSquare = new MagicSquareFactory();
        MagicSquare steve = magicSquare.createMagicSquare(5);


        System.out.println();
        System.out.println(steve);

        System.out.println("rows:" + steve.sumsOfRows());
        System.out.println("columns:" + steve.sumsOfColumns());
        System.out.println("diagonals:" + steve.sumsOfDiagonals());


    }
}
