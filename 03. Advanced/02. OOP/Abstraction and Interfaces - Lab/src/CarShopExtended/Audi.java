package CarShopExtended;

public class Audi extends CarImpl implements Car, Rentable {
    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %s tires\nMinimum rental period of %s days. Price per day %s",
                this.getModel(),
                this.getCountryProduced(),
                this.tires,
                this.getMinRentDay(),
                this.getPricePerDay());
    }
}
