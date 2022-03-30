package Characters;

public class Offensive extends Character {
    private static final double strBonus = 0.2;

    public Offensive(String name, double strength, double defense, double energy) {
        super(name, strength, defense, energy);
        super.setStrength(getStrength()*(1+strBonus));
    }

    @Override
    public String printInfo() {
        return super.printInfo();
    }
}
