package entity;

public class Student {
    private static int autoId;
    private int id;
    private String name;
    private int age;
    private String rating;

    public Student(String name, int age, String rating) {
        this.id = ++autoId;
        this.name = name;
        this.age = age;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id= " + id +
                ", name= " + name +
                ", age= " + age +
                ", rating= " + rating + '}';
    }
}
