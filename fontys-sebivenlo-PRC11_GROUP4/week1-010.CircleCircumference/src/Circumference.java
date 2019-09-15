
import java.util.Scanner;

public class Circumference {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.next();
        System.out.println("Type your age: ");
        int age = Integer.parseInt(reader.next());
        //next name and age
        System.out.println("Type your name: ");
        String secondUsername = reader.next();
        System.out.println("Type your age: ");
        int secondUserAge = Integer.parseInt(reader.next());
        System.out.println(name + "and" + secondUsername + "are" + (age + secondUserAge) + "in total.");
    }
}
