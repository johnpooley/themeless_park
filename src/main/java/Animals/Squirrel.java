package Animals;

import Plants.Plant;

public class Squirrel extends Animal implements IClimb, IEat{

    public Squirrel(String name, String species, int age) {
        super(name, species, age);
    }

    public String climb(Plant plant) {
        if (plant.getHeight() >= 15) {
            return this.getName() + " has climbed the " + plant.getName();
        } else {
            return plant.getName() + " is too short for " + this.getName() + " to climb";
        }
    }

    public String eat(Plant plant) {
        return null;
    }
}
