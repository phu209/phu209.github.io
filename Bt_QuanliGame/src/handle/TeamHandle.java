package handle;

import entity.Figure;
import entity.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamHandle {
    public Team inputTeam(Scanner sc){
        System.out.println("Nhập tên team: ");
        String name = sc.nextLine();

        FigureHandle figureHandle = new FigureHandle();
        ArrayList<Figure> figures = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Figure figure = figureHandle.inputFigure(sc);
            figures.add(figure);
        }

        return new Team(name,figures);
    }
}
