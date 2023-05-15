import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        int volume = length * width * height;
        double liters = volume * 0.001;
        percentage *= 0.01;

        double litersNeeded = liters * (1 - percentage);
        System.out.printf("%.2f", litersNeeded);
    }
}