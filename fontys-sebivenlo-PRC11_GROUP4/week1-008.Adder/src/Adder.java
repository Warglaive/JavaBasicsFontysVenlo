
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        System.out.println("Type a number: ");
        Scanner reader = new Scanner(System.in);
        int firstDigit = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int lastDigit = Integer.parseInt(reader.nextLine());
        int result = firstDigit + lastDigit;
        System.out.println("Sum of the numbers: ");
        System.out.println(result);
        // Implement your program here. Remember to ask the input from user
    }
}
