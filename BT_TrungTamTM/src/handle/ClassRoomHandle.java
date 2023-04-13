package handle;
import entity.ClassRoom;
import entity.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoomHandle {
    ArrayList<Student> students = new ArrayList<>();
    public ClassRoom inputClassRoom(Scanner sc){
        System.out.println("Nhập tên môn học: ");
        String subject = sc.nextLine();

        System.out.println("Mời bạn nhập số học viên: ");
        int n = Integer.parseInt(sc.nextLine());

        StudentHandle studentHandle = new StudentHandle();

        for (int i = 0; i < n; i++) {
            Student student = studentHandle.inputStudent(sc);
            students.add(student);
        }

        return new ClassRoom(subject,students);
    }

    public void addStudent(Scanner sc){
        StudentHandle studentHandle = new StudentHandle();
        students.add(studentHandle.inputStudent(sc));
    }

    public Student findByID(int id) {
        for (Student student : students) {
            if ((student.getId()) == id){
                return student;
            }
        }
        return null;
    }

    public boolean updateById(Student student, String ratingNew) {
        if (student == null) return false;
        else{
            student.setRating(ratingNew);
            return true;
        }
    }

    public boolean removeById(Student student) {
        if (student == null) return false;
        else{
            students.remove(student);
            return true;
        }
    }

}
