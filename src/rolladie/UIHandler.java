package rolladie;

import java.util.Scanner;

public class UIHandler {
    private final Scanner scanner = new Scanner(System.in);

    public void printFeedback(MessageType messageType, String message) {
        System.out.println("\t" + messageType.toString() + ":\t" + message);
    }

    public String getUserInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
