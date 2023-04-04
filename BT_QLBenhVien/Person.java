package BT_QLBenhVien;

public class Person {
    private int id;
    private String name;
    private int age;
    private String address;

    public Person(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return id +"\t Tên: "+ name +"\t Tuổi: "+ age +"\t Địa chỉ: "+ address;
    }
}
