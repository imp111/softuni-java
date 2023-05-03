import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int numberOfDays = Integer.parseInt(scanner.nextLine());

        int readingTime = numberOfPages / pagesPerHour;
        int pagesPerDay = readingTime / numberOfDays;

        System.out.printf("%d", pagesPerDay);
    }
}
