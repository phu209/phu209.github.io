package view;
import entity.Student;
import entity.TechMaster;
import handle.ClassRoomHandle;
import java.util.Scanner;

public class Menu {
    public void menuSelect(Scanner sc) {
        System.out.println("Mời bạn nhập tên quản lí lớp: ");
        String manager = sc.nextLine();
        System.out.println("Mời bạn nhập tên giảng viên: ");
        String teacher = sc.nextLine();

        ClassRoomHandle classRoomHandle = new ClassRoomHandle();
        TechMaster techMaster = new TechMaster(manager,teacher,classRoomHandle.inputClassRoom(sc));

        boolean checkStop = true;
        do {
            System.out.println("--Menu--");
            System.out.println("""
                    1.Hiển thị thông tin chi tiết của trung tâm.
                    2.Thêm học viên vào lớp.
                    3.Cập nhật thông tin học lực của 1 học viên dựa vào Id.
                    4.Xóa 1 học viên khỏa lớp học.
                    5.Exit.""");

            System.out.println("Mời bạn lựa chọn:");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println(techMaster);
                    break;
                case 2:
                    classRoomHandle.addStudent(sc);
                    System.out.println("Thêm học viên thành công.");
                    break;
                case 3:
                    System.out.println("Mời bạn nhập id cần tìm để update học lực: ");
                    int id = Integer.parseInt(sc.nextLine());
                    Student student = classRoomHandle.findByID(id);
                    System.out.println(student);
                    if ( student == null){
                        System.out.println("Không tìm thấy học viên.");
                    }else {
                        System.out.println("Mời bạn nhập học lực muốn update: ");
                        String ratingNew = sc.nextLine();
                        boolean checkUpdate = classRoomHandle.updateById(student, ratingNew);
                        if (checkUpdate){
                            System.out.println("Update thành công.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Mời bạn nhập id học viên nghỉ học: ");
                    int id2 = Integer.parseInt(sc.nextLine());
                    Student student2 = classRoomHandle.findByID(id2);
                    System.out.println(student2);

                    boolean checkRemove = classRoomHandle.removeById(student2);
                    if (checkRemove){
                        System.out.println("Xóa thành công.");
                    } else {
                        System.out.println("Không thành công.");
                    }
                    break;
                case 5:
                    checkStop = false;
                    System.out.println("Bye!!!");
                    break;
            }
        }while (checkStop);
    }
}
