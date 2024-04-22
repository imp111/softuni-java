package BirthdayCelebration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        You will receive from the console an unknown amount of lines until the command "End" is received, each line will
//        contain information in one of the following formats "Citizen {name} {age} {id} {birthdate}" for citizens,
//                "Robot {model} {id}" for robots or "Pet {name} {birthdate}" for pets. After the end command on the
//        next line, you will receive a single number representing a specific year, your task is to print all birthdates (of both
//        citizens and pets) in that year in the format "{day}/{month}/{year}" (the order of printing doesn’t matter).

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (input.equalsIgnoreCase("end")) {
            String[] elements = input.split("/");

            input = scanner.nextLine();
        }

    }
}
