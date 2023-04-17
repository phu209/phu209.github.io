package view;
import entity.User;
import handle.UserHandle;
import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    public void menuSelect(Scanner sc, ArrayList<User>users) {
        int choice = 0;
        do {
            System.out.println("---Menu---");
            System.out.println("1.Đăng nhập");
            System.out.println("2.Đăng ký");
            System.out.println("Mời bạn chọn: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (Exception e) {
                System.out.println("Nhập dữ liệu không đúng!!!");
            }
            UserHandle userHandle = new UserHandle();
            switch (choice){
                case 1:
                    userHandle.login(sc,users);
                    break;
                case 2:
                    userHandle.createUser(sc,users);
                    System.out.println("Đăng ký thành công!");
                    System.out.println(users);
                    menuSelect(sc,users);
                    break;
                case 0:
                    System.out.println("Nhập dữ liệu không đúng!!!");
                    menuSelect(sc,users);
                    break;
            }
            if (choice <= 0 || choice > 2) System.out.println("Nhập dữ liệu không đúng!!!");
        }while (choice < 0 || choice >2);
    }
    // menu đăng nhập lỗi
    public void menuLoginError(Scanner sc, ArrayList<User>users){
        int choice = 0;
        do {
            System.out.println("""
                1 - Đăng nhập lại
                2 - Quên mật khẩu
                Mời bạn chọn:""");
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (Exception e) {
                System.out.println("Nhập dữ liệu không đúng!!!");
            }
            UserHandle userHandle = new UserHandle();
            switch (choice) {
                case 1:
                    userHandle.login(sc,users);
                    break;
                case 2:
                    System.out.println("Mời bạn nhập email đăng ký: ");
                    String email = sc.nextLine();
                    User user = userHandle.findEmail(users,email);
                    userHandle.forgotPassword(user,sc,users);
                    break;
                case 0:
                    System.out.println("Nhập dữ liệu không đúng!!!");
                    menuLoginError(sc,users);
                    break;
            }
            if (choice <= 0 || choice > 2) System.out.println("Nhập dữ liệu không đúng!!!");
        }while (choice < 0 || choice > 2);
    }
    //Menu đăng nhập thành công
    public void menuLoginOk(Scanner sc, ArrayList<User>users, String userName){
        boolean checkStop = true;
        int choice = 5;
        do {
            UserHandle userHandle = new UserHandle();
            System.out.println("""
                1 - Thay đổi username.
                2 - Thay đổi email.
                3 - Thay đổi mật khẩu.
                4 - Đăng xuất.
                0 - Thoát chương trình.
                Mời bạn chọn:""");
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (Exception e) {
                System.out.println("Nhập dữ liệu không đúng!!!");
            }
            switch (choice) {
                case 1:
                    userHandle.changeUsername(sc,users);
                    break;
                case 2:
                    userHandle.changeEmail(sc,users);
                    break;
                case 3:
                    User userChangePassword = userHandle.findUserByUsername(users,userName);
                    userHandle.changePassword(sc,userChangePassword,users);
                    break;
                case 4:
                    menuSelect(sc,users);
                    break;
                case 5:
                    System.out.println("Nhập dữ liệu không đúng!!!");
                    menuLoginOk(sc,users,userName);
                    break;
                case 0:
                    System.out.println("Bye!!!");
                    checkStop = false;
                    break;
            }
            if (choice <= 0 || choice > 5) System.out.println("Nhập dữ liệu không đúng!!!");
        }while (checkStop && choice <= 0 || choice > 5 );
    }
}
