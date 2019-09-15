
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        double firstNum = Double.parseDouble(reader.next());
        System.out.println("Type another number: ");
        double lastNum = Double.parseDouble(reader.next());
        double result = firstNum / lastNum;
        System.out.println("Division: " + firstNum + "/" + lastNum + "=" + result);
        // Implement your program here. Remember to ask the input from user.
    }
}
