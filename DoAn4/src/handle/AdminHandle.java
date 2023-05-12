package handle;
import entity.Admin;
import entity.Customer;
import entity.Order;
import entity.Product;

import java.util.ArrayList;

public class AdminHandle {

    public void createAdmin(ArrayList<Admin> admins) {
        Admin admin = new Admin("admin123","admin123@gmail.com","Admin209");
        admins.add(admin);
    }

    public void addProduct() {

    }

    public void removeProduct(ArrayList<Product> products, int productId) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == productId) {
                products.remove(i);
                break;
            }
        }
    }

    public void viewOrders(ArrayList<Order> orders) {
        System.out.println("=== Orders ===");
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public void confirmOrder(Order order) {
        order.confirm();
    }

    public ArrayList<Order> getOrderHistory(Customer customer, ArrayList<Order> orders) {
        ArrayList<Order> orderHistory = new ArrayList<>();
        for (Order order : orders) {
            if (order.getCustomer().getUserName().equals(customer.getUserName())) {
                orderHistory.add(order);
            }
        }
        return orderHistory;
    }
}
