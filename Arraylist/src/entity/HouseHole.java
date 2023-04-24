package entity;

import java.util.ArrayList;

public class HouseHole {
    private ArrayList<Member> members;
    private static int autoId;
    private int id;
    private String address;

    public HouseHole(ArrayList<Member> members, String address) {
        this.members = members;
        this.id = ++autoId;
        this.address = address;
    }

    @Override
    public String toString() {
        return "HouseHole{" +
                "members=" + members +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
