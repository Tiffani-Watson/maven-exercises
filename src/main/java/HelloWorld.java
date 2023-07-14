import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class HelloWorld {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String isNumStr = "is a number.";
    private static final String isNotNumStr = "is not a number.";
    public static void main(String[] args) {
        System.out.print("Enter Something: ");
        String userInput = scanner.nextLine();
        System.out.printf("You Entered: %s%n", userInput);
        if(StringUtils.isNumeric(userInput)){
            System.out.printf("%s: %s%n", userInput, isNumStr);
        } else {
            System.out.printf("%s: %s%n", userInput , isNotNumStr);
        }

        System.out.printf("Flipped Case: %s%n", StringUtils.swapCase(userInput));
        System.out.printf("Reversed: %s%n", StringUtils.reverse(userInput));

    }
}