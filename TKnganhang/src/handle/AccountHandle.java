package handle;
import entity.Account;
import view.Menu;

import java.util.Scanner;
import java.util.regex.Pattern;
public class AccountHandle {
    Menu menu = new Menu();
    public Account inputAccount(Scanner sc) {
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        String accountNumber;
        while (true) {
            System.out.println("Nhập số tài khoản: ");
            accountNumber = sc.nextLine();
            Pattern a = Pattern.compile("^[0-9]+$");
            if (a.matcher(accountNumber).find()){
                break;
            }else {
                System.out.println("Số TK không hợp lệ. Mời nhập lại: ");
            }
        }
        String email;
        while (true){
            System.out.println("Nhập email: ");
            email = sc.nextLine();
            Pattern e = Pattern.compile("^[A-Za-z][0-9A-Za-z]+@[A-Za-z]{2,}(\\.[A-Za-z]+)+$");
            if (e.matcher(email).find()){
                break;
            }else {
                System.out.println("Email không hợp lệ. Mời nhập lại: ");
            }
        }
        return new Account(name, accountNumber, email,50);
    }

    public void recharge(Scanner sc, Account account) {
        double amount;
        do {
            System.out.println("Mời bạn nhập số số tiền muốn nạp: ");
            amount = Double.parseDouble(sc.nextLine());
            account.recharge(amount);
            System.out.println("Nạp thành công.");
            System.out.println("Thông tin tài khoản: ");
            account.displayInfor();
            menu.menuSelect(sc,account);
            if (amount < 0) System.out.println("Nhập số tiền không hợp lệ nhập lại: ");
        }while (amount < 0);
    }

    public void changeEmail(Scanner sc, Account account) {
        String email;
        Pattern e = Pattern.compile("^[A-Za-z][0-9A-Za-z]+@[A-Za-z]{2,}(\\.[A-Za-z]+)+$");
        do {
            System.out.println("Nhập email mới: ");
            email = sc.nextLine();
            account.changeEmail(email);
            System.out.println("Đổi email thành công");
            System.out.println("Thông tin tài khoản: ");
            account.displayInfor();
            menu.menuSelect(sc,account);
            if (!e.matcher(email).find()) System.out.println("Email mới không hợp lệ. Mời nhập lại: ");
        }while (!e.matcher(email).find());
    }
}
