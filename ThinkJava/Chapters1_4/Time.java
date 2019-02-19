import java.util.Scanner;

public class Time {

    public static void main(String[] args) {

        /*
        // Chapter 2
        String day; //Monday
        int date, year; //13
        String month; //February
        day = "Monday";
        date = 13;
        month = "February ";
        year = 2019;
        System.out.print(day);
        System.out.print(", ");
        System.out.print(month);
        System.out.print(date);
        System.out.print(", ");
        System.out.print(year);
        */


        // Chapter 3
        //System.out.println(System.out);
        //Scanner in = new Scanner(System.in);

        int inch;
        double cm;
        final double CM_PER_INCH = 2.54;

        Scanner in = new Scanner(System.in);
        System.out.print("How many inches? ");

        inch = in.nextInt();
        cm = CM_PER_INCH * inch;

        System.out.println("Inches = " + inch);
        System.out.println("Centimeters = " + cm);

        System.out.printf("Four thirds = %.3f\n", 4.0 / 3.0);

        int inch2 = 100;
        double cm2 = CM_PER_INCH * inch2;

        System.out.printf("%d in = %.2f cm \n", inch2, cm2);

        double pi = 3.14;
        double x = (int) pi * 20.0;

        System.out.println(x);

        double inch3 = (int) (cm / CM_PER_INCH);

        System.out.printf("%.1f cm = %.0f in", cm, inch3);

    }
}
