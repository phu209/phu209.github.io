package handle;
import entity.Customer;
import entity.Product;
import view.Menu;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerHandle {
    Menu menu = new Menu();

    public void creatCustomer(Scanner sc, ArrayList<Customer> customers, ArrayList<Product> products) {
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
        String phoneNumber;
        while (true){
            System.out.println("Nhập số điện thoại: ");
            phoneNumber = sc.nextLine();
            Pattern phone = Pattern.compile("^[0-9]{10}$");
            if (phone.matcher(phoneNumber).find()){
                break;
            }else {
                System.out.println("Số điện thoại không hợp lệ. Mời nhập lại: ");
            }
        }

        System.out.println("Nhập địa chỉ nơi ở: ");
        String address = sc.nextLine();

        boolean check = false;
        for (Customer customer : customers) {
            if (customer.getUserName().equals(userName) || customer.getEmail().equals(email)) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("Username hoặc email đã sử dụng mời nhập lại: ");
            creatCustomer(sc,customers,products);
        }else {
            Customer customer = new Customer(/*getNextId(customers),*/userName,email,password,phoneNumber,address);
            customers.add(customer);
            System.out.println(customers);
            System.out.println("Bạn đã đăng kí thành công. Mời đăng nhập: ");
            loginCustomer(sc,customers,products);
        }
    }

    public void loginCustomer(Scanner sc, ArrayList<Customer> customers, ArrayList<Product> products) {
        customers.add(new Customer("phungphu1","phungphu2092@gmail.com","Phubee209","0358909973","Hà Nội"));
        customers.add(new Customer("phu209","phungphu20920@gmail.com","Phubee209","0986754256","Hà Nội"));
        MenuHandle menuHandle = new MenuHandle();
        System.out.println("Mời bạn nhập username: ");
        String userName = sc.nextLine();
        System.out.println("Mời bạn nhập password: ");
        String password = sc.nextLine();
        for (Customer customer : customers){
            if (customer.getUserName() == userName && customer.getPassword() == password){
                System.out.println();
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("----------- ĐĂNG NHẬP THÀNH CÔNG ----------");
                System.out.println("Chào mừng "+userName+", bạn có thể thực hiện các công việc sau:");
                menuHandle.loginOk(sc,customers,products);
            }else if (customer.getUserName() == userName && customer.getPassword() != password) {
                System.out.println("Mật khẩu không đúng!");
                menuHandle.loginErrol(sc,customers,products);
            }else if (customer.getUserName() != userName && customer.getPassword() == password) {
                System.out.println("Kiểm tra lại username!");
                loginCustomer(sc,customers,products);
            }else if (customer.getUserName() != password && customer.getPassword() != password) {
                System.out.println("Tài khoản không tồn tại.");
                menuHandle.mainMenu(sc,customers,products);
            }
        }
    }

    public Customer findByEmail(ArrayList<Customer> customers, String email) {
        for (Customer customer : customers) {
            if (Objects.equals(customer.getEmail(),email)){
                return customer;
            }
        }return null;
    }

    //Quên mật khẩu
    public void forgotPassword(Scanner sc, Customer customer, ArrayList<Customer> customers, ArrayList<Product> products){
        if (customer == null){
            System.out.println("Tài khoản không tồn tại");
            menu.mainMenu();
        }else {
            changePassword(sc,customer,customers,products);
            System.out.println("Mời đăng nhập lại:");
            loginCustomer(sc,customers,products);
        }
    }

    //Đổi mật khẩu
    public void changePassword(Scanner sc, Customer customer, ArrayList<Customer> customers, ArrayList<Product> products){
        String passwordNew;
        while (true) {
            System.out.println("Nhập password mới (dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa): ");
            passwordNew = sc.nextLine();
            Pattern p = Pattern.compile("^[0-9A-Za-z]{7,15}$");
            Pattern p2 = Pattern.compile("^[0-9A-Za-z]*[A-Z]+[0-9A-Za-z]*");
            if (customer != null && p.matcher(passwordNew).find() && p2.matcher(passwordNew).find()) {
                break;
            } else {
                System.out.println("Password không hợp lệ. Mời nhập lại: ");
            }
        }
        customer.setPassword(passwordNew);
        System.out.println("Đổi mật khẩu thành công.");
        System.out.println("Mời đăng nhập lại:");
        loginCustomer(sc,customers,products);
    }

    public void changePhoneNumber(Scanner sc, Customer customer){
        String phoneNew;
        while (true){
            System.out.println("Nhập số điện thoại: ");
            phoneNew = sc.nextLine();
            Pattern phone = Pattern.compile("^[0-9]{10}$");
            if (phone.matcher(phoneNew).find()){
                break;
            }else {
                System.out.println("Số điện thoại không hợp lệ. Mời nhập lại: ");
            }
        }
        customer.setPhoneNumber(phoneNew);
        System.out.println("Đổi số điện thoại thành công.");
    }

    public void changeAddress(Scanner sc, Customer customer) {
        String addressNew = sc.nextLine();
        customer.setAddress(addressNew);
        System.out.println("Đổi địa chỉ thành công.");
    }

    public Customer findByUserName(ArrayList<Customer> customers, String userName) {
        for (Customer customer : customers) {
            if (customer.getUserName().equals(userName))
                return customer;
        }return null;
    }

    public void changeUserName(Scanner sc, ArrayList<Customer> customers, ArrayList<Product> products){
        for (Customer customer : customers) {
            System.out.println("Nhập username mới: ");
            String userNameNew = sc.nextLine();
            if (findByUserName(customers,userNameNew) != null) {
                System.out.println("Username đã tồn tại.");
            }else {
                customer.setUserName(userNameNew);
                System.out.println("Đổi username thành công.");
                System.out.println("Mời đăng nhập lại:");
                loginCustomer(sc,customers,products);
            }
        }
    }

    public void changeEmail(Scanner sc, ArrayList<Customer> customers, ArrayList<Product> products) {
        for (Customer customer : customers) {
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
            if (findByEmail(customers,emailNew) != null) {
                System.out.println("Email đã được sử dụng.");
            } else {
                customer.setEmail(emailNew);
                System.out.println("Dổi email thành công.");
                System.out.println("Mời đăng nhập lại: ");
                loginCustomer(sc,customers,products);
            }
        }
    }


    /*private int getNextId(ArrayList<Customer> customers) {
        int maxId = 0;
        for (Customer customer : customers) {
            int id = customer.getId();
            if (id > maxId) maxId = id;
        }return ++maxId;
    }*/
}
