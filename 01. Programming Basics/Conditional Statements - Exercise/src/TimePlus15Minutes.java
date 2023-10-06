import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine()) + 15;

        if (minutes > 59) {
            minutes -= 60;
            hours++;
        }

        if (hours > 23 && minutes < 10) {
            System.out.printf("0:0%d", minutes);
        }
        else if (minutes < 10) {
            System.out.printf("%d:0%d", hours, minutes);
        }
        else if (hours > 23) {
            System.out.printf("0:%d", minutes);
        }
        else {
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}
