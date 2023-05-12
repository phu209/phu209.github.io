package entity;
import java.util.ArrayList;

public class Cart {
    private ArrayList<CartItem> items = new ArrayList<>();

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public void add(Product product, int quantity) {
        for (CartItem item : items) {
            if (item.getProduct().getId() == product.getId()) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public void remove(Product product) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getProduct().getId() == product.getId()) {
                items.remove(i);
                break;
            }
        }
    }

    public void clear() {
        items.clear();
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (CartItem item : items) {
            totalPrice += item.getProduct().getPrice() * item.getQuantity();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Cart ===\n");
        for (CartItem item : items) {
            sb.append(item).append("\n");
        }
        sb.append("Total price: ").append(getTotalPrice()).append(" VND");
        return sb.toString();
    }
}
