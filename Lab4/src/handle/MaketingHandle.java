package handle;
import entity.MaketingEmloyee;
import java.util.ArrayList;
import java.util.Scanner;

public class MaketingHandle {
    ArrayList<MaketingEmloyee> maketingEmloyees = new ArrayList<>();
    public void inputMaketing (Scanner sc) {
        try {
            System.out.println("------------------------------");
            System.out.println("Mời bạn nhập thông tin nhân viên tiếp thị: ");
            System.out.println("Mời nhập tên nhân viên: ");
            String name = sc.nextLine();
            System.out.println("Mời nhập lương nhân viên: ");
            double salary = Double.parseDouble(sc.nextLine());
            System.out.println("Mời bạn nhập doanh số bán hàng: ");
            double sales = Double.parseDouble(sc.nextLine());
            System.out.println("Mời bạn nhập tỉ lệ hoa hồng: ");
            double bonus = Double.parseDouble(sc.nextLine());
            MaketingEmloyee maketingEmloyee = new MaketingEmloyee(name,salary,sales,bonus);
            maketingEmloyees.add(maketingEmloyee);
        }catch (Exception e){
            System.out.println("Nhập dữ liệu không đúng!!!");
            inputMaketing(sc);
        }
    }

    public void displayMaketing () {
        System.out.println(maketingEmloyees);
    }

    public MaketingEmloyee findByIdMaketing(int id){
        for (MaketingEmloyee maketingEmloyee : maketingEmloyees){
            if (maketingEmloyee.getId() == id){
                return maketingEmloyee;
            }
        }return null;
    }

    public void findBySalary(double salary){
        for (MaketingEmloyee maketingEmloyee : maketingEmloyees){
            if (maketingEmloyee.getSalary() == salary)
                System.out.println(maketingEmloyee);
            else System.out.println("Không tìm thấy");
        }
    }

    public void removeMaketing(MaketingEmloyee maketingEmloyee) {
        if (maketingEmloyee == null){
            System.out.println("Không tìm thấy.");
        }else {
            maketingEmloyees.remove(maketingEmloyee);
            System.out.println("Xóa thành công.");
        }
    }

    public void updateMaketingName(MaketingEmloyee maketingEmloyee, Scanner sc) {
        if (maketingEmloyee == null){
            System.out.println("Không tìm thấy.");
        }else {
            System.out.println("Mời update tên: ");
            String nameNew = sc.nextLine();
            maketingEmloyee.setName(nameNew);
            System.out.println("Bạn đã update xong");
            System.out.println(maketingEmloyee);
        }
    }

    public void updateMaketingSalary(MaketingEmloyee maketingEmloyee, Scanner sc) {
        if (maketingEmloyee == null){
            System.out.println("Không tìm thấy.");
        }else {
            System.out.println("Mời update lương: ");
            double salaryNew = Double.parseDouble(sc.nextLine());
            maketingEmloyee.setSalary(salaryNew);
            System.out.println("Bạn đã update xong");
            System.out.println(maketingEmloyee);
        }
    }
}
