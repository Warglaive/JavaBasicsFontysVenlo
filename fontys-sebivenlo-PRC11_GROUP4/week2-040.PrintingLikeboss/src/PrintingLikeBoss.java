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
        for (int i = 1; i <= height + 2; i++) {
            printWhitespaces(height - i);
            printStars(i);
        }
 
    }
 
    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        xmasTree(4);
        //System.out.println("---");
        // xmasTree(10);
    }
}