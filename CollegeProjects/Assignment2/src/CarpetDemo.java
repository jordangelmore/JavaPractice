import java.awt.geom.Area;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Gundam 240sx on 6/28/2016.
 */
public class CarpetDemo
{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Enter the length: ");
        double length = keyboard.nextDouble();

        System.out.println("Enter the width: ");
        double width = keyboard.nextDouble();

        System.out.println("Enter the price per square feet for the carpeting: ");
        double carpetCost1 = keyboard.nextDouble();

        keyboard.close();

        RoomDimesion dimensions = new RoomDimesion(length, width);
        RoomCarpet RC = new RoomCarpet(carpetCost1, dimensions);

        PrintWriter outputfile = new PrintWriter("file.txt");
        outputfile.println(RC);
        outputfile.close();




        System.out.println("Cost of dah is " + RC);

    }
}
