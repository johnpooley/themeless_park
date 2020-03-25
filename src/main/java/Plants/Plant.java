package Plants;

public abstract class Plant {
    private String name;
    private int height;
    private int age;
    public boolean edible;

    public Plant(String name,int height,int age, boolean edible){
        this.name=name;
        this.height=height;
        this.age=age;
        this.edible=edible;
    }


    public String getName(){return this.name;}
    public int getHeight(){return this.height;}
    public int getAge(){return this.age;}
    public boolean canEat(){return this.edible;}
}
