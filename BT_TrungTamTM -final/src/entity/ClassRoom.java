package entity;

import java.util.ArrayList;

public class ClassRoom {
    private String subject;
    private ArrayList<Student> students;

    public ClassRoom(String subject, ArrayList<Student> students) {
        this.subject = subject;
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                " subject= " + subject +
                ", \n students= " + students +
                '}';
    }
}
