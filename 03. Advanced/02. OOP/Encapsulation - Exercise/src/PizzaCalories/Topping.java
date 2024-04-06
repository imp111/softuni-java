package PizzaCalories;

public class Topping {
    private String toppingType;
    private Double weight;

    public Topping(String toppingType, Double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        switch (toppingType.toLowerCase()) {
            case "meat":
            case "veggies":
            case "cheese":
            case "sauce":
                this.toppingType = toppingType;
                break;
            default:
                String msg = String.format("Cannot place %s on top of your pizza", toppingType);
                throw new IllegalArgumentException(msg);
        }
    }

    private void setWeight(Double weight) {
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;
        }
        else {
            String msg = String.format("%s weight should be in the range [1..50].", this.toppingType);
            throw new IllegalArgumentException(msg);
        }
    }

    public double calculateCalories() {
        double toppingTypeModificator = this.getToppingTypeModificator();

        return 2 * this.weight * toppingTypeModificator;
    }

    private double getToppingTypeModificator() {
        Double modificator = 0.0;

        switch (this.toppingType.toLowerCase()) {
            case "meat":
                modificator = 1.2;
                break;
            case "veggies":
                modificator = 0.8;
                break;
            case "cheese":
                modificator = 1.1;
                break;
            case "sauce":
                modificator = 0.9;
                break;
            default:
                modificator = 0.0;
                break;
        }
        return modificator;
    }
}
