package Animals;

public abstract class Animal {
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age){
        this.name=name;
        this.age=age;
        this.species=species;
    }

    public String getName(){return this.name;}
    public String getSpecies(){return this.species;}
    public int getAge(){return this.age;}
}
