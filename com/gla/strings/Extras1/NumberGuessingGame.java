package Extras1;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {

        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("Respond with: high, low, or correct");

        while (!guessedCorrectly) {
            int guess = generateGuess(low, high);
            System.out.println("\nComputer guesses: " + guess);

            String feedback = getUserFeedback();

            if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("🎉 Computer guessed the number correctly!");
                guessedCorrectly = true;
            } else {
                System.out.println("Invalid input. Please enter high, low, or correct.");
            }
        }

        sc.close();
    }

    // Function to generate a random guess within range
    public static int generateGuess(int low, int high) {
        return rand.nextInt(high - low + 1) + low;
    }

    // Function to receive feedback from user
    public static String getUserFeedback() {
        System.out.print("Is the guess high, low, or correct? ");
        return sc.nextLine();
    }
}
