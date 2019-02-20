import java.util.Scanner;

public class MathDistance {

    //distance = sqrt( (x2 - x1)^2 + (y2 - y1)^2 )

    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt((dx * dx + dy * dy));
    }

    public static double calculateArea(double radius) {
        //double sqrdRadius = radius * radius
        //return (Math.PI * sqrdRadius);
        return (Math.PI *(radius * radius));
    }

    public static double circleArea(double cx, double cy, double px, double py) {
        //double radius = distance(cx, cy, px, py);
        //double area = calculateArea(radius);
        //System.out.println("Circle Area: " + area);
        //return area;
        return calculateArea(distance(cx,cy,px,py));
    }


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("We're going to calculate the distance between two points!");
        System.out.print("Enter x1: ");
        double x1 = keyboard.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = keyboard.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = keyboard.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = keyboard.nextDouble();

        System.out.println(distance(x1,y1,x2,y2));

        System.out.print("Please enter the radius to calculate the area: ");
        double radius = keyboard.nextDouble();

        System.out.println(calculateArea(radius));

        //Use enters a center point and a perimeter point
        System.out.println("Now we're going to calculate the area from a center and perimeter point!");
        System.out.print("Enter center x: ");
        double cx = keyboard.nextDouble();
        System.out.print("Enter center y: ");
        double cy = keyboard.nextDouble();
        System.out.print("Enter perimeter x: ");
        double px = keyboard.nextDouble();
        System.out.print("Enter perimeter y: ");
        double py = keyboard.nextDouble();
        System.out.println(circleArea(cx,cy,px,py));

    }
}
