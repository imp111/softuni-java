package Ferrari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String driversName = scanner.nextLine();

        Car ferrari = new Ferrari(driversName);
        System.out.print(ferrari.toString());
    }
}
