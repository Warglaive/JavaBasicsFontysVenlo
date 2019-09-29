
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics allNumbersSum = new NumberStatistics();
        NumberStatistics evenNumbersSum = new NumberStatistics();
        NumberStatistics oddNumbersSum = new NumberStatistics();
        System.out.println("Type numbers: ");
        int num = Integer.parseInt(reader.next());
        while (num != -1) {
            allNumbersSum.addNumber(num);
            if (num % 2 == 0) {
                evenNumbersSum.addNumber(num);
            } else {
                oddNumbersSum.addNumber(num);
            }
            System.out.println("Type numbers: ");
            num = Integer.parseInt(reader.next());
        }
        System.out.println("Sum: " + allNumbersSum.sum());
        System.out.println("sum of even: " + evenNumbersSum.sum());
        System.out.println("Sumof odd: " + oddNumbersSum.sum());
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4
        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.
        // The tests does not work if you do not create the objects in the correct order
    }
}
