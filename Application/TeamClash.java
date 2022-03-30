package Application;
import Characters.Teams;
import Application.TeamComposing;

public class TeamClash {
private  int clashCounter=0;
private  double team1Ene, team1Str, team1Def;
        private double team2Ene, team2Str, team2Def;
        private int result;
    public void teamClash (Teams team1, Teams team2){

        team1Ene += team1.getTeamEnergy();
        team1Str = team1.getTeamStr();
        team1Def = team1.getTeamDef();
        team2Ene = team2.getTeamEnergy();
        team2Str = team2.getTeamStr();
        team2Def = team2.getTeamDef();


        while (team1Ene>0 && team2Ene>0) {
            System.out.println("Runda "+(clashCounter+1)+":");
            System.out.println("Drużyna 1 zadaje: " + (team1Str-team2Def) + " obrażeń");
                team2Ene -= (team1Str - team2Def);

                if (team2Ene > 0) {
                    System.out.println("Drużyna 2 zadaje: " + (team2Str-team1Def) + " obrażeń");
                    team1Ene -= (team2Str - team1Def);
                    clashCounter++;
                }
                if (team1Ene <= 0) {
                    results();
                    result = 1;
                }
                if (team2Ene <= 0) {
                    clashCounter++;
                    results();
                    result = 2;
                }

            }

    }

    public void results(){
        if ( result == 1){
            System.out.println("Wygrała drużyna Druga w: "+clashCounter+" ruchach");
        }
        else if (result ==2 ){
            System.out.println("Wygrała drużyna pierwsza w: "+clashCounter+" ruchach");
        }
    }

    public double getTeam1Ene() {
        return team1Ene;
    }

    public void setTeam1Ene(double team1Ene) {
        this.team1Ene = team1Ene;
    }

    public double getTeam1Str() {
        return team1Str;
    }

    public void setTeam1Str(double team1Str) {
        this.team1Str = team1Str;
    }

    public double getTeam1Def() {
        return team1Def;
    }

    public void setTeam1Def(double team1Def) {
        this.team1Def = team1Def;
    }

    public double getTeam2Ene() {
        return team2Ene;
    }

    public void setTeam2Ene(double team2Ene) {
        this.team2Ene = team2Ene;
    }

    public double getTeam2Str() {
        return team2Str;
    }

    public void setTeam2Str(double team2Str) {
        this.team2Str = team2Str;
    }

    public double getTeam2Def() {
        return team2Def;
    }

    public void setTeam2Def(double team2Def) {
        this.team2Def = team2Def;
    }
}
