public class MethodPractice {

    public static void zool(int number, String first_pet, String street) {
        System.out.println(number);
        System.out.println("First Pet: " + first_pet);
        System.out.println("Street: " + street);
        System.out.println();
    }

    public static void printAmerican(String day, String month, int day_of_month, int year){
        System.out.println("American Format: ");
        System.out.print(day + ", ");
        System.out.print(month);
        System.out.print(" " + day_of_month + ",");
        System.out.print(" " + year);

    }

    /*
    European format:
    Thursday 16 July 2015

    American format:
    Tuesday 16 July 2015
    */

    public static void printEuropean(String day, int day_of_month, String month, int year){
        System.out.println("European Format: ");
        System.out.print(day + " ");
        System.out.print(day_of_month + " ");
        System.out.print(month + " ");
        System.out.print(year);

    }


    public static void main(String[] args){

        //data for zool method
        int number = 11;
        String first_pet = "Ella";
        String street = "Dakin";

        //calls zool method and passes data defined above
        zool(number,first_pet,street);


        //data for printAmerican and printEuropean methods
        String day = "Tuesday";
        String month = "February";
        int day_of_month = 19;
        int year = 2019;

        //calls printAmerican and printEuropean methods and passes data defined above
        printAmerican(day, month, day_of_month, year);
        printEuropean(day, day_of_month, month, year);

    }

}
