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

        for (int i = 0; i < n; i++) {
            Product product = ProductHandle.createProduct(sc,i);
            products[i] = product;
        }

        Menu menu = new Menu();
        menu.menuSelect(sc,products);

    }
}