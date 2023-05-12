package entity;
import java.util.ArrayList;
import java.util.Date;

public class Order {
    private static int autoId;
    private int id;
    private Customer customer;
    private ArrayList<CartItem> items;
    private int totalPrice;
    private Date date;
    private boolean confirmed = false;

    public Order(Customer customer, ArrayList<CartItem> items) {
        this.id = ++autoId;
        this.customer = customer;
        this.items = new ArrayList<>(items);
        this.totalPrice = customer.getCart().getTotalPrice();
        this.date = new Date();
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public Date getDate() {
        return date;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void confirm() {
        confirmed = true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Order #%d - %s\n", id, date));
        sb.append(customer).append("\n");
        for (CartItem item : items) {
            sb.append(item).append("\n");
        }
        sb.append("Total price: ").append(totalPrice).append(" VND");
        if (confirmed) {
            sb.append(" (confirmed)");
        } else {
            sb.append(" (unconfirmed)");
        }
        return sb.toString();
    }
}
