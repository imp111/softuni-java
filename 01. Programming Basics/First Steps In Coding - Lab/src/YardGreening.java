import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scan.nextLine());
        double price1 = 7.61;
        double sale = 0.18;

        double d = squareMeters * price1;
        double b = d * sale;
        double s = d - b;

        System.out.println("The final price is: " + s + " lv.");
        System.out.println("The discount is: " + b + " lv.");
    }
}
