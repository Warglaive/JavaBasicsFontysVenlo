
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ObservationDb db = new ObservationDb();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("? ");
            String command = scanner.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            ExecuteCommand(command, db, scanner);
        }
    }

    private static void ExecuteCommand(String command, ObservationDb db, Scanner scanner) {
        if (command.equals("Add")) {
            //read arguments
            Bird bird = CreateBird(scanner);
            db.Add(bird);
        } else if (command.equals("Observation")) {
            System.out.print("What was observed:? ");
            String observedBirdName = scanner.nextLine();
            if (CheckBirdExistance(db, observedBirdName)) {
                db.Observation(observedBirdName);
            }
        } else if (command.equals("Statistics")) {
            for (Bird currentBird : db.Birds) {
                System.out.println(currentBird.FullName + ": " + currentBird.Count + " observations");
            }
        } else if (command.equals("Show")) {
            System.out.print("What?");
            String showBird = scanner.nextLine();
            for (Bird currentBird : db.Birds) {
                if (currentBird.Name.equals(showBird)) {
                    System.out.println(currentBird.FullName + ": " + currentBird.Count + " observations");
                    break;
                }
            }
        }
    }

    private static boolean CheckBirdExistance(ObservationDb db, String observedBirdName) {
        for (Bird bird : db.Birds) {
            if (bird.Name.equals(observedBirdName)) {
                return true;
            }
        }

        System.out.println("Is not a bird!");
        return false;
    }

    private static Bird CreateBird(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Latin Name: ");
        String latinName = scanner.nextLine();
        return new Bird(name, latinName);
    }
}
