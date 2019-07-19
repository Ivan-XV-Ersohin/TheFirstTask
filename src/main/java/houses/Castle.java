package houses;

import building.Building;

public class Castle extends Building{
    private double strength;
    public Castle(double strength, String material){
        super(material);
        if (strength > 0){
            this.strength = strength;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}
