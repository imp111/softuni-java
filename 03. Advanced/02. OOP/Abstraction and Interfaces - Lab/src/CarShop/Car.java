package CarShop;

import java.io.Serializable;

public interface Car extends Serializable {
    Integer tires = 4;
    String getModel();
    String getColor();
    Integer getHorsePower();
    String getCountryProduced();
}
