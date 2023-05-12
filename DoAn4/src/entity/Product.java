package entity;

public class Product {
    private int id;
    private String name;
    private String description;
    private String brand;
    private int quantity;
    private int price;

    public Product(int id, String name, String description, String brand, int quantity, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("\t %-5d %-37s %-60s %-18s %-10d %-5s",id,name,description,brand,quantity,price);
    }
}
