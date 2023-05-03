import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int w = scanner.nextInt();
        int area = l * w;

        System.out.println(area);
    }
}
