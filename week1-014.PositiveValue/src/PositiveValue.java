
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.next());
        if (num <= 0) {
            System.out.println("The number is not positive.");
            return;
        }

        System.out.println("The number is positive.");

    }
}
