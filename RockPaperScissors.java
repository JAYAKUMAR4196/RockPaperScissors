import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Options for the game
        String[] options = {"Rock", "Paper", "Scissors"};

        // Game loop
        while (true) {
            // Display options to the user
            System.out.println("Choose an option:");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("0. Quit");

            // Get user choice
            System.out.print("Your choice: ");
            int userChoice = scanner.nextInt();

            // Check if the user wants to quit
            if (userChoice == 0) {
                System.out.println("Thanks for playing!");
                break;
            }

            // Validate user input
            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice! Please choose a valid option.");
                continue;
            }

            // Generate computer choice
            Random random = new Random();
            int computerChoice = random.nextInt(3) + 1;

            // Display choices
            System.out.println("You chose: " + options[userChoice - 1]);
            System.out.println("Computer chose: " + options[computerChoice - 1]);

            // Determine the result
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 1 && computerChoice == 3) || 
                       (userChoice == 2 && computerChoice == 1) || 
                       (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
