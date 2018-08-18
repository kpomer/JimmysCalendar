import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Jimmy's Calendar!\n");
        System.out.println("The purpose of this tool is to keep track of recurring events and deadlines.");

        CommandLine userInterface = new CommandLine();

        userInterface.running(); //When this is called, the entire program runs
    }
}
