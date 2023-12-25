package ValidationData;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("Names must be at least 3 symbols");
        }

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Names must be at least 3 symbols");
        }

        this.lastName = lastName;
    }

    private void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }

        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary can't less than 460 leva");
        }

        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary (double percentage) {
        if (this.getAge() < 30) {
            this.setSalary((this.getSalary() + (this.getSalary() * percentage / 200)));
        }
        else {
            this.setSalary(this.getSalary() + (this.getSalary() * percentage / 100));
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva.",
                this.getFirstName(),
                this.getLastName(),
                this.getSalary());
    }
}