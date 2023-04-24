package entity;

public class Member {
    private static int autoId;
    private int id;
    private String name;
    private String dob;
    private String job;

    public Member(String name, String dob, String job) {
        this.id = ++autoId;
        this.name = name;
        this.dob = dob;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
