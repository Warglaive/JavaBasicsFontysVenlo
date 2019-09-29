
import java.util.Random;

public class PasswordRandomizer {
    // Define the variables

    private int passwordLength;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passwordLength = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        Random random = new Random();
        String result = "";
        String alphabet = "";
        for (int i = 0; i < this.passwordLength; i++) {
            for (char j = 'a'; j <= 'z'; j++) {
                alphabet += j;
            }
            int randomNum = random.nextInt(alphabet.length());
            result += alphabet.charAt(randomNum);
        }
        return result;
    }
}
