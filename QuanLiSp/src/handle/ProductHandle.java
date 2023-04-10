package handle;

import entity.Product;

import java.util.Scanner;

public class ProductHandle {
    public static Product createProduct(Scanner sc, int i){
        System.out.println("Mời bạn nhập tên của sản phẩm thứ "+(i+1)+" : ");
        String name = sc.nextLine();
        System.out.println("Mời bạn mô tả sản phẩm: ");
        String descrip = sc.nextLine();
        System.out.println("Mời bạn nhập số lượng của sản phẩm: ");
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giá bán sản phẩm: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập đơn vị giá sản phẩm: ");
        String unit = sc.nextLine();
        Product product = new Product(name, descrip, quantity, price, unit);
        return product;
    }

    // Hiện tất cả thông tin sp
    public void displayAllProduct(Product[] products){
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    // Tìm sp theo tên
    public void findProductByName(Product[] products, String name){
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name))
                System.out.println(product);
        }
    }

    // Tìm sp theo Id
    public Product findById(Product[] products, int id){
        for (Product product : products) {
            if ((product.getId()) == id){
                return product;
            }
        }
        return null;
    }

    // Update số lượng sp qua Id
    public boolean updateProductById(Product product, int quanity){
        if (product == null) return false;
        else {
            product.setQuantity(quanity);
            return true;
        }
    }

    // Tìm sản phẩm có số lượng dưới 5
    public void findProduct5(Product[] products){
        for (Product product : products) {
            if (product.getQuantity() < 5) {
                System.out.println(product);
            }
        }
    }

    // Menu tìm sản phẩm theo giá
    public void filterByPrice(Product[] products, int option){
        for (Product product : products) {
            if (product.getPrice()<50000 && option == 1) System.out.println(product);
            else if (product.getPrice() > 50000 && product.getPrice()<100000 && option == 2) System.out.println(product);
            else if (product.getPrice() > 100000 && option == 3) System.out.println(product);
        }
    }
}
