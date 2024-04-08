package PlayersAndMonsters;

public class MuseElf extends Elf {
    public MuseElf(String username, int age) {
        super(username, age);
    }

    public String toString() {
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getName(),
                this.getUsername(),
                this.getLevel());
    }
}
