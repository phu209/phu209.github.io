package view;

import entity.Product;
import handle.ProductHandle;

import java.util.Scanner;

public class Menu {
    public void menuSelect(Scanner sc, Product[] products){
        ProductHandle productHandle = new ProductHandle();
        boolean checkStop = true;
        do {
            System.out.println("---Menu---");
            System.out.println(
                    """
                            1 - Xem danh sách sản phẩm.
                            2 - Tìm sản phẩm theo tên.
                            3 - Tìm sản phẩm theo id.
                            4 - Tìm các sản phẩn có số lượng dưới 5.
                            5 - Tìm sản phẩm theo mức giá.
                            6 - Sắp xếp theo giá tăng dần.
                            7 - Exit.
                            """);
            System.out.println("Mời bạn lựa chọn:");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    productHandle.displayAllProduct(products);
                    break;
                case 2:
                    System.out.println("Nhập tên sản phẩm muốn tìm: ");
                    String findName = sc.nextLine();
                    productHandle.findProductByName(products, findName);
                    break;
                case 3:
                    System.out.println("Mời nhập id sản phẩm muốn tìm: ");
                    int id = Integer.parseInt(sc.nextLine());
                    productHandle.findById(sc, products,id);
                    break;
                case 4:
                    System.out.println("Các sản phẩm có số lượng < 5: ");
                    productHandle.findProduct5(products);
                    break;
                case 5:
                    menuSelectByPrice(sc,products);
                    break;
                case 6:
                    productHandle.sortByPrice(products);
                    break;
                case 7:
                    checkStop = false;
                    System.out.println("Tạm biệt!");
                    break;
            }
        }while (checkStop);
    }

    public void menuSelectByPrice(Scanner sc, Product[] products) {
        ProductHandle productHandle = new ProductHandle();
        System.out.println("Bạn muốn tìm sản phẩm theo mức giá nào:");
        System.out.println("1.Dưới 50000");
        System.out.println("2.Từ 50.000 đến dưới 100.000");
        System.out.println("3.Từ 100.000 trở lên");
        System.out.println("Mời bạn chọn: ");

        int option = Integer.parseInt(sc.nextLine());
        productHandle.filterByPrice(products,option);
    }
}
