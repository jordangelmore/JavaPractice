import java.util.Scanner;

/**
 * Created by Gundam 240sx on 6/28/2016.
 */
public class CarpetdEMO {
    public static void main(String[] args) {

        double length;
        double width;
        double cost;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter da length: ");
        length = keyboard.nextDouble();

        System.out.println("enter width: ");
        width = keyboard.nextDouble();

        System.out.println("enter cost per square foot");
        cost = keyboard.nextDouble();

        RoomCarpet myRoomCarpet = new RoomCarpet(length, width, cost);

        System.out.println("length: " + myRoomCarpet.getLength());
        System.out.println("width: "+ myRoomCarpet.getWidth());
        System.out.println("cost: " + myRoomCarpet.getCarpetCost());
        System.out.println("total: " + myRoomCarpet.getTotalCost());

    }
}
