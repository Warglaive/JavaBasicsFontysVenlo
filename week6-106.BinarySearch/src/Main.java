
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Here you can test binary search
        //int[] array = {-3, 2, 3, 4, 7, 8, 12};
        int[] array = {-7, -3, 3, 7, 11, 15, 17, 21, 24, 28, 30};
        Scanner reader = new Scanner(System.in);

        System.out.print("Values of the array: " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
        if (result) {
            System.out.println("Value " + searchedValue + " is in the array");
        } else {
            System.out.println("Value " + searchedValue + " is not in the array");
        }
        // Print the binary search result here
    }
}
