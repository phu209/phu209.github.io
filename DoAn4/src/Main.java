
import entity.Customer;
import entity.Product;
import handle.MenuHandle;
import repository.CustomerReponsitory;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        MenuHandle menuHandle = new MenuHandle();

        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();

        menuHandle.mainMenu(sc,customers,products);

        /*CustomerReponsitory customerReponsitory = new CustomerReponsitory();
        customerReponsitory.importCustomer(customers);*/

    }
}