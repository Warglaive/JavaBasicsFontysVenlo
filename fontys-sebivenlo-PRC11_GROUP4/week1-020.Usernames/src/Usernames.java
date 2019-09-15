
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String username = reader.nextLine();
        String password = reader.nextLine();
        if (username.equals("alex") && password.equals("mightyducks")
                || password.equals("cat") && username.equals("emily")) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
