
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private final int bottomBorder = 1;
    private final int upperBorder = 40;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        Random randomNumGenerator = new Random();
        for (int i = 0; i < 7; i++) {
            int number = randomNumGenerator.nextInt(this.upperBorder);
            if (number == 0) {
                number++;
            }
            while (this.containsNumber(number)) {
                number = randomNumGenerator.nextInt(this.upperBorder);
                if (number == 0) {
                    number++;
                }
            }
            this.numbers.add(number);

            // Write the number drawing here using the method containsNumber()
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        }
        return false;
    }
}
