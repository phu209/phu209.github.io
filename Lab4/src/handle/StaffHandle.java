package handle;
import entity.Staff;
import java.util.ArrayList;
import java.util.Scanner;
public class StaffHandle {
    ArrayList<Staff> staffs = new ArrayList<>();
    public void inputStaff(Scanner sc) {
        try {
            System.out.println("------------------------------");
            System.out.println("Mời bạn nhập thông tin nhân viên hành chính: ");
            System.out.println("Mời nhập tên nhân viên: ");
            String name = sc.nextLine();
            System.out.println("Mời nhập lương nhân viên: ");
            double salary = Double.parseDouble(sc.nextLine());
            Staff staff = new Staff(name,salary);
            staffs.add(staff);
        }catch (Exception e){
            System.out.println("Nhập dữ liệu không đúng!!!");
            inputStaff(sc);
        }
    }

    public void displayStaff() {
        System.out.println(staffs);
    }

    public Staff findByIdStaff(int id){
        for (Staff staff : staffs){
            if (staff.getId() == id){
                return staff;
            }
        }return null;
    }

    public void findBySalary(double salary){
        for (Staff staff : staffs){
            if (staff.getSalary() == salary)
                System.out.println(staff);
            else System.out.println("Không tìm thấy");
        }
    }

    public void removeStaff(Staff staff) {
        if (staff == null){
            System.out.println("Không tìm thấy.");
        }else {
            staffs.remove(staff);
            System.out.println("Xóa thành công.");
        }

    }

    public void updateStaffName(Staff staff, Scanner sc) {
        if (staff == null){
            System.out.println("Không tìm thấy.");
        }else {
            System.out.println("Mời update tên: ");
            String nameNew = sc.nextLine();
            staff.setName(nameNew);
            System.out.println("Bạn đã update xong");
            System.out.println(staff);
        }
    }

    public void updateStaffSalary(Staff staff, Scanner sc) {
        if (staff == null){
            System.out.println("Không tìm thấy.");
        }else {
            System.out.println("Mời update lương: ");
            double salaryNew = Double.parseDouble(sc.nextLine());
            staff.setSalary(salaryNew);
            System.out.println("Bạn đã update xong");
            System.out.println(staff);
        }
    }

}
