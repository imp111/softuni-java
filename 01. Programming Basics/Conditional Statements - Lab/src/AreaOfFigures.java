import java.awt.*;
import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        // square 25.000 rectangle 17.500 circle 113.097 triangle 45

        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        Integer num1 = scanner.nextInt();
        Integer num2 = 0;

        switch (figure.toLowerCase()) {
            case "square":
                System.out.printf("%.3f", num1 * num1);
                break;
            case "rectangle":
                num2 = scanner.nextInt();
                System.out.printf("%.3f", num1 * num2);
                break;
            case "circle":
                System.out.printf("%.3f", num1 * num1 * Math.PI);
                break;
            case "triangle":
                num2 = scanner.nextInt();
                System.out.printf("%.3f", (num1 * num2) / 2);
                break;
            default:
                break;
        }
    }
}
