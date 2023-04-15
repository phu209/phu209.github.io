package handle;

import entity.Student;

import java.util.Scanner;

public class StudentHandle {
    public Student inputStudent(Scanner sc){
        System.out.println("Nhập tên của học viên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi của học viên: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập học lực của học viên: ");
        String rating = sc.nextLine();
        return new Student(name,age,rating);
    }
}
