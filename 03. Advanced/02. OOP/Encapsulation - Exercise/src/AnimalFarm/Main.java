package AnimalFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String chickenName = scanner.nextLine();
            int chickenAge = scanner.nextInt();

            Chicken chicken = new Chicken(chickenName, chickenAge);
            System.out.println(chicken.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}