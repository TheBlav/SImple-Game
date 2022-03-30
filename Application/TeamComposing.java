package Application;

import Characters.Character;
import Characters.Defensive;
import Characters.Offensive;
import Characters.Teams;

public class TeamComposing {
private double teamEne, teamDef, teamStr;

    public Teams teamComposing (Teams team, Character char1, Character char2, Character char3) {

        team.addTeamMember(char1);
        team.addTeamMember(char2);
        team.addTeamMember(char3);
        teamEne = char1.getEnergy() + char2.getEnergy() + char3.getEnergy();
        teamStr = char1.getStrength() + char2.getStrength() + char3.getStrength();
        teamDef = char1.getDefense() + char2.getDefense() + char3.getDefense();
//        team.setTeamEnergy(teamEne);
//        team.setTeamStr(teamStr);
//        team.setTeamDef(teamDef);

        System.out.println("\n");
        team.displayTeamMembers();


        return new Teams();
    }

    public double getTeamEne() {
        return teamEne;
    }

    public void setTeamEne(double teamEne) {
        this.teamEne = teamEne;
    }

    public double getTeamDef() {
        return teamDef;
    }

    public void setTeamDef(double teamDef) {
        this.teamDef = teamDef;
    }

    public double getTeamStr() {
        return teamStr;
    }

    public void setTeamStr(double teamStr) {
        this.teamStr = teamStr;
    }
}
