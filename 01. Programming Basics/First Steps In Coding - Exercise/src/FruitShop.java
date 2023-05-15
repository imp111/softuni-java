import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananasWeight = Double.parseDouble(scanner.nextLine());
        double orangesWeight = Double.parseDouble(scanner.nextLine());
        double berriesWeight = Double.parseDouble(scanner.nextLine());
        double strawberryWeight = Double.parseDouble(scanner.nextLine());

        double berriesPrice = (strawberryPrice * 50) / 100;
        double orangesPrice = berriesPrice - (0.4 * berriesPrice);
        double bananasPrice = berriesPrice - (0.8 * berriesPrice);

        double berriesSum = berriesPrice * berriesWeight;
        double orangesSum = orangesPrice * orangesWeight;
        double bananasSum = bananasPrice * bananasWeight;
        double strawberriesSum = strawberryPrice * strawberryWeight;

        double sum = berriesSum + orangesSum + bananasSum + strawberriesSum;

        System.out.printf("%.2f", sum);
    }
}
