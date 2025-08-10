package Bai1;

public class Pet {
    private final double overWeight = 10;

    private String name;
    private double weight;
    private String species;

    public Pet(String name, double weight, String species) {
        this.name = name;
        this.weight = weight;
        this.species = species;
    }

    @Override
    public String toString() {
        return "Bai1.Pet{" +
                "overWeight=" + overWeight +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                '}';
    }

    public boolean isOverweight(double weight) {
        if (this.weight > overWeight) {
            return false;
        }
        return true;
    }

    public String getBasicInfo(String name, String species) {
        return name + species;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}