package view;
import entity.Account;
import handle.AccountHandle;
import java.util.Scanner;
public class Menu {
    public void menuSelect(Scanner sc, Account account){
        AccountHandle accountHandle = new AccountHandle();
        boolean checkStop = true;
        int choice = 0;
        do {
            System.out.println();
            System.out.println("---MENU---");
            System.out.println("1.Nạp tiền.");
            System.out.println("2.Đổi email.");
            System.out.println("3.Thoát.");
            System.out.println("Mời bạn chọn: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (Exception e) {
                System.out.println("Nhập dữ liệu không đúng!!!");
            }
            switch (choice){
                case 1:
                    accountHandle.recharge(sc,account);
                    break;
                case 2:
                    accountHandle.changeEmail(sc,account);
                    break;
                case 3:
                    System.out.println("BYE.");
                    checkStop = false;
                    break;
                case 0:
                    System.out.println("Nhập dữ liệu không đúng!!!");
                    menuSelect(sc,account);
                    break;
            }
            if (choice <= 0 || choice > 3) System.out.println("Nhập dữ liệu không đúng!!!");
        }while (checkStop && choice < 0 || choice > 3);
    }
}
