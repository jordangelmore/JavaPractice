import java.util.Scanner;
/*
trick is to go from hours to seconds. 3600 seconds in an hour
 */
public class Time2 {

    public static void main(String[] args){

        double temp_seconds;
        int seconds;
        int minutes;
        int hours;

        //Prompts user for seconds
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        temp_seconds = in.nextDouble();
        in.nextLine();

        //Calculate time

        hours = (int) temp_seconds / 3600; //5000 - 3600 = 1 hr
        seconds = (int) temp_seconds % 3600; //5000 % 3600 = 1400 seconds remaining (this is needed to calculate minutes
        // without having minutes exceed 60
        minutes = seconds / 60; //1400 seconds remaining  / 60 = 23.333 minutes which int rounds to 23
        seconds = seconds % 60; //1400 % 60 = 20 seconds remaining

        //Display hours, minutes seconds
        /*
        System.out.print(seconds + " seconds = ");
        System.out.print(hours + " hours ");
        System.out.print(totalMinutes + " minutes");
        */

        System.out.printf("%.0f Seconds = %d hours, %d minutes, %d seconds", temp_seconds, hours, minutes, seconds);

    }
}
