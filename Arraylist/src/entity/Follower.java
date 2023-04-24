package entity;

import java.util.ArrayList;

public class Follower extends Person{
    private int id;
    private static int autoId;
    private int numberOfLike;

    public Follower(String name, String email, int numberOfLike) {
        super(name,email);
        this.id = ++autoId;
        this.numberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "name='" + super.getName() + '\'' +
                ", id=" + id +
                ", email='" + super.getEmail() + '\'' +
                ", numberOfLike=" + numberOfLike +
                '}';
    }
}
