package flowers;

import java.io.Serializable;

public class Flower implements Serializable {
    protected int cost;
    public Flower(int cost){
        this.cost =cost;

    }
    public int getCost() {
        return cost;
    }
}
