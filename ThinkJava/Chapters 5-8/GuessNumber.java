import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

    public static void guessNumber(int userGuess, int randomGuess) {
        if (userGuess > randomGuess) {
            System.out.print("Too high! Guess again: ");
            Scanner keyboard = new Scanner(System.in);
            userGuess = keyboard.nextInt();
            guessNumber(userGuess, randomGuess);
        } else if (userGuess < randomGuess) {
            System.out.print("Too low! Guess again: ");
            Scanner keyboard = new Scanner(System.in);
            userGuess = keyboard.nextInt();
            guessNumber(userGuess, randomGuess);
        } else {
            System.out.println("You guessed correct! ");
            System.out.printf("Your guess: %d Random Number: %d", userGuess, randomGuess);
        }

    }

    public static void main(String[] args) {

        //pick a random number
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int userNumber;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        userNumber = in.nextInt();
        
        //passes userNumber, randomNumber to guessNumber method
        guessNumber(userNumber, randomNumber);


    }

}
