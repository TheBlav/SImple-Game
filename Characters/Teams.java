package Characters;
import Characters.Character;
import Characters.Offensive;
import Characters.Defensive;

import java.sql.SQLOutput;

public class Teams {
    private static final int TEAM_SIZE = 3;
    private int characterCounter=0;
    Character[] characters = new Character[TEAM_SIZE];
    private double teamStr, teamDef, teamEnergy;


    public void addTeamMember (Character character1){
        if (characterCounter<TEAM_SIZE){
            characters[characterCounter]=character1;
            characterCounter++;
        }
        else {
            System.out.println("osiągnięto maksymalną liczbę postaci w zespole");
        }

    }

    public void displayTeamMembers (){
        for (int i=0; i<TEAM_SIZE; i++) {
            teamDef+=characters[i].getDefense();
            teamStr+=characters[i].getStrength();
            teamEnergy+=characters[i].getEnergy();
            System.out.println(characters[i].printInfo());
            }


        System.out.println();
        System.out.println("Siła ataku zespołu: "+teamStr+", moc obrony zespołu: "+teamDef+", Punty życia zespołu: "+teamEnergy );
    }




    public double getTeamStr() {
        return teamStr;
    }

    public void setTeamStr(double teamStr) {
        this.teamStr = teamStr;
    }

    public double getTeamDef() {
        return teamDef;
    }

    public void setTeamDef(double teamDef) {
        this.teamDef = teamDef;
    }

    public double getTeamEnergy() {
        return teamEnergy;
    }

    public void setTeamEnergy(double teamEnergy) {
        this.teamEnergy = teamEnergy;
    }
}
