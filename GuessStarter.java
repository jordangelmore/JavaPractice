import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

    public static void main(String[] args) {

        //pick a random number
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int userNumber;
        int difference;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        userNumber = in.nextInt();
        System.out.printf("Your number: %d Random number: %d",userNumber, randomNumber);
        System.out.println();

        //Calculate Difference
        difference = userNumber - randomNumber;
        System.out.printf("Difference: %d", difference);


    }

}
