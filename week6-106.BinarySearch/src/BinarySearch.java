
public class BinarySearch {

    public static boolean search(int[] array, int searchedValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            if (array[middleIndex] == searchedValue) {
                return true;
            } else if (array[middleIndex] < searchedValue) {
                startIndex = middleIndex + 1;
            } else if (array[middleIndex] > searchedValue) {
                //startIndex = 0;
                endIndex = middleIndex - 1;
            }
            // restrict the search area 
        }
        return false;
    }
}
