
import java.util.ArrayList;

public class NumberStatistics {

    private int amountOfNumbers;
    private ArrayList<Integer> numbers;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.numbers = new ArrayList<Integer>();
    }

    public void addNumber(int number) {
        this.amountOfNumbers++;
        this.numbers.add(number);
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    public double average() {
        if (this.amountOfNumbers == 0) {
            return 0.0;
        }
        return (double) this.sum() / this.amountOfNumbers;
    }
}
