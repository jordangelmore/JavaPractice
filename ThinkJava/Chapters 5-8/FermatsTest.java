import java.util.Scanner;

public class FermatsTest {

    public static void checkFermat(int n, int a, int b, int c){

        if (n > 2 && (Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n))) {
            System.out.println("Holy Smokes! Fermat was wrong!");

            } else {
            System.out.println("Nope, that doesn't work");
        }


        }

    public static void main(String[] args){

        //Gather data for the test
        Scanner keyboard = new Scanner(System.in);
        System.out.println("We're going to check Fermat's test! ");
        System.out.print("Enter a number greater than 2: ");
        int n = keyboard.nextInt();
        System.out.print("Enter a: ");
        int a = keyboard.nextInt();
        System.out.print("Enter b: ");
        int b = keyboard.nextInt();
        int c = a + b;

        //calls FermetsTest method
        checkFermat(n,a,b,c);

    }
}
