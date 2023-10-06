import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<String> stack = new ArrayDeque<String>();
        String current = "";

        while (!input.equalsIgnoreCase("home")) {
            if (input.equalsIgnoreCase("back")) {
                if (stack.size() <= 1) {
                    System.out.println("no previous URLs");
                }
                else {
                    current = stack.peek();
                    System.out.println(current);
                }
            }
            else {
                stack.push(input);
                current = stack.peek();
                System.out.println(current);
            }

            input = scanner.nextLine();
        }
    }
}
