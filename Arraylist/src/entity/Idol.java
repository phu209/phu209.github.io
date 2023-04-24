package entity;

import java.util.ArrayList;

public class Idol extends Person{
    private ArrayList<Follower> followers;
    private static int autoId;
    private int id;
    private double follower;
    private String group;

    public Idol(ArrayList<Follower> followers, String name, String email, String group) {
        super(name,email);
        this.followers = followers;
        this.id = ++autoId;
        this.follower = follower;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Idol{" +
                "followers=" + followers +
                ", id=" + id +
                ", name='" + super.getName() + '\'' +
                ", email='" + super.getEmail()+ '\'' +
                ", follower=" + follower +
                ", group='" + group + '\'' +
                '}';
    }
}
