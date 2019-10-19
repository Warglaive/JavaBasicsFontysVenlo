
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallestNum = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < smallestNum) {
                smallestNum = i;
            }
        }
        return smallestNum;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallestNum = smallest(array);
        int smallestIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallestNum) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int startingIndex) {
        //make new array then find its smallest num then the index
        int[] newArr = new int[array.length - startingIndex];
        int secondCounter = 0;
        for (int i = startingIndex; i < array.length; i++) {
            newArr[secondCounter] = array[i];
            secondCounter++;
        }

        int smallestNum = smallest(newArr);
        int smallestIndex = startingIndex;
        for (int i = startingIndex; i < array.length; i++) {
            if (array[i] <= smallestNum) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int firstNum = Integer.MIN_VALUE;
        int secondNum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (i == index1) {
                firstNum = array[i];
            }
            if (i == index2) {
                secondNum = array[i];
            }
        }
        array[index1] = secondNum;
        array[index2] = firstNum;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestValue = indexOfTheSmallestStartingFrom(array, i);
        }
    }
}
