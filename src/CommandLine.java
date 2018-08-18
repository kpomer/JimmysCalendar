import java.util.Calendar;
import java.util.Scanner;

public class CommandLine {

    private Scanner input = new Scanner(System.in);

    private boolean flag = true;

    private Calendar jimsCal = new Calendar() {
        @Override
        protected void computeTime() {

        }

        @Override
        protected void computeFields() {

        }

        @Override
        public void add(int field, int amount) {

        }

        @Override
        public void roll(int field, boolean up) {

        }

        @Override
        public int getMinimum(int field) {
            return 0;
        }

        @Override
        public int getMaximum(int field) {
            return 0;
        }

        @Override
        public int getGreatestMinimum(int field) {
            return 0;
        }

        @Override
        public int getLeastMaximum(int field) {
            return 0;
        }
    };

    //This program will run in a while loop based on the flag boolean value while program is working
    public int running(){
        System.out.println("Please select an option from the following list:\n");

        printOptions();

        //Create the while loop here that ends on user saying '0'

        return 0;
    }

    private void printOptions(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1 - Add Entry to Calendar");
        System.out.println("2 - Delete Existing Calendar Entry");
        System.out.println("3 - View a Date");
        System.out.println("4 - View a Range of Dates");
        System.out.println("5 - View All Entries");
        System.out.println("\n0 - Quit");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
