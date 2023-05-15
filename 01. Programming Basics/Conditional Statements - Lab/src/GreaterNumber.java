import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        if (first > second) {
            System.out.println(first);
        }
        else {
            System.out.println(second);
        }
    }
}
