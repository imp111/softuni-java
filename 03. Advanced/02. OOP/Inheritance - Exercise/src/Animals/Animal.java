package Animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    private void setName(String name) {
        if (name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        this.age = age;
    }

    protected void setGender(String gender) {
        if (gender.isBlank() || gender.isEmpty()) {
            throw new IllegalArgumentException("Gender cannot be null or empty");
        }

        this.gender = gender;
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public String produceSound() {
        return null;
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    public String information() {
        return String.format("%s %s %s", this.getName(), this.getAge(), this.getGender());
    }
}
