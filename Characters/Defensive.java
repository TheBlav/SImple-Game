package Characters;

public class Defensive extends  Character{
    private  final  static  double defBonus = 0.2;

    public Defensive(String name, double strength, double defense, double energy) {
        super(name, strength, defense, energy);
        super.setDefense(defense = getDefense()*(1+defBonus));
    }

    @Override
    public String printInfo() {
        return super.printInfo();
    }
}
