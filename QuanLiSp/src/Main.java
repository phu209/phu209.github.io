import handle.ProductHandle;
import entity.Product;
import view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sản phẩm của bạn: ");
        int n = Integer.parseInt(sc.nextLine());
        Product[] products = new Product[n];

        ProductHandle productHandle = new ProductHandle();

        for (int i = 0; i < n; i++) {
            Product product = ProductHandle.createProduct(sc,i);
            products[i] = product;
        }

        // Hiện tất cả thông tin sp
        productHandle.displayAllProduct(products);

        // Find by name
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        String findName = sc.nextLine();
        productHandle.findProductByName(products, findName);

        // Find by id
        System.out.println("Mời bạn nhập id cần tìm để update số lượng: ");
        int id = Integer.parseInt(sc.nextLine());
        Product product = productHandle.findById(products,id);
        System.out.println(product);

        // Update số lượng sp qua Id
        System.out.println("Mời bạn nhập số lượng sản phẩm muốn update: ");
        int quanityNew = Integer.parseInt(sc.nextLine());
        boolean checkUpdate = productHandle.updateProductById(product, quanityNew);
        if (checkUpdate){
            System.out.println("Update thành công");
        } else {
            System.out.println("Không tìm sp update");
        }

        // Tìm sp < 5
        System.out.println("Các sản phẩm có số lượng < 5: ");
        productHandle.findProduct5(products);

        // Menu tìm sản phẩm theo giá
        Menu menu = new Menu();
        int option = menu.menuSelectByPrice(sc);
        productHandle.filterByPrice(products,option);
    }
}