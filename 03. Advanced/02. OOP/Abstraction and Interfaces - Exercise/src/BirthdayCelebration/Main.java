package BirthdayCelebration;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<Citizen> citizens = new ArrayList<>();
        ArrayList<Pet> pets = new ArrayList<>();

        while (input.equalsIgnoreCase("end")) {
            String[] elements = input.split("/");
            String type = elements[0];

            switch (type.toLowerCase()) {
                case "robot":
                    new Robot(elements[1], elements[2]);
                    break;
                case "citizen":
                    citizens.add(new Citizen(elements[1], Integer.parseInt(elements[2]), elements[3], elements[4]));
                    break;
                case "pet":
                    pets.add(new Pet(elements[1], elements[2]));
                    break;
                default:
                    System.out.println("Invalid argument.");
                    break;
            }
            input = scanner.nextLine();
        }

        String birthdate = scanner.nextLine();

        for (Citizen citizen : citizens) {
            if (citizen.getBirthDate().endsWith(birthdate)) {
                System.out.println(citizen.getBirthDate());
            }
        }

        for (Pet pet : pets) {
            if (pet.getBirthDate().endsWith(birthdate)) {
                System.out.println(pet.getBirthDate());
            }
        }
    }
}
