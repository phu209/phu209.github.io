package entity;

public class Product {
    private static int autoId;
    private int id;
    private String name;
    private String descrip;
    private int quantity;
    private double price;
    private  String unit;

    public Product(String name, String descrip, int quantity, double price, String unit) {
        this.id = ++autoId;
        this.name = name;
        this.descrip = descrip;
        this.quantity = quantity;
        this.price = price;
        this.unit = unit;
    }



    public Product() {
        this.id = ++autoId;
    }

    public int getId() {
        return id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescrip() {
        return descrip;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return "Sản phẩm thứ: " + id +
                " - tên: " + name+
                " - mô tả: " + descrip +
                " - số lượng: " + quantity +
                " - giá tiền: " + price +
                " - đơn vị tiền: " + unit;
    }
}
