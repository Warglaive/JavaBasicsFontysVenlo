
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = Integer.parseInt(reader.next());
        if (age < 18) {
            System.out.println("You have not reached the age of majority yet!");
            return;
        }
        System.out.println("You have reached the age of majority!");
    }
}
