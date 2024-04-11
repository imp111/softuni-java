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
        return 0;
    }

    @Override
    public Double getPricePerDay() {
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format(" ");
    }
}
