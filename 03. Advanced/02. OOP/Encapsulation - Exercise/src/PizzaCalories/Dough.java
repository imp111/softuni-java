package PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private Double weight;

    public Dough(String flourType, String bakingTechnique, Double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setWeight(Double weight) {
        if (weight > 0 && weight <= 200) {
            this.weight = weight;
        }
        else {
            throw new IllegalArgumentException("Dough weight should be in the range [1...200].");
        }
    }

    private void setFlourType(String flourType) {
        if (flourType.equalsIgnoreCase("white") || flourType.equalsIgnoreCase("wholegrain")) {
            this.flourType = flourType;
        }
        else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique (String bakingTechnique) {
        switch (bakingTechnique) {
            case "homemade":
            case "chewy":
            case "crispy":
                this.bakingTechnique = bakingTechnique;
                break;
            default: throw new IllegalArgumentException("Invalid type fo dough.");
        }
    }

    public Double calculateCalories() {
        Double flourTypeModificator = this.getFlourTypeModificator(this.flourType);
        Double bakingTypeModificator = this.getBakingTypeModificator(this.bakingTechnique);

        return (2 * this.weight) * flourTypeModificator * bakingTypeModificator;
    }

    private double getFlourTypeModificator(String flourType) {
        if (flourType.equalsIgnoreCase("white")) {
            return 1.5;
        }
        else if (flourType.equalsIgnoreCase("wholegrain")) {
            return 1.0;
        }
        else {
            return 0.0;
        }
    }

    private double getBakingTypeModificator(String bakingTechnique) {
        double modificator = 0.0;
        switch(bakingTechnique) {
            case "crispy":
                modificator = 0.9;
                break;
            case "chewy":
                modificator = 1.1;
                break;
            case "homemade":
                modificator = 1;
                break;
            default: return 0;
        }

        return modificator;
    }
}