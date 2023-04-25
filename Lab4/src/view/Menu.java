package view;
import entity.MaketingEmloyee;
import entity.Manager;
import entity.Staff;
import handle.MaketingHandle;
import handle.ManagerHandle;
import handle.StaffHandle;
import java.util.Scanner;
public class Menu {
    ManagerHandle managerHandle = new ManagerHandle();
    StaffHandle staffHandle = new StaffHandle();
    MaketingHandle maketingHandle = new MaketingHandle();
    int choice = 0;
    public void menuSeclect(Scanner sc){
        boolean checkStop = true;
        do {
            System.out.println("---MENU---");
            System.out.println("1.Nhập danh sách nhân viên.");
            System.out.println("2.In danh sách nhân viên.");
            System.out.println("3.Xóa nhân viên.");
            System.out.println("4.Cập nhật thông tin nhân viên.");
            System.out.println("5.Tìm kiếm nhân viên theo lương.");
            System.out.println("6.Thoát");
            System.out.println("Mời bạn chọn: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (Exception e) {
                System.out.println("Nhập dữ liệu không đúng!!!");
            }
            switch (choice){
                case 1:
                    creatCompany(sc);
                    break;
                case 2:
                    System.out.println("Danh sách nhân viên: ");
                    managerHandle.displayManager();
                    staffHandle.displayStaff();
                    maketingHandle.displayMaketing();
                    menuSeclect(sc);
                    break;
                case 3:
                    delStaff(sc);
                    break;
                case 4:
                    updateStaff(sc);
                    break;
                case 5:
                   findBySalary(sc);
                    break;
                case 6:
                    System.out.println("BYE!!!");
                    checkStop = false;
                    break;
            }if (choice <= 0 || choice > 6) System.out.println("Nhập dữ liệu không đúng.");
        }while (checkStop || choice <= 0 || choice > 6);
    }

    public void company() {
        System.out.println("1.Trưởng phòng");
        System.out.println("2.Nhân viên hành chính");
        System.out.println("3.Nhân viên tiếp thị");
        System.out.println("4.Trở về");
    }
    public void creatCompany(Scanner sc) {
        do {
            System.out.println("------------------------------");
            System.out.println("Mời chọn nhân viên muốn nhập: ");
            company();
            System.out.println("Mời bạn chọn: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (Exception e) {
                System.out.println("Nhập dữ liệu không đúng!!!");
            }
            switch (choice){
                case 1:
                    managerHandle.inputManager(sc);
                    creatCompany(sc);
                    break;
                case 2:
                    staffHandle.inputStaff(sc);
                    creatCompany(sc);
                    break;
                case 3:
                    maketingHandle.inputMaketing(sc);
                    creatCompany(sc);
                    break;
                case 4:
                    menuSeclect(sc);
                    break;
            }if (choice <= 0 || choice > 4) System.out.println("Nhập dữ liệu không đúng.");
        }while (choice <= 0 || choice > 4);
    }

    int id;
    public void checkInputId(Scanner sc) {
        try {
            System.out.println("Mời nhập Id: ");
            id = Integer.parseInt(sc.nextLine());
        }catch (Exception e) {
            System.out.println("Nhập dữ liệu không đúng!!!");
        }
    }

    public void delStaff(Scanner sc) {
        do {
            System.out.println("------------------------------");
            System.out.println("Mời chọn vị trí muốn xóa: ");
            company();
            System.out.println("Mời bạn chọn: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (Exception e) {
                System.out.println("Nhập dữ liệu không đúng!!!");
            }
            switch (choice){
                case 1:
                    managerHandle.displayManager();
                    checkInputId(sc);
                    Manager manager = managerHandle.findByIdManager(id);
                    managerHandle.removeManager(manager);
                    delStaff(sc);
                    break;
                case 2:
                    staffHandle.displayStaff();
                    checkInputId(sc);
                    Staff staff = staffHandle.findByIdStaff(id);
                    staffHandle.removeStaff(staff);
                    delStaff(sc);
                    break;
                case 3:
                    maketingHandle.displayMaketing();
                    checkInputId(sc);
                    MaketingEmloyee maketingEmloyee = maketingHandle.findByIdMaketing(id);
                    maketingHandle.removeMaketing(maketingEmloyee);
                    delStaff(sc);
                    break;
                case 4:
                    menuSeclect(sc);
                    break;
            }if (choice <= 0 || choice > 4) System.out.println("Nhập dữ liệu không đúng.");
        }while (choice <= 0 || choice > 4);
    }

    public void updateStaff(Scanner sc) {
        do {
            System.out.println("------------------------------");
            System.out.println("Mời chọn vị trí muốn update thông tin: ");
            company();
            System.out.println("Mời bạn chọn: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (Exception e) {
                System.out.println("Nhập dữ liệu không đúng!!!");
            }
            switch (choice){
                case 1:
                    managerHandle.displayManager();
                    checkInputId(sc);
                    Manager manager = managerHandle.findByIdManager(id);
                    managerHandle.updateManagerName(manager,sc);
                    managerHandle.updateManagerSalary(manager,sc);
                    updateStaff(sc);
                    break;
                case 2:
                    staffHandle.displayStaff();
                    checkInputId(sc);
                    Staff staff = staffHandle.findByIdStaff(id);
                    staffHandle.updateStaffName(staff,sc);
                    staffHandle.updateStaffSalary(staff,sc);
                    updateStaff(sc);
                    break;
                case 3:
                    maketingHandle.displayMaketing();
                    checkInputId(sc);
                    MaketingEmloyee maketingEmloyee = maketingHandle.findByIdMaketing(id);
                    maketingHandle.updateMaketingName(maketingEmloyee,sc);
                    maketingHandle.updateMaketingSalary(maketingEmloyee,sc);
                    updateStaff(sc);
                    break;
                case 4:
                    menuSeclect(sc);
                    break;
            }if (choice <= 0 || choice > 4) System.out.println("Nhập dữ liệu không đúng.");
        }while (choice <= 0 || choice > 4);
    }

    double findSalary;
    public void checkInputSalary(Scanner sc) {
        try {
            System.out.println("Mời bạn nhập tiền lương: ");
            findSalary = Double.parseDouble(sc.nextLine());
        }catch (Exception e) {
            System.out.println("Nhập dữ liệu không đúng!!!");
        }
    }
    public void findBySalary(Scanner sc) {
        do {
            System.out.println("------------------------------");
            System.out.println("Mời chọn vị trí muốn tìm kiếm: ");
            company();
            System.out.println("Mời bạn chọn: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (Exception e) {
                System.out.println("Nhập dữ liệu không đúng!!!");
            }
            switch (choice){
                case 1:
                    checkInputSalary(sc);
                    managerHandle.findBySalary(findSalary);
                    findBySalary(sc);
                    break;
                case 2:
                    checkInputSalary(sc);
                    staffHandle.findBySalary(findSalary);
                    findBySalary(sc);
                    break;
                case 3:
                    checkInputSalary(sc);
                    maketingHandle.findBySalary(findSalary);
                    findBySalary(sc);
                    break;
                case 4:
                    menuSeclect(sc);
                    break;
            }if (choice <= 0 || choice > 4) System.out.println("Nhập dữ liệu không đúng.");
        }while (choice <= 0 || choice > 4);
    }
}
