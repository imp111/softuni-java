import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        int numberOfBakers = Integer.parseInt(scanner.nextLine());
        int numberOfCakes = Integer.parseInt(scanner.nextLine());
        int numberOfWaffles = Integer.parseInt(scanner.nextLine());
        int numberOfPancakes = Integer.parseInt(scanner.nextLine());

        double cakePrice = 45;
        double wafflePrice = 5.80;
        double pancakePrice = 3.20;

        double cakeSum = numberOfCakes * cakePrice;
        double waffleSum = numberOfWaffles * wafflePrice;
        double pancakeSum = numberOfPancakes * pancakePrice;

        double bakersSumPerDay = (cakeSum + waffleSum + pancakeSum) * numberOfBakers;
        double sumForWholeCampaign = bakersSumPerDay * numberOfDays;
        double sum = sumForWholeCampaign - (sumForWholeCampaign / 8);

        System.out.printf("%.2f", sum);
    }
}
