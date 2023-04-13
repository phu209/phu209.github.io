package handle;

import entity.Figure;

import java.util.Scanner;

public class FigureHandle {
    public Figure inputFigure(Scanner sc){
        System.out.println("Nhập tên tướng: ");
        String name = sc.nextLine();
        System.out.println("Nhập vị trí: ");
        String position = sc.nextLine();
        return new Figure(name,position);
    }
}
