package view;

import java.util.Scanner;

public class Menu {
    public int menuSelectByPrice(Scanner sc){
        System.out.println("Bạn muốn tìm sản phẩm theo mức giá nào");

        System.out.println("--Menu--");
        System.out.println("1.Dưới 50000");
        System.out.println("2.Từ 50.000 đến dưới 100.000");
        System.out.println("3.Từ 100.000 trở lên");
        System.out.println("Mời bạn chọn: ");

        int option = Integer.parseInt(sc.nextLine());
        return option;
    }
}
