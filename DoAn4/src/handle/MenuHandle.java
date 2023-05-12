package handle;
import entity.Customer;
import entity.Product;
import repository.ProductReponsitory;
import view.Menu;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuHandle {
    ProductReponsitory productReponsitory = new ProductReponsitory();
    ProductHandle productHandle = new ProductHandle();
    Menu menu = new Menu();
    int choice = 0;
    private void exceptionMenu(Scanner sc) {
        try {
            choice = Integer.parseInt(sc.nextLine());
        }catch (Exception e) {
            System.out.println("Nhập dữ liệu không đúng!!!");
        }
    }

    public void mainMenu(Scanner sc, ArrayList<Customer> customers, ArrayList<Product> products) {
        CustomerHandle customerHandle = new CustomerHandle();
        boolean checkStop = true;
        do {
            menu.mainMenu();
            exceptionMenu(sc);
            switch (choice) {
                case 1:
                    login(sc,customers,products);
                    break;
                case 2:
                    customerHandle.creatCustomer(sc,customers,products);
                    login(sc,customers,products);
                    break;
                case 3:
                    productView(sc,products);
                    break;
                case 4:
                    findProduct(sc);
                    break;
                case 5:
                    System.out.println("Mời nhập eamil đăng ký: ");
                    String email = sc.nextLine();
                    Customer customer = customerHandle.findByEmail(customers,email);
                    customerHandle.forgotPassword(sc,customer,customers,products);
                    break;
                case 6:
                    System.out.println("BYE!");
                    checkStop = false;
                    break;

            }if (choice < 0 || choice > 6) System.out.println("Nhập dữ liệu không đúng.");
        }while (checkStop || choice < 0 || choice > 6);
    }

    public void login(Scanner sc, ArrayList<Customer> customers, ArrayList<Product> products) {
        CustomerHandle customerHandle = new CustomerHandle();
        menu.login();
        exceptionMenu(sc);
        switch (choice) {
            case 1:
                customerHandle.loginCustomer(sc, customers,products);
                break;
            case 2:
                break;
            case 0:
                mainMenu(sc,customers,products);
                break;
        }if (choice < 0 || choice > 3) System.out.println("Nhập dữ liệu không đúng.");
    }

    public void loginOk(Scanner sc, ArrayList<Customer> customers, ArrayList<Product> products) {
        menu.loginOk();
        exceptionMenu(sc);
        switch (choice) {
            case 1:
                productView(sc,products);
                //buyProduct(sc,products,customers,customer);
                loginOk(sc,customers,products);
                break;
            case 2:
                findProduct(sc);
                //buyProduct(sc,products,customers,customer);
                loginOk(sc,customers,products);
                break;
            case 3:
                //productHandle.viewCart(customer);
                loginOk(sc,customers,products);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                login(sc,customers,products);
                break;

        }if (choice <= 0 || choice > 6) System.out.println("Nhập dữ liệu không đúng.");

    }

    public void loginErrol(Scanner sc, ArrayList<Customer> customers, ArrayList<Product> products) {
        CustomerHandle customerHandle = new CustomerHandle();
        menu.loginErrol();
        exceptionMenu(sc);
        switch (choice) {
            case 1:
                login(sc, customers, products);
                break;
            case 2:
                System.out.println("Mời nhập eamil đăng ký: ");
                String email = sc.nextLine();
                Customer customer = customerHandle.findByEmail(customers,email);
                customerHandle.forgotPassword(sc,customer,customers,products);
                break;
        }if (choice <= 0 || choice > 3) System.out.println("Nhập dữ liệu không đúng.");
    }

    public void productView(Scanner sc, ArrayList<Product> products) {
        menu.productView();
        exceptionMenu(sc);
        switch (choice) {
            case 1:
                productReponsitory.printProduct(products);
                break;
            case 2:
                viewByBrand(sc,products);
                break;
            case 0:
                break;
        }if (choice < 0 || choice > 3) System.out.println("Nhập dữ liệu không đúng.");
        System.out.println();
    }

    public void findProduct(Scanner sc) {
        menu.findProduct();
        exceptionMenu(sc);
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                break;
        }if (choice < 0 || choice > 3) System.out.println("Nhập dữ liệu không đúng.");
        System.out.println();
    }

    public void viewByBrand(Scanner sc, ArrayList<Product> products) {
        menu.viewByBrand();
        exceptionMenu(sc);
        switch (choice) {
            case 1:
                productHandle.viewByOppo(products);
                break;
            case 2:
                productHandle.viewBySamsung(products);
                break;
            case 3:
                productHandle.viewByXiaomi(products);
                break;
            case 4:
                productHandle.viewByRealme(products);
                break;
            case 5:
                productHandle.viewByApple(products);
                break;
            case 0:
                productView(sc,products);
                break;
        }if (choice < 0 || choice > 5) System.out.println("Nhập dữ liệu không đúng.");
        System.out.println();
    }

    public void buyProduct(Scanner sc, ArrayList<Product> products, ArrayList<Customer> customers, Customer customer){
        menu.buyProduct();
        exceptionMenu(sc);
        switch (choice) {
            case 1:
                productHandle.addToCart(sc,products,customer);
                break;
            case 2:
                productHandle.viewCart(customer);
                break;
            case 0:
                System.out.println();
                loginOk(sc,customers,products);
                break;
        }if (choice < 0 || choice > 3) System.out.println("Nhập dữ liệu không đúng.");
    }
}
