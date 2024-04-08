package PlayersAndMonsters;

public class DarkWizard extends Wizard {
    public DarkWizard(String username, int age) {
        super(username, age);
    }

    public String toString() {
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getName(),
                this.getUsername(),
                this.getLevel());
    }
}
