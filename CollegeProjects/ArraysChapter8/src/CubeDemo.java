import java.util.Scanner;

/**
 * Created by Gundam 240sx on 6/28/2016.
 */
public class CubeDemo {
    public static void main(String[] args) {
        double length;
        double width;
        double heihgt;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the following " +
        "dimensions of the cube");
        System.out.println("Length: ");
        length = keyboard.nextDouble();

        System.out.println("Width: ");
        width = keyboard.nextDouble();

        System.out.println("Height: ");
        heihgt = keyboard.nextDouble();

        //create a cube object and pass the dimensions to the constructor

        Cube myCube = new Cube(length, width, heihgt);

        //display proerties
        System.out.println("length: " + myCube.getLength());
        System.out.println("width: " + myCube.getWidth());
        System.out.println("height:" + myCube.getHieght());
        System.out.println("Area: " + myCube.getArea());
        System.out.println("Surfac Area: "+ myCube.getSrufaceArea());
        System.out.println("Volume: " + myCube.getVolume());

    }
}
