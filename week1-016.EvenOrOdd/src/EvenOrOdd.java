
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.next());
        if (num%2==0) {
            System.out.println("Number " + num + " is even");
            return;
        }
        System.out.println("Number " + num + " is odd");
    }
}
