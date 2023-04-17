import entity.User;
import view.Menu;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        Menu menu = new Menu();
        menu.menuSelect(sc,users);
    }
}