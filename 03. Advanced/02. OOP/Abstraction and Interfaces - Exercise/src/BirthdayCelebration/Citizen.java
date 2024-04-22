package BirthdayCelebration;

import MultipleImplementation.Birthable;
import MultipleImplementation.Identifiable;

public class Citizen implements Identifiable, Birthable {
    private String name;
    private int age;
    private String id;
    private String birthdate;

    public Citizen(String name, int age, String id, String birthdate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthdate = birthdate;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String getBirthDate() {
        return this.birthdate;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
