
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guessCounter = 0;
        // program your solution here. Do not touch the above lines!
        while (true) {
            System.out.print("Guess a number: ");
            int number = Integer.parseInt(reader.next());
            guessCounter++;
            if (numberDrawn > number) {
                System.out.println("The number is greater, guesses made: " + guessCounter);
            } else if (numberDrawn < number) {
                System.out.println("The number is lesser, guesses made: " + guessCounter);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }
    // DO NOT MODIFY THIS!

    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
