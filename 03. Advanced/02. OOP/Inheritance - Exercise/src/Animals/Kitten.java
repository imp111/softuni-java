package Animals;

public class Kitten extends Cat {
    private static final String KITTEN_GENDER = "Female";

    public Kitten(String name, int age, String gender) {
        super(name, age, gender);
        super.setGender(KITTEN_GENDER);
    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}
