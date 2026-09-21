package A2_constructors;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt(String prompt) {
        System.out.print(prompt);
        int input = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character :)
        return input;
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        return input;
    }
}
