
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        for (int i = 1; i <= amount; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printWhitespaces(int size) {
        // 40.1
        for (int i = 1; i <= size; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printWhitespaces(size - i);
            printStars(i);
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        //First Half
//        printWhitespaces(height - 1);
//        printStars(1);
        int starsCounter = 1;
        for (int spacesCounter = 1; spacesCounter <= height; spacesCounter++) {
            printWhitespaces(height - spacesCounter);
            printStars(starsCounter);
            starsCounter += 2;
        }
        //second half
        for (int i = 0; i < 2; i++) {
            printWhitespaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        xmasTree(10);
        //System.out.println("---");
        // xmasTree(10);
    }
}
