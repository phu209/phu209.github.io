package entity;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Figure> figures;

    public Team(String name, ArrayList<Figure> figures) {
        this.name = name;
        this.figures = figures;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", figures=" + figures +
                '}';
    }
}
