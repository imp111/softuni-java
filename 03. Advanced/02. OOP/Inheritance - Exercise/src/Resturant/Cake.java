package Resturant;

import java.math.BigDecimal;

public class Cake extends Dessert {
    private final double CAKE_GRAMS = 250;
    private final double CAKE_CALORIES = 1000;
    private final int CAKE_PRICE = 5;

    public Cake(String name, BigDecimal price, double grams, double calories) {
        super(name, price, grams, calories);
    }
}