package entity;

import java.util.ArrayList;

public class Customer {
    private static int autoId;
    private int id;
    private String userName;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private Cart cart = new Cart();

    public Customer(String userName, String email, String password, String phoneNumber, String address) {
        this.id = ++autoId;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Cart getCart() {
        return cart;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addToCart(Product product, int quantity) {
        cart.add(product, quantity);
    }

    public void clearCart() {
        cart.clear();
    }

    public Order placeOrder() {
        Order order = new Order(this, cart.getItems());
        clearCart();
        return order;
    }

    public ArrayList<Order> getOrderHistory(ArrayList<Order> orders) {
        ArrayList<Order> orderHistory = new ArrayList<>();
        for (Order order : orders) {
            if (order.getCustomer().getUserName().equals(getUserName())) {
                orderHistory.add(order);
            }
        }
        return orderHistory;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
