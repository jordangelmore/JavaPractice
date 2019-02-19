import clojure.lang.Fn;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Gundam 240sx on 6/18/2016.
 */
public class Student2 {
    public static void main(String[] args) throws IOException {

        int exam1, exam2, exam3;
        String filename = null, answer = null, Fname, Lname;
        double examAverage;


        exam1 = 0;
        exam2 = 0;
        exam3 = 0;
        examAverage = 0;


        Scanner keyboard = new Scanner(System.in);


        System.out.println("Enter the first name of the student");
        Fname = keyboard.nextLine();

        System.out.println("What is the last name of the student");
        Lname = keyboard.nextLine();

        System.out.println("What is exam 1 score?");
        exam1 = keyboard.nextInt();

        System.out.println("What is exam 2 score?");
        exam2 = keyboard.nextInt();

        System.out.println("What is exam 3 score?");
        exam3 = keyboard.nextInt();

        examAverage = (exam1 + exam2 + exam3) / 3;
        //calculation and input info done
        keyboard.nextLine();

        //Write to file
        System.out.println("Your data was saved to a file Studentinfo.txt");
        keyboard.nextLine();

        FileWriter fWriter = new FileWriter("Studentinfo.txt", true);
        PrintWriter outputfile = new PrintWriter(fWriter);

        outputfile.println("FirsName" + "\t" + "LastName" + "\t" + "exam1" + "\t" + "exam2" + "\t" + "Exam3" + "\t" + "ExamAverage");
        outputfile.println(Fname + "\t" + "\t" + Lname + "\t" + "\t" + exam1 + "\t" + "\t" + exam2 + "\t" + "\t" + exam3 + "\t" + "\t" + examAverage);

        System.out.println("Your exam average is " + examAverage);
        keyboard.nextLine();

        outputfile.close();
        keyboard.nextLine();

        System.out.println("Reading file Studentinfo.txt..." + "\n" + "press enter to continue");
        keyboard.nextLine();

        //open the file
        File file = new File("Studentinfo.txt");
        Scanner inputfile = new Scanner(file);

//read lines until none are left
        while (inputfile.hasNext()) {//read the next name
            String line = inputfile.nextLine();

            //display last name read
            System.out.println("Records show: " + line);
            //keyboard.nextLine();
        }

            if(examAverage >=90)
                System.out.println("Your letter grade is an A");
            else if (examAverage >=80)
                System.out.println("Your lettergrade is a B");
            else if (examAverage >=70)
                System.out.println("Your lettergrade is a C");
            else if (examAverage >=60)
                System.out.println("Your lettergrade is a D");
            else if(examAverage >= 0)
                System.out.println("Your lettergrade is a F");
            keyboard.nextLine();
            System.out.println("");

        inputfile.close();

    }



}
