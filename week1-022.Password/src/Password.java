
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String correctPassword = "carrot"; // Use carrot as password when running tests.
        System.out.println("Type the password: ");
        String inputPassword = reader.nextLine();
        while (!correctPassword.equals(inputPassword)) {
            System.out.println("Wrong!");
            System.out.println("Type the password: ");
            inputPassword = reader.nextLine();
        }
        System.out.println("Right!");
        System.out.println("The secret is: jryy qbar!");
    }
}
