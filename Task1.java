import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        boolean playAgain = true;
        int totalScore = 0;

        while (playAgain) {
            System.out.println("Welcome to the Number Guessing Game!");
            int numberToGuess = r.nextInt(100) + 1; 
            int attempts = 0;
            int roundScore = 0;

            while (true) {
                attempts++;
                System.out.println("Attempt " + attempts + ": Enter your guess (between 1 and 100):");
                int userGuess = sc.nextInt();

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
                    roundScore = 10 - attempts; 
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try a higher number.");
                } else {
                    System.out.println("Too high! Try a lower number.");
                }

                if (attempts >= 10) {
                    System.out.println("Sorry, you've attempts are over. The correct number was " + numberToGuess);
                    break;
                }
            }

            totalScore += roundScore;

            System.out.println("Round Score: " + roundScore);
            System.out.println("Total Score: " + totalScore);

            System.out.println("Do you want to play again? (yes/no)");
            String playAgainResponse = sc.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
        }

        System.out.println("Thanks for playing! Your final score is: " + totalScore);
        sc.close();
    }
}