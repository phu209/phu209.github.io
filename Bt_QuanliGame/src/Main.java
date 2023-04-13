import entity.SummonRift;
import entity.Team;
import handle.TeamHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TeamHandle teamHandle = new TeamHandle();
        ArrayList<Team> teams = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Team team = teamHandle.inputTeam(sc);
            teams.add(team);
        }

        SummonRift summonRift = new SummonRift(teams);
        System.out.println(summonRift);
    }
}