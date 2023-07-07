import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Something: ");
        String input = scanner.nextLine();

        System.out.println("You Entered: \"" + input + "\"");

        if (StringUtils.isNumeric(input)) {
            System.out.println("\"" + input + "\" is a number");
        }
    }
}
