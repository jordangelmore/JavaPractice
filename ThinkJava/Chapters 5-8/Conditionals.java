import java.util.Scanner;

public class Conditionals {

    public static void printLogarithm(double x){
        if (x <= 0.0) {
            System.err.println("Error: x must be positive");
            return;
        }
        double result = Math.log(x);
        System.out.println("The log of x is " + result);

    }

    public static void scanDouble(Scanner keyboard){
        System.out.print("Enter a number: ");
        if (!keyboard.hasNextDouble()) {
            String word = keyboard.next();
            System.err.println(word + " is not a number");
            return;
        }
        double x = keyboard.nextDouble();
        printLogarithm(x);

    }

    public static void countdown(int n) {
        if (n == 0){
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    public static void nLines(int number_of_lines) {
        if (number_of_lines > 0) {
            System.out.println();
            nLines(number_of_lines - 1);
        }
    }

    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value/2);
            System.out.print(value % 2);
        }

    }

    public static void main(String[] args){

        /*
        boolean flag; //declaration
        flag = true; //assignment
        boolean testResult = false; //both
        boolean evenFlag = (n % 2 == 0);
        boolean positiveFlag = (x > 0);

        if (evenFlag) {
            System.out.println("Number is positive");
        }

        if (!evenFlag){
            System.out.println("Number is negative");
        }
        */

        Scanner keyboard = new Scanner(System.in); //Just need to define scanner once
        scanDouble(keyboard);

        System.out.print("Enter in another number: ");
        int n = keyboard.nextInt(); //n is defined for countdown method
        countdown(n);

        System.out.print("Enter the number of lines you would like to print: ");
        int number_of_lines = keyboard.nextInt();
        nLines(number_of_lines);

        System.out.print("Enter a number to be converted to binary: ");
        int number = keyboard.nextInt();
        displayBinary(number);

    }

}

