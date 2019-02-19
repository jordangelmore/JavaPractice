import java.util.Scanner;

/**
 * Created by Gundam 240sx on 6/29/2016.
 */
public class PassArray {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 4;
        int[] numbers = new int [ARRAY_SIZE];

        getValues(numbers);

        System.out.println("Here are the numbers you entered: ");

        showArrays(numbers);
    }

    private static void getValues(int[] array)
    {Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a series of " + array.length + "numbers");

        for(int index =0;index<array.length; index++)
        {
            System.out.println("Enter number " + (index+1) + ": ");
            array[index] = keyboard.nextInt();
    }}


    public static void showArrays(int[]array){
        for(int index =0;index<array.length; index++){
            System.out.println(array[index] + " ");
        }
    }
}
