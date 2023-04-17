package handle;
import entity.User;
import view.Menu;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;
public class UserHandle {

    // Tạo tài khoản
    public void createUser(Scanner sc,ArrayList<User> users) {
        System.out.println("Nhập username: ");
        String userName = sc.nextLine();
        String email;
        while (true){
            System.out.println("Nhập email: ");
            email = sc.nextLine();
            Pattern e = Pattern.compile("^[A-Za-z][0-9A-Za-z]+@[A-Za-z]{2,}(\\.[A-Za-z]+)+$");
            if (e.matcher(email).find()){
                break;
            }else {
                System.out.println("Email không hợp lệ. Mời nhập lại: ");
            }
        }
        String password;
        while (true){
            System.out.println("Nhập password (dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa): ");
            password = sc.nextLine();
            Pattern p = Pattern.compile("^[0-9A-Za-z]{7,15}$");
            Pattern p2 = Pattern.compile("^[0-9A-Za-z]*[A-Z]+[0-9A-Za-z]*");
            if (p.matcher(password).find() && p2.matcher(password).find()){
                break;
            }else {
                System.out.println("Password không hợp lệ. Mời nhập lại: ");
            }
        }
        boolean check = false;
        for (User user : users) {
            if (user.getUsername().equals(userName) || user.getEmail().equals(email)) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("Username hoặc email đã sử dụng mời nhập lại: ");
            createUser(sc,users);
        }else {
            User user = new User(userName,email,password);
            users.add(user);
        }
    }

    Menu menu = new Menu();
    // Đăng nhập
    public void login(Scanner sc, ArrayList<User> users){
        System.out.println("Mời bạn nhập username: ");
        String userName = sc.nextLine();
        System.out.println("Mời bạn nhập password: ");
        String password = sc.nextLine();
        for (User user : users) {
            if (Objects.equals(user.getUsername(), userName) && Objects.equals(user.getPassword(), password)){
                System.out.println("Chào mừng "+userName+", bạn có thể thực hiện các công việc sau:");
                menu.menuLoginOk(sc,users,userName);
            }else if (Objects.equals(user.getUsername(), userName) && !Objects.equals(user.getPassword(), password)) {
                System.out.println("Mật khẩu không đúng!");
                menu.menuLoginError(sc,users);
            } else if (!Objects.equals(user.getUsername(), userName) && Objects.equals(user.getPassword(), password)) {
                System.out.println("Kiểm tra lại username!");
                login(sc,users);
            } else if (!Objects.equals(user.getUsername(), userName) && !Objects.equals(user.getPassword(), password)) {
                System.out.println("Tài khoản không tồn tại.");
                menu.menuSelect(sc,users);
            }
        }
    }

    public User findEmail(ArrayList<User> users, String email) {
        for (User user : users){
            if (Objects.equals(user.getEmail(), email)){
                return user;
            }
        }
        return null;
    }
    // Quên mật khẩu
    public void forgotPassword(User user, Scanner sc, ArrayList<User> users){
        if (user == null){
            System.out.println("Tài khoản không tồn tại.");
            menu.menuSelect(sc,users);
        }else {
            changePassword(sc,user,users);
            System.out.println("Đăng nhập: ");
            login(sc, users);
        }
    }
    //Đổi mật khẩu
    public void changePassword(Scanner sc, User user, ArrayList<User> users) {
        String passwordNew;
        while (true) {
            System.out.println("Nhập password mới (dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa): ");
            passwordNew = sc.nextLine();
            Pattern p = Pattern.compile("^[0-9A-Za-z]{7,15}$");
            Pattern p2 = Pattern.compile("^[0-9A-Za-z]*[A-Z]+[0-9A-Za-z]*");
            if (user != null && p.matcher(passwordNew).find() && p2.matcher(passwordNew).find()) {
                break;
            } else {
                System.out.println("Password không hợp lệ. Mời nhập lại: ");
            }
        }
        user.setPassword(passwordNew);
        System.out.println("Đổi mật khẩu thành công.");
        System.out.println("Mời đăng nhập lại:");
        login(sc,users);
    }

    public User findUserByUsername(ArrayList<User> users, String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public void changeUsername(Scanner sc, ArrayList<User> users) {
        for (User user : users) {
            System.out.println("Nhập username mới: ");
            String userNameNew = sc.nextLine();
            if (findUserByUsername(users, userNameNew) != null) {
                System.out.println("Username đã tồn tại.");
            }else {
                user.setUsername(userNameNew);
                System.out.println("Đổi username thành công.");
                System.out.println("Mời đăng nhập lại:");
                login(sc,users);
            }
        }
    }

    public User findUserByEmail(ArrayList<User> users, String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

   public void changeEmail(Scanner sc, ArrayList<User> users) {
       for (User user : users) {
           String emailNew;
           while (true){
               System.out.println("Nhập email: ");
               emailNew = sc.nextLine();
               Pattern e = Pattern.compile("^[A-Za-z][0-9A-Za-z]+@[A-Za-z]{2,}(\\.[A-Za-z]+)+$");
               if (e.matcher(emailNew).find()){
                   break;
               }else {
                   System.out.println("Email không hợp lệ. Mời nhập lại: ");
               }
           }
           if (findUserByEmail(users, emailNew) != null) {
               System.out.println("Email đã được sử dụng.");
           } else {
               user.setEmail(emailNew);
               System.out.println("Dổi email thành công.");
               System.out.println("Mời đăng nhập lại: ");
               login(sc,users);
           }
       }
   }
}
