package handle;
import entity.Manager;
import java.util.ArrayList;
import java.util.Scanner;
public class ManagerHandle {
    ArrayList<Manager> managers = new ArrayList<>();
    public void inputManager(Scanner sc) {
        try {
            System.out.println("------------------------------");
            System.out.println("Mời bạn nhập thông tin trưởng phòng: ");
            System.out.println("Mời nhập tên trưởng phòng: ");
            String name = sc.nextLine();
            System.out.println("Mời nhập lương trưởng phòng: ");
            double salary = Double.parseDouble(sc.nextLine());
            System.out.println("Mời bạn nhập lương trách nhiệm: ");
            double salaryPlus = Double.parseDouble(sc.nextLine());
            Manager manager = new Manager(name, salary, salaryPlus);
            managers.add(manager);
        }catch (Exception e){
            System.out.println("Nhập dữ liệu không đúng!!!");
            inputManager(sc);
        }
    }

    public void displayManager() {
        System.out.println(managers);
    }

    public Manager findByIdManager(int id){
        for (Manager manager : managers){
            if (manager.getId() == id){
                return manager;
            }
        }return null;
    }

    public void findBySalary(double salary){
        for (Manager manager : managers){
            if (manager.getSalary() == salary)
                System.out.println(manager);
            else System.out.println("Không tìm thấy");
        }
    }

    public void removeManager(Manager manager) {
        if (manager == null){
            System.out.println("Không tìm thấy.");
        }else {
            managers.remove(manager);
            System.out.println("Xóa thành công.");
        }

    }

    public void updateManagerName(Manager manager, Scanner sc) {
        if (manager == null){
            System.out.println("Không tìm thấy.");
        }else {
            System.out.println("Mời update tên: ");
            String nameNew = sc.nextLine();
            manager.setName(nameNew);
            System.out.println("Bạn đã update xong");
            System.out.println(manager);
        }
    }

    public void updateManagerSalary(Manager manager, Scanner sc) {
        if (manager == null){
            System.out.println("Không tìm thấy.");
        }else {
            System.out.println("Mời update lương: ");
            double salaryNew = Double.parseDouble(sc.nextLine());
            manager.setSalary(salaryNew);
            System.out.println("Bạn đã update xong");
            System.out.println(manager);
        }
    }

}
