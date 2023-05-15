import java.util.Scanner;

public class GuessThePassword {
    public static void main(String[] args) {
        String password = "s3cr3t!P@ssw0rd";
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input == password) {
            System.out.printf("Welcome");
        }
        else {
            System.out.printf("Wrong password!");
        }
    }
}
