package PlayersAndMonsters;

public class BladeKnight extends DarkKnight{
    public BladeKnight(String username, int age) {
        super(username, age);
    }

    public String toString() {
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getName(),
                this.getUsername(),
                this.getLevel());
    }
}
