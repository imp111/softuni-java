import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = scanner.nextDouble();
        int numberOfPuzzles = scanner.nextInt();
        int numberOfDolls = scanner.nextInt();
        int numberOfBears = scanner.nextInt();
        int numberOfMinions= scanner.nextInt();
        int numberOfTrucks = scanner.nextInt();

        double pricePuzzle = 2.60;
        double priceDoll = 3;
        double priceBear = 4.10;
        double priceMinion = 8.20;
        double priceTruck = 2;

        double sum = (numberOfPuzzles * pricePuzzle) + (numberOfDolls * priceDoll) + (numberOfBears * priceBear) + (numberOfMinions * priceMinion) + (numberOfTrucks * priceTruck);
        int numOfToys = numberOfDolls + numberOfBears + numberOfMinions + numberOfPuzzles + numberOfTrucks;

        double discount = 0;
        if (numOfToys >= 50) {
            discount = sum * 0.2;
        }

        double endPrice = sum - discount;
        double rent = endPrice * 0.1;
        double profit = endPrice - rent;

        double leftover = 0.0;
        if (profit > tripPrice) {
            leftover = profit - tripPrice;
            System.out.printf("Yes! %.2f left.", leftover);
        }
        else {
            leftover = tripPrice - profit;
            System.out.printf("Not enough money! %.2f lv. needed.", leftover);
        }
    }
}
