import java.util.Scanner;

/**
 * Created by Gundam 240sx on 6/23/2016.
 */
public class PayArray {
    public static void main(String[] args) {
        final int EMPLOYEES =5;
        double payRate = 10;
        double grossPay;

        int[] hours = new int[EMPLOYEES];
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the hours worked by " + EMPLOYEES
                             + "employees who all earn " +
                            "the same hourly rate");

        for(int index =0; index< EMPLOYEES; index++){
            System.out.println("Employee #" + (index +1) + ": ");
            hours[index] = keyboard.nextInt();
        }

        System.out.println("Heree is employees gross ppay:");
        for(int index =0; index< EMPLOYEES; index++){
            grossPay=hours[index] * payRate;

            System.out.println("Emplyee #" + (index +1 + ": $" + grossPay));
        }

    }
}
