
import entity.Account;
import handle.AccountHandle;
import view.Menu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AccountHandle accountHandle = new AccountHandle();
        Account account = accountHandle.inputAccount(sc);
        System.out.println("Thông tin tài khoản: ");
        account.displayInfor();

        Menu menu = new Menu();
        menu.menuSelect(sc,account);
    }
}