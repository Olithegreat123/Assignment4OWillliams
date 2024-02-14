
import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        // Step 1: Welcome the user to the game
        System.out.println("Welcome to the DICE GAME!");

        // Step 2: Ask the user if they would like to play
        System.out.print("Would you like to play the dice game?\nType 'YES' or 'NO' and press <ENTER>: ");
        Scanner kbInput = new Scanner(System.in);
        String playChoice = kbInput.nextLine().trim().toLowerCase(); // Read user input and convert to lowercase

        // Step 2a: Input error check
        if (!playChoice.equals("yes") && !playChoice.equals("no")) {
            System.out.println("You entered an invalid choice. The program is EXITING... GOODBYE!");
            kbInput.close();
            return; // Exit the program
        }

        // Step 2b: If the user chooses not to play, exit the program
        if (playChoice.equals("no")) {
            System.out.println("The program is EXITING... GOODBYE!");
            kbInput.close();
            return; // Exit the program
        }

        // Step 2c: If the user chooses to play, proceed with the game
        System.out.println("LET'S PLAY!");

        // Step 2c.i: Ask the user what type of die they would like to roll
        System.out.print("What type of die would you like to roll?\n(d4, d6, d8, d10, d20, d100)\n");
        String dieType = kbInput.nextLine().trim().toLowerCase();

        // Step 2c.2: Use a switch statement for valid die types
        int diceRoll = -1;
        switch (dieType) {
            case "d4":
                diceRoll = new Random().nextInt(4) + 1;
                break;
            case "d6":
                diceRoll = new Random().nextInt(6) + 1;
                break;
            case "d8":
                diceRoll = new Random().nextInt(8) + 1;
                break;
            case "d10":
                diceRoll = new Random().nextInt(10) + 1;
                break;
            case "d20":
                diceRoll = new Random().nextInt(20) + 1;
                break;
            case "d100":
                diceRoll = new Random().nextInt(100) + 1;
                break;
            default:
                // Step 2c.2: Input error check for invalid die type
                System.out.println("You entered an invalid dice type! The program is EXITING... GOODBYE.");
                kbInput.close();
                return; // Exit the program
        }

        // Step 2c.3: Wait for the user to press ENTER to roll the die
        System.out.println("Press <ENTER> to roll your die.");
        kbInput.nextLine(); // Wait for the user to press ENTER

        // Step 2c.4: Print the roll result to the terminal
        System.out.println("You rolled a " + diceRoll + " on a " + dieType.toUpperCase() + ".");
        System.out.println("The program is EXITING... GOODBYE!");

        kbInput.close(); // Close the scanner
    }
}
