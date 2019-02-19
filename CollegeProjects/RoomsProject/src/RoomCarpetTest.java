import java.util.Scanner;

/**
 * Created by Gundam 240sx on 4/4/2016.
 */
public class RoomCarpetTest {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);

        System.out.println("PLease enter the Length of the room");
        double length = keyboard.nextDouble();

        System.out.println("PLease enter the Width of the room");
        double Width = keyboard.nextDouble();

        System.out.println("PLease enter the price of Carpet per square foot");
        double CarpetPricePerSqft = keyboard.nextDouble();

        keyboard.close();

        RoomDimensions Dimensions = new RoomDimensions(length, Width);
        RoomCarpet RoomCarpet = new RoomCarpet(Dimensions, CarpetPricePerSqft);

        System.out.println(RoomCarpet);
    }
}
