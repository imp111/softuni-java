import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<String>();
        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("home")) {

            input = scanner.nextLine();
        }
    }
}
