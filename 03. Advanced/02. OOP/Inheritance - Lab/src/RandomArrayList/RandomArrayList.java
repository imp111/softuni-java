package RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList<Object> {
    public Object getRandomElement() {
        int randomIndex = new Random().nextInt(super.size());
        return super.get(randomIndex);
    }
}
