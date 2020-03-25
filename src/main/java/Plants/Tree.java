package Plants;

public class Tree extends Plant {
    public Tree(String name, int height, int age, boolean edible) {
        super(name, height, age, edible);
        this.edible= false;
    }
}
