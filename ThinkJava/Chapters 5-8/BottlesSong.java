import java.util.Scanner;

public class BottlesSong {

    public static void songStarter(int n) {
        int x = n - 1;
        if (n >= 1 ) {
            System.out.println(n + " bottles of beer on the wall, ");
            System.out.println(n + " bottles of beer, ");
            System.out.println("ya’ take one down, ya’ pass it around, ");
            System.out.println(x +" bottles of beer on the wall." );
            songStarter(n - 1);
        } else {
            System.out.println("No bottles of beer on the wall, ");
            System.out.println("no bottles of beer, ");
            System.out.println("ya’ can’t take one down, ya’ can’t pass it around, ");
            System.out.println("’cause there are no more bottles of beer on the wall!");
        }
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number to start the song: ");
        int n = keyboard.nextInt();
        songStarter(n);

    }

}
