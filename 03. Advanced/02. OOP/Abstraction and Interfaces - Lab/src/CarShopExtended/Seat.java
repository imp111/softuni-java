package CarShopExtended;

public class Seat extends CarImpl implements Car, Sellable {
    private Double price;
    public Seat(String model, String color, Integer horsePower, String countryProduced, double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %s tires\n%s sells for %s",
                this.getModel(),
                this.getCountryProduced(),
                this.tires,
                this.getModel(),
                this.getPrice());
    }
}
