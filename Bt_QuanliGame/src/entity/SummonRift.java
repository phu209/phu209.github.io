package entity;

import java.util.ArrayList;

public class SummonRift {
    private ArrayList<Team> teams;

    public SummonRift(ArrayList<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "teams=" + teams +
                '}';
    }
}
