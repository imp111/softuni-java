import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDogs = Integer.parseInt(scanner.nextLine());
        int numberOfAnimals = Integer.parseInt(scanner.nextLine());

        double priceDog = 2.50;
        double priceRest = 4;

        double sum = (numberOfDogs * priceDog) + (numberOfAnimals * priceRest);

        System.out.printf("%f lv.", sum);
    }
}
