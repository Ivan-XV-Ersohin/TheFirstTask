package application;

import building.Building;
import houses.Castle;
import houses.Skyscapper;

import java.util.ArrayList;
import java.util.List;

public class Application{
    public static void main(String []args){
        Building castle = new Castle(1200, "stone");
        Building skyscapper = new Skyscapper("wood", 5543);
        castle.setMaterial("steel");
        skyscapper.setMaterial("bricks");
        castle.printMaterial();
        skyscapper.printMaterial();
        List<Building> buildingsList = new ArrayList<Building>();
        buildingsList.add(castle);
        buildingsList.add(skyscapper);
        for(Building curBuilding: buildingsList){
            curBuilding.show();
            curBuilding.show(5);
        }
    }
}