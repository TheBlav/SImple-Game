package Characters;

public class Character {
    private String name;
    private double strength;
    private double defense;
    private double energy;

    public Character(String name, double strength, double defense, double energy) {
        this.name = name;
        this.strength = strength;
        this.defense = defense;
        this.energy = energy;
    }

    public String printInfo(){
        return "Postać: "+name+" o sile ataku:"+strength+", obronie: "+defense+" Punktach życia: "+energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }
}
