import java.util.Scanner;

public class WeatherConverter {

    public static void main(String[] args) {

        double Celsius;
        double Fahrenheit;
        double CelsiusMult;
        final double CELSIUS_MULT = 1.8;
        final int CELSIUS_ADD = 32;
        Scanner in = new Scanner(System.in);

        //User Enters Celsius
        System.out.print("Enter Celsius: ");
        Celsius = in.nextDouble();
        in.nextLine();

        CelsiusMult = Celsius * CELSIUS_MULT;
        Fahrenheit = CelsiusMult + CELSIUS_ADD;

        System.out.printf("%.1f C = %.1f F", Celsius, Fahrenheit);

    }
}
