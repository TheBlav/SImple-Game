package Application;

import Application.TeamComposing;
import Application.TeamClash;
import Characters.Character;
import Characters.Defensive;
import Characters.Offensive;
import Characters.Teams;

public class App {

    public static void main(String[] args) {
        TeamComposing teams = new TeamComposing();
        Character one = new Offensive("John", 120, 100, 250);
        Character two = new Defensive("Wick", 140, 100, 250);
        Character three = new Defensive("Summer", 180, 200, 250);
        Teams team1 = new Teams();
        teams.teamComposing(team1, one, two, three);

        Character four = new Offensive("Sandra", 135, 95, 300);
        Character five = new Defensive("Wayne", 110, 200, 280);
        Character six = new Offensive("Jim", 200, 60, 200);
        Teams team2 = new Teams();
        teams.teamComposing(team2, four, five, six);


        TeamClash fight = new TeamClash();
        fight.teamClash(team1, team2);

        fight.results();




    }
}
