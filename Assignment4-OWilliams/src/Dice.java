
import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        // Welcome the user to the game
        System.out.println("Welcome to the Dice Game!");

        // Ask the user if they would like to play
        System.out.print("Would you like to play? Type 'YES' or 'NO': ");
        Scanner scanner = new Scanner(System.in);
        String playChoice = scanner.nextLine().trim().toLowerCase();

        // Input error check
        if (!playChoice.equals("yes")) {
            System.out.println(" Invalid input...Goodbye!");
            scanner.close();
            return;
        }

        // Proceed with the game
        System.out.println("LET'S PLAY!");

        // Ask the user what type of die they would like to roll
        System.out.print("What type of die would you like to roll? (d4, d6, d8, d10, d20, d100): ");
        String dieType = scanner.nextLine().trim().toLowerCase();

        // Use a switch statement for valid die types
        int maxRoll = 0;
        switch (dieType) {
            case "d4": maxRoll = 4; break;
            case "d6": maxRoll = 6; break;
            case "d8": maxRoll = 8; break;
            case "d10": maxRoll = 10; break;
            case "d20": maxRoll = 20; break;
            case "d100": maxRoll = 100; break;
            default:
                System.out.println("Invalid die type! Goodbye.");
                scanner.close();
                return;
        }

        // Wait for the user to press ENTER to roll the die
        System.out.println("Press <ENTER> to roll your die.");
        scanner.nextLine(); // Wait for the user to press ENTER

        // Print the roll result to the terminal
        int diceRoll = new Random().nextInt(maxRoll) + 1;
        System.out.println("You rolled a " + diceRoll + " on a " + dieType.toUpperCase() + ".");
        System.out.println("Goodbye!");

        scanner.close(); // Close the scanner
    }
}
