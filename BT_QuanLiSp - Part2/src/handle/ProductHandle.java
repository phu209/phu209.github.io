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
        return new Product(name, descrip, quantity, price, unit);
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
            if (product.getName().contains(name))
                System.out.println(product);
        }
    }

    // Tìm sp theo Id và thay đổi số lượng sp
    public void findById(Scanner sc, Product[] products, int id){
        for (Product product : products) {
            if ((product.getId()) == id){
                System.out.println(product);
                System.out.println("Bạn có muốn update số lượng sản phẩm không: ");
                System.out.println("1.Có. ");
                System.out.println("2.Không. ");
                int options = Integer.parseInt(sc.nextLine());
                if (options == 1){
                    System.out.println("Mời bạn nhập số lượng sản phẩm muốn update: ");
                    int quanityNew = Integer.parseInt(sc.nextLine());
                    product.setQuantity(quanityNew);
                    System.out.println("Sản phẩm sau update số lượng");
                    System.out.println(product);
                } else if (options == 2) {
                    System.out.println("Thoát nè");
                }
            }
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

    // Menu find by price
    public void filterByPrice(Product[] products, int option){
        for (Product product : products) {
            if (product.getPrice()<50000 && option == 1) System.out.println(product);
            else if (product.getPrice() > 50000 && product.getPrice()<100000 && option == 2) System.out.println(product);
            else if (product.getPrice() > 100000 && option == 3) System.out.println(product);
        }
    }

    // sort by price
    public void sortByPrice(Product[] products){
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products.length-1; j++) {
                if (products[j].getPrice() > products[j+1].getPrice()){
                    Product temp = products[j];
                    products[j] = products[j+1];
                    products[j+1] = temp;
                }
            }
        }
        System.out.println("Sản phẩm sau sắp xếp: ");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
