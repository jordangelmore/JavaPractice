import b.e.P;

import java.util.Scanner;

/**
 * Created by Gundam 240sx on 6/27/2016.
 */
public class Phonebook {
    public static void main(String[] args) {
        final int people =5;
        String[] PhoneNmbers = new String[people];
        String[] name = new String[people];

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the name of the person ");

        for (int index =0; index<people; index++) {
            System.out.println("Name of person # " + (index + 1) + ":");
            PhoneNmbers[index] = keyboard.nextLine();

        }

        System.out.println("now try entering their phone number");
        for (int index =0; index < people; index ++){
            System.out.println("Phone number of person# " + (index +1) + ":");
            name[index] = keyboard.nextLine();
        }

            System.out.println("You enterred:");
        System.out.println("Name "+"\t"+"phone number");

            for(int index =0; index < people; index++)
                System.out.println(name[index]+"\t"+PhoneNmbers[index]);

        }
    }

