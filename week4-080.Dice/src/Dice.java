
import java.util.Random;

public class Dice {

    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        random = new Random();
        this.numberOfSides = numberOfSides;
        // Initialize here the number of sides
    }

    public int roll() {
        // create here a random number belongig to range 1-numberOfSided
        int result = random.nextInt(this.numberOfSides);
//        while (result < 1) {
//            result = random.nextInt(this.numberOfSides);
//        }
//      return result;
        return result + 1;
    }
}
