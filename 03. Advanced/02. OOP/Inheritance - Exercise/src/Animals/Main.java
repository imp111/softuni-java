package Animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String parameters = scanner.nextLine();

        while (!input.equalsIgnoreCase("beast!")) {
            String[] elements = parameters.split(" ");
            String name = elements[0];
            Integer age = Integer.parseInt(elements[1]);
            String gender = elements[2];

            switch (input.toLowerCase()) {
                case "cat":
                    if (gender.toLowerCase().equals("male")) {
                        Tomcat tomcat = new Tomcat(name, age, gender);
                        System.out.printf("%s\n%s\n%s\n", tomcat.toString(), tomcat.information(), tomcat.produceSound());
                        break;
                    }
                    else if (gender.toLowerCase().equals("female")) {
                        Kitten kitty = new Kitten(name, age, gender);
                        System.out.printf("%s\n%s\n%s\n", kitty.toString(), kitty.information(), kitty.produceSound());
                        break;
                    }
                case "dog":
                    Dog dog = new Dog(name, age, gender);
                    System.out.printf("%s\n%s\n%s\n", dog.toString(), dog.information(), dog.produceSound());
                    break;
                case "frog":
                    Frog frog = new Frog(name, age, gender);
                    System.out.printf("%s\n%s\n%s\n", frog.toString(), frog.information(), frog.produceSound());
                    break;
                default: break;
            }

            input = scanner.nextLine();
            parameters = scanner.nextLine();
        }
    }
}