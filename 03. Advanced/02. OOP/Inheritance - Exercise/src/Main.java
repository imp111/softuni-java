import Person.Child;
import PlayersAndMonsters.Elf;
import PlayersAndMonsters.Hero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Pussy Slayer", 10);
        Elf elf = new Elf("Pussy Destroyer", 20);

        System.out.println(hero.toString());
        System.out.println(elf.toString());
    }
}