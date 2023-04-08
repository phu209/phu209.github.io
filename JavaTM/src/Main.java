import entity.Student;
import handle.StudentHandle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời bạn nhập số lượng student muốn tạo: ");
        int n ;
        do {
            n = Integer.parseInt(sc.nextLine());
            if (n<=0){
                System.out.println("Số lượng student phải > 0. Mời nhập lại: ");
            }
        }while (n<=0);

        Student[] students = new Student[n];
        StudentHandle studentHandle = new StudentHandle();

        for (int i = 0; i < n; i++) {
            Student student = StudentHandle.createStudent(sc, i);
            //Lưu Student trong Array
            students[i] = student;
        }
        studentHandle.displayAllStudent(students);
    }
}