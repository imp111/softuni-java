import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roomRent = Integer.parseInt(scanner.nextLine());

        double cakePrice = (roomRent * 20) / 100;
        double drinksPrice = cakePrice - ((cakePrice * 45) / 100);
        double animatorPrice = roomRent / 3;

        double sum = roomRent + cakePrice + drinksPrice + animatorPrice;
        System.out.printf("%.1f", sum);
    }
}
