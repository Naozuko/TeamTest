//File attempts to do something but is erroring. What am I missing?
//Insert 1 line of code below this comment to fix this file.

public class InputHelper {
    private static Scanner scanner = new Scanner(System.in);

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
