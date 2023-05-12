package handle;
import entity.Customer;
import entity.Product;
import repository.ProductReponsitory;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ProductHandle {
    ProductReponsitory productReponsitory = new ProductReponsitory();
    private void viewMenuProduct(ArrayList<Product> products){
        productReponsitory.importProduct(products);
        /*System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("\t %-10s %-50s %-42s %-15s %-15s %-5s","ID","Điện thoại","Mô tả","Hãng","Số lượng","Giá\n");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");*/
    }
    public void viewByOppo(ArrayList<Product> products) {
        viewMenuProduct(products);
        for (Product product : products) {
            if (Objects.equals(product.getBrand(), "Oppo"))
                System.out.println(product);
        }
    }

    public void viewBySamsung(ArrayList<Product> products) {
        viewMenuProduct(products);
        for (Product product : products) {
            if (Objects.equals(product.getBrand(), "Samsung"))
                System.out.println(product);
        }
    }

    public void viewByXiaomi(ArrayList<Product> products) {
        viewMenuProduct(products);
        for (Product product : products) {
            if (Objects.equals(product.getBrand(), "Xiaomi"))
                System.out.println(product);
        }
    }

    public void viewByRealme(ArrayList<Product> products) {
        viewMenuProduct(products);
        for (Product product : products) {
            if (Objects.equals(product.getBrand(), "Realme"))
                System.out.println(product);
        }
    }

    public void viewByApple(ArrayList<Product> products) {
        viewMenuProduct(products);
        for (Product product : products) {
            if (Objects.equals(product.getBrand(), "Apple (iPhone)"))
                System.out.println(product);
        }
    }

    public Product findById(ArrayList<Product> products, int productId){
        viewMenuProduct(products);
        for (Product product : products) {
            if (product.getId() == productId){
                return product;
            }
        }return null;
    }


    public void addToCart(Scanner sc, ArrayList<Product>products,Customer customer){
        boolean checkStop = true;
        while (checkStop) {
            System.out.println("Mời nhập id sản phẩm: ");
            int productId = Integer.parseInt(sc.nextLine());
            Product product = findById(products,productId);
            if (product == null) {
                System.out.println("Không tìm thấy sản phẩm.");
            }else {
                int quantity;
                System.out.println("Mời nhập số lượng sản phẩm: ");
                quantity = Integer.parseInt(sc.nextLine());
                customer.addToCart(product,quantity);
                System.out.println("Đã thêm vào Card");
            }
            System.out.println("Do you want to continue? (Y/N)");
            String trl = sc.nextLine();
            if (trl.equalsIgnoreCase("Y")){
                checkStop = true;
            }else if (trl.equalsIgnoreCase("N"))
                checkStop = false;
        }
    }

    public void viewCart(Customer customer) {
        System.out.println(customer.getCart());
    }

}
