package PlayersAndMonsters;

public class Wizard extends Hero {
    public Wizard(String username, int level) {
        super(username, level);
    }

    public String toString() {
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getName(),
                this.getUsername(),
                this.getLevel());
    }
}
