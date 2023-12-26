import ClassBox.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] input = new double[3];

        for (int i = 0; i < 3; i++) {
            input[i] = scanner.nextDouble();
        }

        Box newBox = new Box(input[0], input[1], input[2]);
        System.out.println("Surface Area - " + newBox.calculateSurfaceArea());
        System.out.println("Lateral Surface Area - " + newBox.calculateLateralSurfaceArea());
        System.out.println("Volume - " + newBox.calculateVolume());
    }
}