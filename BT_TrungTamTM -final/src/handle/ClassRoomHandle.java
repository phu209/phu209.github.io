package handle;
import entity.ClassRoom;
import entity.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoomHandle {
    ArrayList<Student> students = new ArrayList<>();
    //Input Arraylist classroom
    public ClassRoom inputClassRoom(Scanner sc){
        System.out.println("Nhập tên môn học: ");
        String subject = sc.nextLine();

        System.out.println("Mời bạn nhập số học viên: ");
        int n;
        do {
            n = Integer.parseInt(sc.nextLine());
            StudentHandle studentHandle = new StudentHandle();

            for (int i = 0; i < n; i++) {
                Student student = studentHandle.inputStudent(sc);
                students.add(student);
            }
            if (n <= 0){
                System.out.println("Số học viên phải > 0. Mời nhập lại: ");
            }
        }while (n <= 0);

        return new ClassRoom(subject,students);
    }
    //Add student
    public void addStudent(Scanner sc){
        StudentHandle studentHandle = new StudentHandle();
        students.add(studentHandle.inputStudent(sc));
    }
    //Find student by id
    public Student findById(int id){
        for (Student student :students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
    //Edit rating student by id
    public void editById(Student student, Scanner sc) {
        if (student == null){
            System.out.println("Không tìm thấy.");
        }else {
            System.out.println("Mời update học lực: ");
            String ratingNew = sc.nextLine();
            student.setRating(ratingNew);
            System.out.println("Bạn đã update xong");
            System.out.println(student);
        }
    }
    //Remove student by id
    public void remove(Student student) {
        if (student == null){
            System.out.println("Không tìm thấy.");
        }else {
            students.remove(student);
            System.out.println("Xóa thành công.");
        }
    }

}
