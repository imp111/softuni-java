import java.util.Scanner;

public class CalculatorDeposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int depositWindow = Integer.parseInt(scanner.nextLine());
        double earlyPercent = Double.parseDouble(scanner.nextLine());

        double interest = (depositSum * earlyPercent) / 100;
        double interestPerMonth = interest / 12;
        double sum = depositSum + (depositWindow * interestPerMonth);

        System.out.printf("%.2f", sum);
    }
}
