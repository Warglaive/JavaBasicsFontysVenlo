
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> allScores = new ArrayList<Integer>();
        allScores = Read(scanner);
        ArrayList<Integer> starsCounts = PrintDragesAndTakeStarsCounts(allScores);
        double accepted = starsCounts.get(0);
        double total = starsCounts.get(1);
        double result = 100 * accepted / total;
        System.out.println("Acceptance percentage: " + result);
        //7 out of 8(because of zeros) = 100*7 = 700/all = 700/starsCount=result(87.5)
    }

    public static ArrayList<Integer> Read(Scanner scanner) {
        ArrayList<Integer> allScores = new ArrayList<Integer>();
        System.out.println("Type exam scores, -1 completes:");
        int input = Integer.parseInt(scanner.next());

        while (input > -1) {
            allScores.add(input);
            input = Integer.parseInt(scanner.next());
        }
        return allScores;
    }

    public static ArrayList<Integer> PrintDragesAndTakeStarsCounts(ArrayList<Integer> allScores) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        String gradeZero = "0: ";
        String gradeOne = "1: ";
        String gradeTwo = "2: ";
        String gradeThree = "3: ";
        String gradeFour = "4: ";
        String gradeFive = "5: ";
        int totalStarsCounter = 0;
        int acceptedStarsCounter = 0;
        for (Integer score : allScores) {
            if (score <= 29) {
                gradeZero += "*";
                totalStarsCounter++;
            } else if (score >= 30 && score <= 34) {
                gradeOne += "*";
                acceptedStarsCounter++;
                totalStarsCounter++;
            } else if (score >= 35 && score <= 39) {
                gradeTwo += "*";
                acceptedStarsCounter++;
                totalStarsCounter++;
            } else if (score >= 40 && score <= 44) {
                gradeThree += "*";
                acceptedStarsCounter++;
                totalStarsCounter++;
            } else if (score >= 45 && score <= 49) {
                gradeFour += "*";
                acceptedStarsCounter++;
                totalStarsCounter++;
            } else if (score >= 50 && score <= 60) {
                gradeFive += "*";
                acceptedStarsCounter++;
                totalStarsCounter++;
            }
        }
        System.out.println("Grade distribution:");
        System.out.println(gradeFive);
        System.out.println(gradeFour);
        System.out.println(gradeThree);
        System.out.println(gradeTwo);
        System.out.println(gradeOne);
        System.out.println(gradeZero);
        
        result.add(0, acceptedStarsCounter);
        result.add(1, totalStarsCounter);
        return result;
    }
}
