import java.util.Scanner;

/*
Converts centimeters into inches and feet
cm -> inch -> foot
 */

public class Convert {

    public static void main(String[] args) {

        int inches, feet, remainder;
        double cm;
        final double CM_PER_INCH = 2.54;
        final int INCH_PER_FOOT = 12;

        Scanner in = new Scanner(System.in);

        //prompts the user to enter in # of CM
        System.out.print("How many CM? ");
        cm = in.nextDouble();

        //convert cm to inches and feet
        inches = (int) (cm / CM_PER_INCH);
        feet = inches / INCH_PER_FOOT;
        remainder = inches % INCH_PER_FOOT;
        System.out.printf("Feet, inches of Centimeters: %d ft, %d in \n", feet, remainder);
        System.out.printf("Centimeters Entered: %.2f", cm);

    }

}
