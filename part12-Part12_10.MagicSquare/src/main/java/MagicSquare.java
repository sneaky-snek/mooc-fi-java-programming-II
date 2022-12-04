
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

//    public MagicSquare(int[][] array) {
//        this.square = array;
//    }


    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> sum = new ArrayList<>();

        for (int row = 0; row < square.length; row++) {
            int rowSum = 0;
            for (int column = 0; column < square[row].length; column++) {
                rowSum += square[row][column];
            }
            sum.add(rowSum);
        }

        return sum;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < square[0].length; i++) {
            output.add(0);
        }
        for (int row = 0; row < square.length; row++) {
            for (int column = 0; column < square[row].length; column++) {
                output.set(column, output.get(column) + square[row][column]);
            }

        }

        return output;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> output = new ArrayList<>();
        output.add(0);
        output.add(0);

        for (int i = 0; i < square.length; i++) {
            output.set(0, output.get(0) + square[i][i]);
        }

        int i = 0;
        for (int last = square.length - 1; last >= 0; last--) {
            output.set(1, output.get(1) + square[i][last]);
            i++;
        }


        return output;
    }


    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return -1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
