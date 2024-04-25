package Telephony;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] elements = input.split(" ");

        List<String> numbers = new ArrayList<>(Arrays.asList(elements));

        input = scanner.nextLine();
        elements = input.split(" ");

        List<String> sites = new ArrayList<>(Arrays.asList(elements));

        Smartphone smartphone = new Smartphone(numbers, sites);
        String[] tokens = smartphone.call().split(" ");

        for (String number : tokens) {
            System.out.printf("Calling... %s%n", number);
        }

        tokens = smartphone.browse().split(" ");

        for (String url : tokens) {
            System.out.printf("Browsing... %s%n", url);
        }
    }
}
