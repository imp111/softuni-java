package AnimalFarm;

public class Chicken {
    private String name;
    private int age;
    private void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15");
        }

        this.age = age;
    }

    public Chicken(String name, int age) {
        setAge(age);
        setName(name);
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    private boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }

    private double calculateProductPerDay() {
        if (isBetween(this.age, 0, 5)) {
            return 2;
        } else if (isBetween(this.age, 6, 11)) {
            return 1;
        } else if (isBetween(this.age, 12, 15)) {
            return 0.75;
        }

        return 0.0;
    }

    @Override
    public String toString() {
        return "Chicken " + this.name +
                " (age " + this.age +
                ") can produce " +
                productPerDay() + " eggs per day.";
    }
}
