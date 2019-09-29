
import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        if (text.equals("") || text.length() == 1) {
            return true;
        }
        for (int i = 0; i < text.length(); i++) {
            char firstLetter = text.charAt(i);
            for (int j = text.length() - 1 - i; j >= 0; j--) {
                char lastLetter = text.charAt(j);
                if (firstLetter == lastLetter) {
                    if (i == text.length() / 2) {
                        return true;
                    }
                    break;
                } else {
                    return false;
                }
            }
        }
        return false;

//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(text);
//        String reversedString = stringBuilder.reverse().toString();
//        if (reversedString.equals(text)) {
//            return true;
//        }
        //return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
