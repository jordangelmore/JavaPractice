import java.util.Scanner;

public class SquareRootFinder {

    public static double squareRoot(double a) {
        double x0 = a/2;
        double x1 = (x0 + a/x0) /2;
        while ((Math.abs(x0) - Math.abs(Math.sqrt(a)) > 0.0001) && ((Math.abs(x1) - Math.abs(Math.sqrt(a))) > 0.0001)) {
            System.out.println("x0: " + x0);
            System.out.println("x1: " + x1);
            x0 = x1;
            x1 = (x0 + a/x0) /2;
        }
        System.out.println("finished! x0: " + x0);
        System.out.println("finished! x1: " + x1);
        System.out.println("Square root: " + Math.sqrt(a));
        return x1;
    }

    public static void CheckDouble(Scanner keyboard){
        while (!keyboard.hasNextDouble()) {
            String word = keyboard.next();
            System.out.println(word + " is not a number");
        }
        double a = keyboard.nextDouble();
        System.out.printf("Calculated square root: %.1f",squareRoot(a));
    }

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number to get the square root: ");
        CheckDouble(keyboard);

    }
}
