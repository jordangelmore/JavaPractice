import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Gundam 240sx on 6/29/2016.
 */
public class ArraysandFiles {
    public static void main(String[] args) throws FileNotFoundException {
        int[] numbers ={10,20,40,30,50};

        PrintWriter outputfile = new PrintWriter("Values.txt");

        for(int index=0; index<numbers.length; index++) {
            outputfile.println(numbers[index]);
            outputfile.close();
        }

            final int SIZE = 5;
            numbers = new int[SIZE];
            int index =0;

        File file = new File("values.txt");
        Scanner inputfile = new Scanner(file);

        while(inputfile.hasNext() && index < numbers.length){
            numbers[index] = inputfile.nextInt();
            index++;
        }
        inputfile.close();
    }
}
