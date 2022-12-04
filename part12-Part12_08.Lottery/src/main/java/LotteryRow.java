
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random rng;
    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        rng = new Random();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        for (int i = 0; numbers.size() < 7; i++){
            int random = rng.nextInt(40) + 1;
            if(!(containsNumber(random))){
                numbers.add(random);
            }
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}

