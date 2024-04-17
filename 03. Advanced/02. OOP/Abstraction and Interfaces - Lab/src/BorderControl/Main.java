package BorderControl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] elements = input.split(" ");
        ArrayList<Identifiable> list = new ArrayList<>();

        while (!input.equalsIgnoreCase("end")) {
            switch (elements.length) {
                case 2:
                    list.add(new Robot(elements[0], elements[1]));
                    break;
                case 3:
                    list.add(new Citizen(elements[0], Integer.parseInt(elements[1]), elements[2]));
                    break;
                default:
                    System.out.println("Incorrect number of arguments, should be 2 or 3");
                    break;
            }

            input = scanner.nextLine();
            elements = input.split(" ");
        }

        Integer fakeIdsDigit = scanner.nextInt();
        for (Identifiable obj : list) {
            String lastThreeDigits = "";
            for (int i = obj.getId().length() - 3; i < obj.getId().length(); i++) {
                String[] digit = obj.getId().split("");
                lastThreeDigits += digit[i];
            }

            if (Integer.parseInt(lastThreeDigits) == fakeIdsDigit) {
                System.out.println(obj.getId());
            }
        }
    }
}
