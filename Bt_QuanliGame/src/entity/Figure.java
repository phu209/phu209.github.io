package entity;

public class Figure {
    private String name;
    private String position;

    public Figure(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
