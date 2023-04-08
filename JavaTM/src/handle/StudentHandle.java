package handle;

import entity.Student;

import java.util.Scanner;

public class StudentHandle {
    public static Student createStudent(Scanner sc, int i) {
        double scoreMath;
        double scorePhysic;
        double scoreChemistry;
        System.out.println("Mời bạn nhập tên của student thứ " + (i + 1) + ": ");
        String name = sc.nextLine();
        do {
            System.out.println("Mời bạn nhập điểm môn Toán: ");
            scoreMath = Double.parseDouble(sc.nextLine());
            System.out.println("Mời bạn nhập điểm môn Vật lý: ");
            scorePhysic = Double.parseDouble(sc.nextLine());
            System.out.println("Mời bạn nhập điểm môn Hóa học: ");
            scoreChemistry = Double.parseDouble(sc.nextLine());
            if (scoreMath < 0 || scoreChemistry < 0 || scorePhysic < 0 || scoreMath > 10 || scoreChemistry > 10 || scorePhysic > 10){
                System.out.println("Điểm không hợp lệ! Mời nhập lại: ");
            }
        }while (scoreMath < 0 || scoreChemistry < 0 || scorePhysic < 0 || scoreMath > 10 || scoreChemistry > 10 || scorePhysic > 10);
        Student student = new Student(name,scoreMath,scorePhysic,scoreChemistry);
        return student;
    }

    public double getAvgStudent(Student student){
        return (student.getScoreMath()+student.getScorePhysic()+student.getScoreChemistry())/3;
    }

    public String classify(double getAvgStudent){
            if (getAvgStudent >= 8)
                return "Xêp loại A";
            else if (getAvgStudent < 8 && getAvgStudent >= 6.5)
                return "Xếp loại B";
            else
                return "Xếp loại C";
    }

    public void displayAllStudent(Student[] students){
        for (Student st : students) {
            System.out.println(st.toString());
            System.out.println("Điểm trung bình môn: "+getAvgStudent(st)+ " - "+classify(getAvgStudent(st)));
            System.out.println();
        }
    }
}
