package FoodStorage;

public class Citizen implements Buyer, Identifiable, Person {
    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food;

    public Citizen(String name, int age, String id, String birthDate, int food) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
        this.food = food;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }
}
