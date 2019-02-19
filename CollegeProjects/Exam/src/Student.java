import clojure.lang.IFn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Gundam 240sx on 6/17/2016.
 */
public class Student {
    public static void main(String[] args) throws IOException {

        double exam1, exam2, exam3, examAverage;
        int noOfStudents;
        String filename = null, answer, Fname = null, Lname = null;

        exam1 =0;
        exam2 = 0;
        exam3 =0;
        examAverage = 0;
      noOfStudents=0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Would you like to add a student?");
        answer = keyboard.nextLine();

        while(answer.equalsIgnoreCase("yes")) {
            System.out.println("What is your first Name?");
            Fname = keyboard.nextLine();

            System.out.println("What is your last name?");
            Lname = keyboard.nextLine();

            System.out.println("what was your exam 1 grade?");
            exam1 = keyboard.nextDouble();

            System.out.println("what was your exam 2 grade?");
            exam2 = keyboard.nextDouble();

            System.out.println("what was your exam 3 grade?");
            exam3 = keyboard.nextDouble();

            examAverage = (exam1 + exam2 + exam3) / 3.0;
            noOfStudents++;

            System.out.println("youur average is " + examAverage);
            keyboard.nextLine();

            System.out.println("Would you like to add a student?");
                answer = keyboard.nextLine();}

        }
/*
        System.out.println("Enter the name of the file you want to add");
        filename = keyboard.nextLine();
        FileWriter fwriter = new FileWriter(filename, true);
        PrintWriter outputfile = new PrintWriter(fwriter);


            outputfile.println(Fname + "\t" + "\t" + Lname + "\t" + "\t" + exam1 + "\t" +  exam2 + "\t" + exam3 + "\t");

        outputfile.close();
        System.out.println("Your data has been saved");
        keyboard.nextLine();
        //get the file
       // System.out.println("Enter the filename you want to read");
        //String readfile = keyboard.nextLine();
        //open the file
        File file = new File("Studentinfo.txt");
        Scanner inputFile = new Scanner(file);

        //read the lines from the file until there are no more left.
        while (inputFile.hasNext())
        {
            //read the next name
            String friendName = inputFile.nextLine();

            // display the last name read.
            System.out.println(friendName);
        }

        //clsoe the file
        inputFile.close();
    }*/


}
