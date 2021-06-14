import java.util.Scanner;

public class TutorialRunner {

    enum Choice{PLAIN, NAME}

    public static void main(String args[]) {
        Choice myChoice = Choice.NAME;

        if (myChoice == Choice.PLAIN) {
            System.out.println("hello world");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is your name?");
            String my_name = scanner.next();

            System.out.println("Hello, " + my_name);
        }
    }
}
