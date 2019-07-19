package houses;

import building.Building;
import building.IShow;

public class Skyscapper extends Building implements IShow {
    private double height;
    public Skyscapper(String material, double height){
        super(material);
        if (height > 0){
            this.height = height;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void show(int i){
        for (double itr = 0; itr < i; itr += i/5){
            System.out.println(itr);
        }
    }
}
