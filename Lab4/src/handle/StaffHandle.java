package handle;
import entity.Staff;
import java.util.Scanner;

public class StaffHandle {
    public Staff creatStaff(Scanner sc) {
        System.out.println("Mời bạn nhập thông tin nhân viên hành chính: ");
        System.out.println("Mời nhập tên nhân viên: ");
        String name = sc.nextLine();
        System.out.println("Mời nhập lương nhân viên: ");
        Double salary = Double.parseDouble(sc.nextLine());
        
    }
}
